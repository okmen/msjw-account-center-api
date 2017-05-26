package cn.account.bean;

import java.io.Serializable;
/**
 * 车对象
 * @author Mbenben
 *
 */
public class Car implements Serializable{
	
	private String behindTheFrame4Digits; //车架后4位
	private String myNumberPlate; //车牌号
	private String plateType; //号牌类型
	private String mobilephone; //手机号
	private Integer isMySelf; // 是否本人 0-是、1-否
	
	public String getBehindTheFrame4Digits() {
		return behindTheFrame4Digits;
	}
	public void setBehindTheFrame4Digits(String behindTheFrame4Digits) {
		this.behindTheFrame4Digits = behindTheFrame4Digits;
	}
	public String getMyNumberPlate() {
		return myNumberPlate;
	}
	public void setMyNumberPlate(String myNumberPlate) {
		this.myNumberPlate = myNumberPlate;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public Integer getIsMySelf() {
		return isMySelf;
	}
	public void setIsMySelf(Integer isMySelf) {
		this.isMySelf = isMySelf;
	}
	
}
