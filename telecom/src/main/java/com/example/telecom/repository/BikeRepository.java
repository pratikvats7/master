package com.example.telecom.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.telecom.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

	public Optional<Bike> findById(int id);
}