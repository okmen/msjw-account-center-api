package cn.account.bean.vo;

import java.io.Serializable;

public class BindDriverLicenseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 登录账户
	 */
	private String loginName;
	/**
	 * 用户来源
	 */
	private String userSource;
	/**
	 * 身份证号
	 */
	private String identityCard;
	/**
	 * 驾驶证核发地
	 */
	private String driverLicenseIssuedAddress;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 认证来源
	 */
	private String sourceOfCertification;
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getDriverLicenseIssuedAddress() {
		return driverLicenseIssuedAddress;
	}
	public void setDriverLicenseIssuedAddress(String driverLicenseIssuedAddress) {
		this.driverLicenseIssuedAddress = driverLicenseIssuedAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
}
