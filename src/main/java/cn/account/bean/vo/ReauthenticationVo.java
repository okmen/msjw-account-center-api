package cn.account.bean.vo;

import java.io.Serializable;

public class ReauthenticationVo implements Serializable{
	 /**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private String identityCard;// 身份证明号码
	private String mobilephone;// 移动电话
	private String authenticationType;// 认证类型
	private String sourceOfCertification;// （5重新认证）
	private String photo6;// 当事人手持身份证照片
	private String photo9;// 车主身份证正面照片
	private String openId;//openId
	

	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getAuthenticationType() {
		return authenticationType;
	}
	public void setAuthenticationType(String authenticationType) {
		this.authenticationType = authenticationType;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getPhoto6() {
		return photo6;
	}
	public void setPhoto6(String photo6) {
		this.photo6 = photo6;
	}
	public String getPhoto9() {
		return photo9;
	}
	public void setPhoto9(String photo9) {
		this.photo9 = photo9;
	}
	@Override
	public String toString() {
		return "ReauthenticationVo [identityCard=" + identityCard + ", mobilephone=" + mobilephone
				+ ", authenticationType=" + authenticationType + ", sourceOfCertification=" + sourceOfCertification
				+ ", photo6=" + photo6 + ", photo9=" + photo9 + "]";
	}
	
	
}
