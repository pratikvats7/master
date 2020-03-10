package com.example.telecom.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.telecom.entity.Bike1;

public interface Bike1Repository extends CassandraRepository<Bike1, String> {

	//public Bike1 findbyModel(String model);
}