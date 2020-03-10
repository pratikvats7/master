package com.example.telecom.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "SUV")
public class Car {

	@Column(name = "model")
	@NotNull(message = "Name can not be null!")
	@Id
	private String model;

	@Column(name = "color")
	private String color;

	@Column(name = "license_plate")
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

	public Car(String model, String color, String licensePlate) {
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
	}

	public Car() {
	}
}
