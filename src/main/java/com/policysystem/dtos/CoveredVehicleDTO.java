package com.policysystem.dtos;

public class CoveredVehicleDTO {

	private String make;
	private String model;
	private int year;
	private String color;
	private String vin;
	private boolean stat_isActive;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public boolean isStat_isActive() {
		return stat_isActive;
	}

	public void setStat_isActive(boolean stat_isActive) {
		this.stat_isActive = stat_isActive;
	}

}
