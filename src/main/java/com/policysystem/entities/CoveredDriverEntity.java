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
@Table(name = "covered_drivers")
public class CoveredDriverEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "licenseNum")
	private String licenseNum;

	@Column(name = "licenseState")
	private String licenseState;

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

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getLicenseState() {
		return licenseState;
	}

	public void setLicenseState(String licenseState) {
		this.licenseState = licenseState;
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
		return "CoveredDriverEntity [id=" + id + ", licenseNum=" + licenseNum + ", licenseState=" + licenseState
				+ ", stat_isActive=" + stat_isActive + ", policyEntity=" + policyEntity + "]";
	}

}
