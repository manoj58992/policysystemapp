package com.policysystem.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "covered_vehicles")
public class CoveredVehicleEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "make")
	private String make;

	@Column(name = "model")
	private String model;

	@Column(name = "color")
	private String color;

	@Column(name = "vin")
	private String vin;

	@Column(name = "year")
	private int year;

	@Column(name = "stat_isActive")
	private Boolean stat_isActive;

	@OneToOne
	@JoinColumn(name = "policyid")

	private PolicyEntity policyEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Boolean getStat_isActive() {
		return stat_isActive;
	}

	public void setStat_isActive(Boolean stat_isActive) {
		this.stat_isActive = stat_isActive;
	}

	public PolicyEntity getPolicyEntity() {
		return policyEntity;
	}

	public void setPolicyEntity(PolicyEntity policyEntity) {
		this.policyEntity = policyEntity;
	}

	@Override
	public String toString() {
		return "CoveredVehicleEntity [id=" + id + ", make=" + make + ", model=" + model + ", color=" + color + ", vin="
				+ vin + ", year=" + year + ", stat_isActive=" + stat_isActive + ", policyEntity=" + policyEntity + "]";
	}

}
