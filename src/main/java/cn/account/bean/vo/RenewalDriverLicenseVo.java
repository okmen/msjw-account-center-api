package cn.account.bean.vo;

import java.io.Serializable;

public class RenewalDriverLicenseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;//业务类型
	private String name;//姓名
	private String identificationNO;//身份证明类型
	private String IDcard;//身份证号
	private String driverLicense;//驾驶证号
	
	private String fileNumber;//档案编号
	private String delayDate;//延期日期
	private String delayReason;//延期原因
	private String sourceOfCertification;//来源标志
	private String loginUser;//登录账户
	private String ip;//ip
	private String IDCardPhoto1;//身份证正面照片
	private String IDCardPhoto2;//身份证反面照片
	private String driverLicensePhoto;//驾驶证照片
	private String delayPhoto;//延期证明照片
	private String receiverName;//收件人姓名
	private String receiverNumber;//收件人号码
	
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getReceiverName() {
		return receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	public String getReceiverNumber() {
		return receiverNumber;
	}
	public void setReceiverNumber(String receiverNumber) {
		this.receiverNumber = receiverNumber;
	}
	public String getMailingAddress() {
		return mailingAddress;
	}
	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}
	private String mailingAddress;//收件人地址
	
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
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getDelayDate() {
		return delayDate;
	}
	public void setDelayDate(String delayDate) {
		this.delayDate = delayDate;
	}
	public String getDelayReason() {
		return delayReason;
	}
	public void setDelayReason(String delayReason) {
		this.delayReason = delayReason;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
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
	public String getDelayPhoto() {
		return delayPhoto;
	}
	public void setDelayPhoto(String delayPhoto) {
		this.delayPhoto = delayPhoto;
	}
	@Override
	public String toString() {
		return "RenewalDriverLicenseVo [businessType=" + businessType + ", name=" + name + ", identificationNO="
				+ identificationNO + ", IDcard=" + IDcard + ", driverLicense=" + driverLicense + ", fileNumber="
				+ fileNumber + ", delayDate=" + delayDate + ", delayReason=" + delayReason + ", sourceOfCertification="
				+ sourceOfCertification + ", loginUser=" + loginUser + ", ip=" + ip + ", IDCardPhoto1=" + IDCardPhoto1
				+ ", IDCardPhoto2=" + IDCardPhoto2 + ", driverLicensePhoto=" + driverLicensePhoto + ", delayPhoto="
				+ delayPhoto + ", receiverName=" + receiverName + ", receiverNumber=" + receiverNumber
				+ ", mailingAddress=" + mailingAddress + "]";
	}
	
	
	
	
}
