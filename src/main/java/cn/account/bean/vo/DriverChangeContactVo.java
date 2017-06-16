package cn.account.bean.vo;

import java.io.Serializable;

public class DriverChangeContactVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;//业务类型
	private String name;//姓名
	private String gender;//性别
	private String identificationNO;//身份证明名称
	private String IDcard;//身份证明号码
	private String driverLicense;//驾驶证号码
	private String mailingAddress;//联系住所地址
	private String mobilephone;//手机号码
	private String loginUser;//登录账户
	private String userSource;//申请来源
	private String ip;//ip
	private String IDCardPhoto1;//身份证正面照片
	private String IDCardPhoto2;//身份证反面照片
	private String driverLicensePhoto;//驾驶证照片
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getIdentificationNO() {
		return identificationNO;
	}
	public void setIdentificationNO(String identificationNO) {
		this.identificationNO = identificationNO;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getIDCardPhoto1() {
		return IDCardPhoto1;
	}
	public void setIDCardPhoto1(String iDCardPhoto1) {
		IDCardPhoto1 = iDCardPhoto1;
	}
	public String getIDCardPhoto2() {
		return IDCardPhoto2;
	}
	public void setIDCardPhoto2(String iDCardPhoto2) {
		IDCardPhoto2 = iDCardPhoto2;
	}
	public String getDriverLicensePhoto() {
		return driverLicensePhoto;
	}
	public void setDriverLicensePhoto(String driverLicensePhoto) {
		this.driverLicensePhoto = driverLicensePhoto;
	}
	@Override
	public String toString() {
		return "DriverChangeContactVo [businessType=" + businessType + ", name=" + name + ", gender=" + gender
				+ ", identificationNO=" + identificationNO + ", IDcard=" + IDcard + ", mailingAddress=" + mailingAddress
				+ ", mobilephone=" + mobilephone + ", loginUser=" + loginUser + ", userSource=" + userSource + ", ip="
				+ ip + ", IDCardPhoto1=" + IDCardPhoto1 + ", IDCardPhoto2=" + IDCardPhoto2 + ", driverLicensePhoto="
				+ driverLicensePhoto + "]";
	}
	
	
	
	
}
