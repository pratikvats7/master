package com.example.telecom.controller;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.telecom.dto.CarDTO;
import com.example.telecom.entity.Bike;
import com.example.telecom.entity.Bike1;
import com.example.telecom.entity.Car;
import com.example.telecom.entity.Car1DO;
import com.example.telecom.entity.Truck;
import com.example.telecom.exceptions.CustomErrorTest;
import com.example.telecom.repository.Bike1Repository;
import com.example.telecom.repository.BikeRepository;
import com.example.telecom.repository.Car1Repository;
import com.example.telecom.repository.CarRepository;
import com.example.telecom.repository.TruckRepository;

@RestController
public class RestControllerExample {
	@Autowired
	public CarRepository carRepository;
	@Autowired
	public Car1Repository car1Repository;
	@Autowired
	private Environment env;
	@Autowired
	public BikeRepository bikeRepository;
	@Autowired
	public Bike1Repository bike1Repository;
	@Autowired
	public TruckRepository truckRepository;
	

	@ExceptionHandler(CustomErrorTest.class)
	public String exceptionHandler(CustomErrorTest e) {

		System.out.println("jiyen to jiyen   " + e.getMessage());
		System.out.println("from props   :   "+ env.getProperty(e.getMessage()));
		return null;
	}
	
	@ExceptionHandler(Exception.class)
	public String exceptionHandler2(Exception e) {

		System.out.println("jiyen to jiyen 2  " + e.getMessage());
		System.out.println("from props2   :   "+ env.getProperty(e.getMessage()));
		return null;
	}

	@GetMapping("/test/{name}")
	public String test1(@PathVariable String name) {
		return "hi  " + name + "  " + env.getProperty("app.title");
	}

	@GetMapping("/getCarJson/{name}")
	public Car test2(@PathVariable String name) throws Exception {
		Car car = carRepository.findByModel(name);
		if (car == null)
			throw new Exception("errorReadKar2");
		return car;

	}

	@PostMapping("/postCarJson")
	public CarDTO test2(@RequestBody Car car) {

		return new CarDTO("swift", "red", "kl", LocalDateTime.now());

	}

	@PostMapping("/storeCarJson")
	public CarDTO test3(@RequestBody Car car) {
		carRepository.save(car);
		return new CarDTO("swift", "red", "kl", LocalDateTime.now());

	}

	@PostMapping("/UpdateCarJson/{model}")
	public CarDTO test4(@RequestBody Car car, @PathVariable String model) throws Exception {
		Car car1 = carRepository.findByModel(model);
		if (car1 == null)
			throw new CustomErrorTest("errorReadKar");
		car1.setColor(car.getColor());
		carRepository.saveAndFlush(car1);
		return new CarDTO("swift", "red", "kl", LocalDateTime.now());

	}

	@PatchMapping("/UpdateCarJson/{model}")
	public Car test5(@RequestBody HashMap<String, Object> updates, @PathVariable String model) {
		Car car = carRepository.findByModel(model);

		updates.remove("model");
		updates.forEach((k, v) -> {
			// use reflection to get field k on object and set it to value v
			// Change Claim.class to whatver your object is: Object.class
			Field field = ReflectionUtils.findField(Car.class, k); // find field in the object class
			field.setAccessible(true);
			ReflectionUtils.setField(field, car, v); // set given field for defined object to value V
		});

		carRepository.save(car);
		return car;

	}
	
	@PostMapping("/storeCarJsonCassandra")
	public Car1DO test6(@RequestBody Car1DO car) {
		car1Repository.save(car);
		return car;

	}
	
	@PostMapping("/storeBike")
	public Bike test9(@RequestBody Bike bike) {
		bikeRepository.save(bike);
		return bike;

	}
	
	@PostMapping("/storeBikeCassandra")
	public Bike1 test10(@RequestBody Bike1 bike) {
		bike1Repository.save(bike);
		return bike;

	}
	
	@PostMapping("/storeTruck")
	public Truck test12(@RequestBody Truck truck) {
		truckRepository.save(truck);
		return truck;

	}

}