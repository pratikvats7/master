package com.example.telecom.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.telecom.entity.Car;
import com.example.telecom.entity.Car1DO;

public interface Car1Repository extends CassandraRepository<Car1DO, String> {

	public Car findByModel(String model);
}