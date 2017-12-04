package cn.account.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 用户绑定信息
 * @author liuminkang
 *
 */
public class UserBindApp implements Serializable{

	private static final long serialVersionUID = 6269417708512714184L;
	
	private int id;
	private String appId;
	private String idCard;
	private String mobileNumber;
	private Date bindDate;
	private Date unbindDate;
	private int isBind;
	private String clientType;
	private String realName;
	
	
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
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override 
    public String toString() { 
       return ReflectionToStringBuilder.toString(this); 
    }
}
