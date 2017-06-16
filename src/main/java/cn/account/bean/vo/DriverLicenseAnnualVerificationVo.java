package cn.account.bean.vo;

import java.io.Serializable;

public class DriverLicenseAnnualVerificationVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;//业务类型
	private String IdentificationNO;//身份证明
	private String postalcode;//邮编号码
	private String name;//姓名
	private String IDcard;//身份证号
	private String mobilephone;//电话
	private String placeOfDomicile;//户籍所在地
	private String receiverName;//收件人姓名
	private String receiverNumber;//收件人号码
	private String  mailingAddress;//收件人地址
	private String IDCardPhoto1;//身份证正面照片
	private String IDCardPhoto2;//身份证反面照片
	private String livePhoto1;//居住证正面照片
	private String livePhoto2;//居住证反面照片
	private String educationDrawingtable;//审验教育培训表[图片]
	private String foreignersLiveTable;//境外人员临住表
	private String ip;//ip
	private String loginUser;//认证用户身份证号码
	private String sourceOfCertification;//认证来源
	private String userSource;//申报途径（A移动APP C微信Z支付宝E邮政）
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getIdentificationNO() {
		return IdentificationNO;
	}
	public void setIdentificationNO(String identificationNO) {
		IdentificationNO = identificationNO;
	}
	@Override
	public String toString() {
		return "DriverLicenseAnnualVerificationVo [businessType=" + businessType + ", IdentificationNO="
				+ IdentificationNO + ", postalcode=" + postalcode + ", name=" + name + ", IDcard=" + IDcard
				+ ", mobilephone=" + mobilephone + ", placeOfDomicile=" + placeOfDomicile + ", receiverName="
				+ receiverName + ", receiverNumber=" + receiverNumber + ", mailingAddress=" + mailingAddress
				+ ", IDCardPhoto1=" + IDCardPhoto1 + ", IDCardPhoto2=" + IDCardPhoto2 + ", livePhoto1=" + livePhoto1
				+ ", livePhoto2=" + livePhoto2 + ", educationDrawingtable=" + educationDrawingtable
				+ ", foreignersLiveTable=" + foreignersLiveTable + ", ip=" + ip + ", loginUser=" + loginUser
				+ ", sourceOfCertification=" + sourceOfCertification + ", userSource=" + userSource + "]";
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
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
	public String getLivePhoto1() {
		return livePhoto1;
	}
	public void setLivePhoto1(String livePhoto1) {
		this.livePhoto1 = livePhoto1;
	}
	public String getLivePhoto2() {
		return livePhoto2;
	}
	public void setLivePhoto2(String livePhoto2) {
		this.livePhoto2 = livePhoto2;
	}
	public String getEducationDrawingtable() {
		return educationDrawingtable;
	}
	public void setEducationDrawingtable(String educationDrawingtable) {
		this.educationDrawingtable = educationDrawingtable;
	}
	public String getForeignersLiveTable() {
		return foreignersLiveTable;
	}
	public void setForeignersLiveTable(String foreignersLiveTable) {
		this.foreignersLiveTable = foreignersLiveTable;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
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
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
}
