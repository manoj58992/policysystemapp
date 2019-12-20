package com.policysystem.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "number")
	private Long number;

	@Column(name = "type")
	private String type;

	@Column(name = "startdate")
	private Date startdate;

	@Column(name = "enddate")
	private Date enddate;

	@Column(name = "price")
	private Double price;

	@ManyToOne
	@JoinColumn(name = "customerid", referencedColumnName = "id")
	private CustomerEntity customerEntity;

	@OneToOne(mappedBy = "PolicyEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private CoveredDriverEntity driverEntity;

	@OneToOne(mappedBy = "PolicyEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private CoveredVehicleEntity vehicleEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public CoveredDriverEntity getDriverEntity() {
		return driverEntity;
	}

	public void setDriverEntity(CoveredDriverEntity driverEntity) {
		this.driverEntity = driverEntity;
	}

	public CoveredVehicleEntity getVehicleEntity() {
		return vehicleEntity;
	}

	public void setVehicleEntity(CoveredVehicleEntity vehicleEntity) {
		this.vehicleEntity = vehicleEntity;
	}



}
