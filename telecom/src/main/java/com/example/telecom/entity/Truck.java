package com.example.telecom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.example.telecom.util.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name = "truck")
public class Truck {

//	@Id
	// @GeneratedValue(generator = "sequence-generator")
//	@GeneratedValue(generator = "sequence-generator")
//	@GenericGenerator(name = "sequence-generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
//			@Parameter(name = "sequence_name", value = "user_sequence"),
//			@Parameter(name = "initial_value", value = "100"), @Parameter(name = "increment_size", value = "1"), })
//	@Column(name = "sl_no")

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	@GenericGenerator(name = "gen1", strategy = "com.example.telecom.util.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CID_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@Column(name = "sl_no")
	private String slNo;

	@Column(name = "model")
	@NotNull(message = "Name can not be null!")
	private String model;

	@Column(name = "color")
	private String color;

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq")
	@GenericGenerator(name = "book_seq", strategy = "com.example.telecom.util.StringPrefixedSequenceIdGenerator", parameters = {
			@Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CID_"),
			@Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })

	@Column(name = "reg_id")
	private String RedId;

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

	public Truck(String model, String color, String licensePlate) {
		this.model = model;
		this.color = color;
		this.licensePlate = licensePlate;
	}

	public Truck() {
	}
}
