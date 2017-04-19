package cn.account.bean.vo;

import java.io.Serializable;


/**
 * 用户认证信息
 * @author liuminkang
 *
 */
public class RegisterVo implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 身份证明号码
	 */
	private String userIdCard;
	
	/**
	 * 联系电话
	 */
	private String mobilephone;
	
	/**
	 * 联系地址
	 */
	private String linkAddress;
	
	/**
	 * 车牌号码
	 */
	private String licensePlateNumber;
	
	/**
	 * 车牌种类
	 */
	private String licensePlateType;
	
	/**
	 * 车主姓名
	 */
	private String ownerName;
	
	/**
	 * 车主身份证明名称
	 */
	private String ownerIdName;
	
	/**
	 * 车主身份证明号码
	 */
	private String ownerIdCard;
	
	/**
	 * 车主联系电话
	 */
	private String ownerMobilephone;
	
	/**
	 * 认证类型
	 */
	private String certifiedType;
	
	/**
	 * 认证来源
	 */
	private String certifiedSource;
	
	/**
	 * 认证角色
	 */
	private String certifiedRole;
	
	/**
	 * 接口调用账户
	 */
	private String callAccount;
	
	/**
	 * 驾驶证核发地
	 */
	private String driverLicenseIssuedAddress;
	
	/**
	 * 车牌核发省
	 */
	private String provinceAbbreviation;
	
	/**
	 * 本人手持身份证图片
	 */
	private String idCardImgPositive;
	
	/**
	 * 本人身份证正面图片
	 */
	private String idCardImgHandHeld;
	
	/**
	 * 车主身份证正面
	 */
	private String ownerIdCardImgPositive;
	
	/**
	 * 车主手持身份证
	 */
	private String ownerIdCardImgHandHeld;

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
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

	public String getLicensePlateType() {
		return licensePlateType;
	}

	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerIdName() {
		return ownerIdName;
	}

	public void setOwnerIdName(String ownerIdName) {
		this.ownerIdName = ownerIdName;
	}

	public String getOwnerIdCard() {
		return ownerIdCard;
	}

	public void setOwnerIdCard(String ownerIdCard) {
		this.ownerIdCard = ownerIdCard;
	}

	public String getOwnerMobilephone() {
		return ownerMobilephone;
	}

	public void setOwnerMobilephone(String ownerMobilephone) {
		this.ownerMobilephone = ownerMobilephone;
	}

	public String getCertifiedType() {
		return certifiedType;
	}

	public void setCertifiedType(String certifiedType) {
		this.certifiedType = certifiedType;
	}

	public String getCertifiedSource() {
		return certifiedSource;
	}

	public void setCertifiedSource(String certifiedSource) {
		this.certifiedSource = certifiedSource;
	}

	public String getCertifiedRole() {
		return certifiedRole;
	}

	public void setCertifiedRole(String certifiedRole) {
		this.certifiedRole = certifiedRole;
	}

	public String getCallAccount() {
		return callAccount;
	}

	public void setCallAccount(String callAccount) {
		this.callAccount = callAccount;
	}

	public String getDriverLicenseIssuedAddress() {
		return driverLicenseIssuedAddress;
	}

	public void setDriverLicenseIssuedAddress(String driverLicenseIssuedAddress) {
		this.driverLicenseIssuedAddress = driverLicenseIssuedAddress;
	}

	public String getProvinceAbbreviation() {
		return provinceAbbreviation;
	}

	public void setProvinceAbbreviation(String provinceAbbreviation) {
		this.provinceAbbreviation = provinceAbbreviation;
	}

	public String getIdCardImgPositive() {
		return idCardImgPositive;
	}

	public void setIdCardImgPositive(String idCardImgPositive) {
		this.idCardImgPositive = idCardImgPositive;
	}

	public String getIdCardImgHandHeld() {
		return idCardImgHandHeld;
	}

	public void setIdCardImgHandHeld(String idCardImgHandHeld) {
		this.idCardImgHandHeld = idCardImgHandHeld;
	}

	public String getOwnerIdCardImgPositive() {
		return ownerIdCardImgPositive;
	}

	public void setOwnerIdCardImgPositive(String ownerIdCardImgPositive) {
		this.ownerIdCardImgPositive = ownerIdCardImgPositive;
	}

	public String getOwnerIdCardImgHandHeld() {
		return ownerIdCardImgHandHeld;
	}

	public void setOwnerIdCardImgHandHeld(String ownerIdCardImgHandHeld) {
		this.ownerIdCardImgHandHeld = ownerIdCardImgHandHeld;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
