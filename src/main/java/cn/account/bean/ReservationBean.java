package cn.account.bean;

import java.io.Serializable;
/**
 * 预约
 * @author Mbenben
 *
 */
public class ReservationBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mobilephone; //手机号
	private String validateCode; //验证码
	private String plateNumber; //车牌号码
	private String plateType;//号牌种类
	private String vehicleType;//车辆类型
	private String fourDigitsAfterTheEngine;//发动机后4位
	private String time;//am-上午/bm-下午
	private String date;//2017.05.29
	private String address;//1-梅沙片区、2-大鹏半岛片区
	private String sourceOfCertification;// 微信C 支付宝Z
	private String reservationNo; //预约编号
	private String reservationStatus; //预约状态
	private String remainingPercentage; //剩余预约百分比
	
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getValidateCode() {
		return validateCode;
	}
	public void setValidateCode(String validateCode) {
		this.validateCode = validateCode;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getFourDigitsAfterTheEngine() {
		return fourDigitsAfterTheEngine;
	}
	public void setFourDigitsAfterTheEngine(String fourDigitsAfterTheEngine) {
		this.fourDigitsAfterTheEngine = fourDigitsAfterTheEngine;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getReservationNo() {
		return reservationNo;
	}
	public void setReservationNo(String reservationNo) {
		this.reservationNo = reservationNo;
	}
	public String getReservationStatus() {
		return reservationStatus;
	}
	public void setReservationStatus(String reservationStatus) {
		this.reservationStatus = reservationStatus;
	}
	public String getRemainingPercentage() {
		return remainingPercentage;
	}
	public void setRemainingPercentage(String remainingPercentage) {
		this.remainingPercentage = remainingPercentage;
	}
	
}
