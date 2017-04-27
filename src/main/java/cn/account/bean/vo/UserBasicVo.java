package cn.account.bean.vo;

import java.io.Serializable;


/**
 * 用户基本信息
 * @author liuminkang
 *
 */
public class UserBasicVo implements Serializable {

	


	@Override
	public String toString() {
		return "UserBasicVo [identityCard=" + identityCard + ", nickname=" + nickname + ", mailingAddress="
				+ mailingAddress + ", IdCardValidityDate=" + IdCardValidityDate + ", userSource=" + userSource
				+ ", oldMobile=" + oldMobile + ", newMobile=" + newMobile + ", oldPwd=" + oldPwd + ", newPwd=" + newPwd
				+ "]";
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 身份证明号码
	 */
	private String identityCard;
	
	/**
	 * 昵称
	 */
	private String nickname;
	
	/**
	 * 通讯地址
	 */
	private String mailingAddress;
	
	
	/**
	 * 本人身份证正面图片
	 */
	private String idCardImgPositive;
	
	/**
	 * 本人身份证背面图片
	 */
	private String idCardImgNegative;
	
	/**
	 * 当事人手持身份证图片
	 */
	private String IdCardImgHandHeld;
		
	/**
	 *身份证有效期
	 */
	private String IdCardValidityDate;
	
	/**
	 * 用户来源
	 */
	private String userSource;
	
	/**
	 * 旧手机号码
	 */
	private String oldMobile;
	
	/**
	 * 新手机号码
	 */
	private String newMobile;
	
	/**
	 * 旧密码
	 */
	private String oldPwd;

	/**
	 * 新密码
	 */
	private String newPwd;
	
	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getMailingAddress() {
		return mailingAddress;
	}

	public void setMailingAddress(String mailingAddress) {
		this.mailingAddress = mailingAddress;
	}

	public String getIdCardImgPositive() {
		return idCardImgPositive;
	}

	public void setIdCardImgPositive(String idCardImgPositive) {
		this.idCardImgPositive = idCardImgPositive;
	}

	public String getIdCardImgNegative() {
		return idCardImgNegative;
	}

	public void setIdCardImgNegative(String idCardImgNegative) {
		this.idCardImgNegative = idCardImgNegative;
	}

	public String getIdCardImgHandHeld() {
		return IdCardImgHandHeld;
	}

	public void setIdCardImgHandHeld(String idCardImgHandHeld) {
		IdCardImgHandHeld = idCardImgHandHeld;
	}

	public String getIdCardValidityDate() {
		return IdCardValidityDate;
	}

	public void setIdCardValidityDate(String idCardValidityDate) {
		IdCardValidityDate = idCardValidityDate;
	}

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

	public String getOldMobile() {
		return oldMobile;
	}

	public void setOldMobile(String oldMobile) {
		this.oldMobile = oldMobile;
	}

	public String getNewMobile() {
		return newMobile;
	}

	public void setNewMobile(String newMobile) {
		this.newMobile = newMobile;
	}

	public String getOldPwd() {
		return oldPwd;
	}

	public void setOldPwd(String oldPwd) {
		this.oldPwd = oldPwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
