package com.example.telecom.entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "bike")
public class Bike1 {

	@Column(value = "model")
	@PrimaryKeyColumn(type = PrimaryKeyType.PARTITIONED)
	private String model;

	@Column(value = "color")
	private String color;

	@Column(value = "license_plate")
	private String licensePlate;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Override
	public String toString() {
		return "CarDO [model=" + model + ", color=" + color + ", licensePlate=" + licensePlate + "]";
	}

	public Bike1(String model, String color, String licensePlate) {
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
	}

	public Bike1() {
	}
}
