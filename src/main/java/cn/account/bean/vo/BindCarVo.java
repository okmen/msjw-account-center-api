package cn.account.bean.vo;

import java.io.Serializable;



public class BindCarVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 登录用户身份证明号码
	 */
	private String userIdCard;

	/**
	 * 用户来源
	 */
	private String userSource;

	/**
	 * 号牌号码
	 */
	private String licensePlateNumber;

	/**
	 * 号牌种类
	 */
	private String licensePlateType;

	/**
	 * 车牌核发省简称
	 */
	private String provinceAbbreviation;

	/**
	 * 车架后4位
	 */
	private String frameNumber;

	/**
	 * 车主姓名
	 */
	private String ownerName;

	/**
	 * 车主身份证明号
	 */
	private String ownerIdCard;

	/**
	 * 是否本人0/1(本人)
	 */
	private int bindType;

	/**
	 * 录入IP
	 */
	private String inputIP;

	/**
	 * 认证来源
	 */
	private String certifiedSource;

	/**
	 * 车主身份证正面图像
	 */
	private String idCardImgPositive;

	/**
	 * 车主手持身份证图像
	 */
	private String idCardImgHandHeld;

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
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

	public String getProvinceAbbreviation() {
		return provinceAbbreviation;
	}

	public void setProvinceAbbreviation(String provinceAbbreviation) {
		this.provinceAbbreviation = provinceAbbreviation;
	}

	public String getFrameNumber() {
		return frameNumber;
	}

	public void setFrameNumber(String frameNumber) {
		this.frameNumber = frameNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getOwnerIdCard() {
		return ownerIdCard;
	}

	public void setOwnerIdCard(String ownerIdCard) {
		this.ownerIdCard = ownerIdCard;
	}

	public int getBindType() {
		return bindType;
	}

	public void setBindType(int bindType) {
		this.bindType = bindType;
	}

	public String getInputIP() {
		return inputIP;
	}

	public void setInputIP(String inputIP) {
		this.inputIP = inputIP;
	}

	public String getCertifiedSource() {
		return certifiedSource;
	}

	public void setCertifiedSource(String certifiedSource) {
		this.certifiedSource = certifiedSource;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
