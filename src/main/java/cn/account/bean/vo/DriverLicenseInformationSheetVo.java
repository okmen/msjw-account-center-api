package cn.account.bean.vo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 驾驶证信息单
 * @author Mbenben
 *
 */
public class DriverLicenseInformationSheetVo {
	/**
	 * 姓名
	 */
	private String userName;
	/**
	 * 身份证号
	 */
	private String identityCard;
	/**
	 * 来联系电话
	 */
	private String mobilephone;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
	
	
}
