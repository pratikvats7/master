package com.example.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.telecom.entity.Car;

public interface CarRepository extends JpaRepository<Car, String> {

	public Car findByModel(String model);
}