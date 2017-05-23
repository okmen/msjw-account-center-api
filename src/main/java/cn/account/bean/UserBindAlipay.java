package cn.account.bean;

import java.io.Serializable;
import java.util.Date;

public class UserBindAlipay implements Serializable{
	private int id;
	private String userId;
	private String idCard;
	private String mobileNumber;
	private Date bindTime;
	private Date unBindTime;
	private int isBind;
	private String clientType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getBindTime() {
		return bindTime;
	}
	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}
	public Date getUnBindTime() {
		return unBindTime;
	}
	public void setUnBindTime(Date unBindTime) {
		this.unBindTime = unBindTime;
	}
	public int getIsBind() {
		return isBind;
	}
	public void setIsBind(int isBind) {
		this.isBind = isBind;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	@Override
	public String toString() {
		return "UserBindAlipay [id=" + id + ", userId=" + userId + ", idCard=" + idCard + ", mobileNumber="
				+ mobileNumber + ", bindTime=" + bindTime + ", unBindTime=" + unBindTime + ", isBind=" + isBind
				+ ", clientType=" + clientType + "]";
	}
	
}
