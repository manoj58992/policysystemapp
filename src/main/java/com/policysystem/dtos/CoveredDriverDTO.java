package com.policysystem.dtos;

public class CoveredDriverDTO {

	private String licenseNum;
	private String licenseState;
	private boolean stat_isActive;

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

	public boolean isStat_isActive() {
		return stat_isActive;
	}

	public void setStat_isActive(boolean stat_isActive) {
		this.stat_isActive = stat_isActive;
	}

}
