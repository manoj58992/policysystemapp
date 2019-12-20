package com.policysystem.dtos;

import java.util.Date;

public class CustomerDTO {

	private Long id;
	private String name;
	private Long phone;
	private String email;
	private String gender;
	private String lastssn;
	private Date dob;

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

	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", phone=" + phone + ", email=" + email + ", gender=" + gender
				+ ", lastssn=" + lastssn + ", dob=" + dob + "]";
	}

}
