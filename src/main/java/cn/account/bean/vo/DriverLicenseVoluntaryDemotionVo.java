package cn.account.bean.vo;

import java.io.Serializable;

public class DriverLicenseVoluntaryDemotionVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String  businessType;//业务类型
	private String  identificationNO;//身份证明名称
	private String  loginUser;//认证用户身份证号
	private String  IDcard;//申请人身份证号
	private String  driverLicense;//驾驶证号码
	private String  name;//申请人姓名
	private String  photoReturnNumberString;//相片回执号
	private String  placeOfDomicile;//户籍所在地
	private String  receiverName;//收件人姓名
	private String  receiverNumber;//收件人号码
	private String  mailingAddress;//联系住所地址
	private String  ip;//ip
	private String  sourceOfCertification;//用户认证来源
	private String  userSource;//申请来源
	private String  IDCardPhoto1;//身份证正面图片
	private String  IDCardPhoto2;//身份证背面图片
	private String  driverLicensePhoto;//驾驶证图片
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getIdentificationNO() {
		return identificationNO;
	}
	public void setIdentificationNO(String identificationNO) {
		this.identificationNO = identificationNO;
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhotoReturnNumberString() {
		return photoReturnNumberString;
	}
	public void setPhotoReturnNumberString(String photoReturnNumberString) {
		this.photoReturnNumberString = photoReturnNumberString;
	}
	public String getPlaceOfDomicile() {
		return placeOfDomicile;
	}
	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile;
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
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
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
		return "DriverLicenseVoluntaryDemotionVo [businessType=" + businessType + ", identificationNO="
				+ identificationNO + ", loginUser=" + loginUser + ", IDcard=" + IDcard + ", driverLicense="
				+ driverLicense + ", name=" + name + ", photoReturnNumberString=" + photoReturnNumberString
				+ ", placeOfDomicile=" + placeOfDomicile + ", receiverName=" + receiverName + ", receiverNumber="
				+ receiverNumber + ", mailingAddress=" + mailingAddress + ", ip=" + ip + ", sourceOfCertification="
				+ sourceOfCertification + ", userSource=" + userSource + ", IDCardPhoto1=" + IDCardPhoto1
				+ ", IDCardPhoto2=" + IDCardPhoto2 + ", driverLicensePhoto=" + driverLicensePhoto + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
