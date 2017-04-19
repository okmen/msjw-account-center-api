package cn.account.bean.vo;

import java.io.Serializable;

public class ReadilyShootVo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 申诉人姓名
	 */
	private String whistleblower;
	
	/**
	 * 申诉人联系电话
	 */
	private String mobilephone;
	
	/**
	 * 申诉人联系地址
	 */
	private String linkAddress;
	
	/**
	 * 申诉车号
	 */
	private String licensePlateNumber;
	
	/**
	 * 申诉内容
	 */
	private String situationStatement;
	
	/**
	 * 交款编号
	 */
	private String paymentNumber;
	
	/**
	 * 申诉类型 
	 */
	private String applyType;
	
	/**
	 * 违法时间
	 */
	private String illegalTime;
	
	/**
	 * 违法地点
	 */
	private String illegalSections;
	
	/**
	 * 执法单位
	 */
	private String enforcementDepartment;
	
	/**
	 *  申述来源
	 */
	private String userSource;
	
	/**
	 * 证据材料图片
	 */
	private String images;
	
	/**
	 * 星级用户登录身份证明号码
	 */
	private String userIdCard;
	
	/**
	 * 星级用户登陆账号 
	 */
	private String userNumber;

	public String getWhistleblower() {
		return whistleblower;
	}

	public void setWhistleblower(String whistleblower) {
		this.whistleblower = whistleblower;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getLinkAddress() {
		return linkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getSituationStatement() {
		return situationStatement;
	}

	public void setSituationStatement(String situationStatement) {
		this.situationStatement = situationStatement;
	}

	public String getPaymentNumber() {
		return paymentNumber;
	}

	public void setPaymentNumber(String paymentNumber) {
		this.paymentNumber = paymentNumber;
	}

	public String getApplyType() {
		return applyType;
	}

	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public String getIllegalTime() {
		return illegalTime;
	}

	public void setIllegalTime(String illegalTime) {
		this.illegalTime = illegalTime;
	}

	public String getIllegalSections() {
		return illegalSections;
	}

	public void setIllegalSections(String illegalSections) {
		this.illegalSections = illegalSections;
	}

	public String getEnforcementDepartment() {
		return enforcementDepartment;
	}

	public void setEnforcementDepartment(String enforcementDepartment) {
		this.enforcementDepartment = enforcementDepartment;
	}

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

	public String getImages() {
		return images;
	}

	public void setImages(String images) {
		this.images = images;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
