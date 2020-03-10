package com.example.telecom.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class CarDTO {

	private String model;

	private String color;

	private String licensePlate;

	private LocalDateTime today;

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

	public LocalDateTime getToday() {
		return today;
	}

	public void setToday(LocalDateTime today) {
		this.today = today;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public CarDTO(String model, String color, String licensePlate, LocalDateTime today) {
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
		this.today = today;
	}

	public CarDTO() {
	}
}
