package cn.account.bean.vo;

import java.io.Serializable;

public class BrushFaceVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String identityCard;
    private String mobilephone;
	private String userSource;
	private String certificationType;
	private String photo6;
	private String openId;
	private String token;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public String getCertificationType() {
		return certificationType;
	}
	public void setCertificationType(String certificationType) {
		this.certificationType = certificationType;
	}
	public String getPhoto6() {
		return photo6;
	}
	public void setPhoto6(String photo6) {
		this.photo6 = photo6;
	}
	public String getOpenId() {
		return openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	@Override
	public String toString() {
		return "BrushFaceVo [name=" + name + ", identityCard=" + identityCard + ", mobilephone=" + mobilephone
				+ ", userSource=" + userSource + ", certificationType=" + certificationType + ", photo6=" + photo6
				+ ", openId=" + openId + ", token=" + token + "]";
	} 
	
}
