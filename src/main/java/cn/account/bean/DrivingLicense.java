package cn.account.bean;

import java.io.Serializable;
/**
 * 电子行驶证对象
 * @author Mbenben
 *
 */
public class DrivingLicense implements Serializable{
	
	private String numberPlatenumber; //车牌号码
	private String plateType; //车牌类型 01 02
	private String plateTypeName; //车牌类型名称
	private String mobileNumber; //手机号
	private String sourceOfCertification; //认证来源微信C 支付宝Z
	
	public String getNumberPlatenumber() {
		return numberPlatenumber;
	}
	public void setNumberPlatenumber(String numberPlatenumber) {
		this.numberPlatenumber = numberPlatenumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getPlateTypeName() {
		return plateTypeName;
	}
	public void setPlateTypeName(String plateTypeName) {
		this.plateTypeName = plateTypeName;
	}
	public DrivingLicense() {
	}
	public DrivingLicense(String plateType, String plateTypeName) {
		this.plateType = plateType;
		this.plateTypeName = plateTypeName;
	}
	
}
