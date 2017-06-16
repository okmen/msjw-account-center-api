package cn.account.bean.vo;

import java.io.Serializable;

public class RepairOrReplaceDriverLicenseVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String businessType;//业务类型
	private String repairReason;//补证原因
	private String identificationNO;//身份证明名称
	private String IDcard;//身份证明号码
	private String name;//姓名
	private String mobilephone;//电话
	private String IDCardPhoto1;//身份证正面图片
	private String IDCardPhoto2;//身份证背面图片
	private String photoReturnNumberString;//相片回执编号
	private String foreignersLiveTable;//境外人员临住表
	private String placeOfDomicile;//户籍所在地
	private String postalcode;//邮政编码
	private String receiverName;//收件人姓名
	private String receiverNumber;//收件人手机号码
	private String mailingAddress;//联系住所地址
	private String livePhoto1;//居住证正面图片
	private String livePhoto2;//居住证背面图片
	private String ip;//ip
	private String loginUser;//认证用户身份证号码
	private String sourceOfCertification;//认证来源
	private String userSource;//来源标志
	public String getBusinessType() {
		return businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
	public String getRepairReason() {
		return repairReason;
	}
	public void setRepairReason(String repairReason) {
		this.repairReason = repairReason;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
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
	public String getPhotoReturnNumberString() {
		return photoReturnNumberString;
	}
	public void setPhotoReturnNumberString(String photoReturnNumberString) {
		this.photoReturnNumberString = photoReturnNumberString;
	}
	public String getForeignersLiveTable() {
		return foreignersLiveTable;
	}
	public void setForeignersLiveTable(String foreignersLiveTable) {
		this.foreignersLiveTable = foreignersLiveTable;
	}
	public String getPlaceOfDomicile() {
		return placeOfDomicile;
	}
	public void setPlaceOfDomicile(String placeOfDomicile) {
		this.placeOfDomicile = placeOfDomicile;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
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
	@Override
	public String toString() {
		return "RepairOrReplaceDriverLicenseVo [businessType=" + businessType + ", repairReason=" + repairReason
				+ ", identificationNO=" + identificationNO + ", IDcard=" + IDcard + ", name=" + name + ", mobilephone="
				+ mobilephone + ", IDCardPhoto1=" + IDCardPhoto1 + ", IDCardPhoto2=" + IDCardPhoto2
				+ ", photoReturnNumberString=" + photoReturnNumberString + ", foreignersLiveTable="
				+ foreignersLiveTable + ", placeOfDomicile=" + placeOfDomicile + ", postalcode=" + postalcode
				+ ", receiverName=" + receiverName + ", receiverNumber=" + receiverNumber + ", mailingAddress="
				+ mailingAddress + ", livePhoto1=" + livePhoto1 + ", livePhoto2=" + livePhoto2 + ", ip=" + ip
				+ ", loginUser=" + loginUser + ", sourceOfCertification=" + sourceOfCertification + ", userSource="
				+ userSource + "]";
	}
	
	
	
}
