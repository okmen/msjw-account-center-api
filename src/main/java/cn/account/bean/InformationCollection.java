package cn.account.bean;

import java.io.Serializable;

public class InformationCollection implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private String password;
	private String jkId;
	private String licenseNumber;
	private String numberPlate;
	private String rfId;
	private String sourceOfCertification;
	private String loginUser;
	
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJkId() {
		return jkId;
	}
	public void setJkId(String jkId) {
		this.jkId = jkId;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getRfId() {
		return rfId;
	}
	public void setRfId(String rfId) {
		this.rfId = rfId;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	
}
