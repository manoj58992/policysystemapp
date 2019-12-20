package com.policysystem.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class CustomerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "phone")
	private Long phone;

	@Column(name = "email")
	private String email;

	@Column(name = "gender")
	private String gender;

	@Column(name = "lastssn")
	private String lastssn;

	@Column(name = "dob")
	private Date dob;

	@OneToMany(mappedBy = "customerEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<PolicyEntity> policyEntities;

	@OneToMany(mappedBy = "customerEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AddressEntity> addressEntities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastssn() {
		return lastssn;
	}

	public void setLastssn(String lastssn) {
		this.lastssn = lastssn;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<PolicyEntity> getPolicyEntities() {
		return policyEntities;
	}

	public void setPolicyEntities(List<PolicyEntity> policyEntities) {
		this.policyEntities = policyEntities;
	}

	public List<AddressEntity> getAddressEntities() {
		return addressEntities;
	}

	public void setAddressEntities(List<AddressEntity> addressEntities) {
		this.addressEntities = addressEntities;
	}

}
