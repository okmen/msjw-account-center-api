package cn.account.bean;

import java.io.Serializable;
import java.util.Date;

public class UserBind implements Serializable{

	private static final long serialVersionUID = 6269417708512714184L;
	
	private int id;
	private String openId;//微信用户在某公众号的唯一标识
	private String idCard;//身份证号
	private String mobileNumber; //手机号
	private int isBind;//绑定状态
	private Date bindDate;//绑定时间
	private Date unbindDate;//取绑时间
	private String clientType; //客户端类型 支付宝、微信等
	
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public int getIsBind() {
		return isBind;
	}
	public void setIsBind(int isBind) {
		this.isBind = isBind;
	}
	public Date getBindDate() {
		return bindDate;
	}
	public void setBindDate(Date bindDate) {
		this.bindDate = bindDate;
	}
	public Date getUnbindDate() {
		return unbindDate;
	}
	public void setUnbindDate(Date unbindDate) {
		this.unbindDate = unbindDate;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	
	
	
}
