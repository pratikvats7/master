package com.example.telecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.telecom.entity.Truck;

public interface TruckRepository extends JpaRepository<Truck, String> {

	public Truck findByModel(String model);
}