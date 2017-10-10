package cn.account.bean.vo;

import java.io.Serializable;

public class BindCompanyCarVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loginUser;               //车辆管理人身份证号码
	private String sourceOfCertification;   //号牌种类
	private String provinceCode;            //车牌号码
	private String LicenseNumber;           //省份简称
	private String numberPlate;             //注册来源
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getProvinceCode() {
		return provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	@Override
	public String toString() {
		return "BindCompanyCarVo [loginUser=" + loginUser + ", sourceOfCertification=" + sourceOfCertification
				+ ", provinceCode=" + provinceCode + ", LicenseNumber=" + LicenseNumber + ", numberPlate=" + numberPlate
				+ "]";
	}
	
}
