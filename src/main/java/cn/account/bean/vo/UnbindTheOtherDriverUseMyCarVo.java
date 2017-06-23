package cn.account.bean.vo;

import java.io.Serializable;

public class UnbindTheOtherDriverUseMyCarVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String loginUser;//车主身份证号
	private String numberPlateNumber;//号牌号码
	private String plateType;//号牌种类
	private String IDcard;//其他驾驶人身份证号
	private String userSource;//认证来源
	private String sourceOfCertification;//获取途径
	
	@Override
	public String toString() {
		return "UnbindTheOtherDriverUseMyCarVo [loginUser=" + loginUser + ", numberPlateNumber=" + numberPlateNumber
				+ ", plateType=" + plateType + ", IDcard=" + IDcard + ", userSource=" + userSource
				+ ", sourceOfCertification=" + sourceOfCertification + "]";
	}
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getNumberPlateNumber() {
		return numberPlateNumber;
	}
	public void setNumberPlateNumber(String numberPlateNumber) {
		this.numberPlateNumber = numberPlateNumber;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getUserSource() {
		return userSource;
	}
	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	

}
