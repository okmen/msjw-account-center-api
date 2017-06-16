package cn.account.bean.vo;

import java.io.Serializable;

public class DriverLicenseIntoVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;//业务类型
	private String name;//姓名
	private String identificationNO;//身份证明类型
	private String IDcard;//身份证吗号码
	private String driverLicense;//驾驶证号码

	private String fileNumber;//档案编号
	private String issuingLicenceAuthority;//发证机关
	private String photoReturnNumberString;//相片回执编号
	private String receiverName;//收件人姓名
	private String receiverNumber;//收件人号码
	private String mailingAddress;//收件人地址
	private String sourceOfCertification;//认证来源
	private String loginUser;//登陆账户
	private String ip;//ip
	private String IDCardPhoto1;//身份证正面照片
	private String IDCardPhoto2;//身份证反面照片
	private String driverLicensePhoto;//驾驶证照片
	private String bodyConditionForm;//身体条件申请表
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
	public String getDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(String driverLicense) {
		this.driverLicense = driverLicense;
	}
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getIssuingLicenceAuthority() {
		return issuingLicenceAuthority;
	}
	public void setIssuingLicenceAuthority(String issuingLicenceAuthority) {
		this.issuingLicenceAuthority = issuingLicenceAuthority;
	}
	public String getPhotoReturnNumberString() {
		return photoReturnNumberString;
	}
	public void setPhotoReturnNumberString(String photoReturnNumberString) {
		this.photoReturnNumberString = photoReturnNumberString;
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
	public String getBodyConditionForm() {
		return bodyConditionForm;
	}
	public void setBodyConditionForm(String bodyConditionForm) {
		this.bodyConditionForm = bodyConditionForm;
	}
	@Override
	public String toString() {
		return "DriverLicenseIntoVo [businessType=" + businessType + ", name=" + name + ", identificationNO="
				+ identificationNO + ", IDcard=" + IDcard + ", driverLicense=" + driverLicense + ", fileNumber="
				+ fileNumber + ", issuingLicenceAuthority=" + issuingLicenceAuthority + ", photoReturnNumberString="
				+ photoReturnNumberString + ", receiverName=" + receiverName + ", receiverNumber=" + receiverNumber
				+ ", mailingAddress=" + mailingAddress + ", sourceOfCertification=" + sourceOfCertification
				+ ", loginUser=" + loginUser + ", ip=" + ip + ", IDCardPhoto1=" + IDCardPhoto1 + ", IDCardPhoto2="
				+ IDCardPhoto2 + ", driverLicensePhoto=" + driverLicensePhoto + ", bodyConditionForm="
				+ bodyConditionForm + "]";
	}
	
	
	
}
