package cn.account.bean.vo;

import java.io.Serializable;

public class UnbindVehicleVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String loginUser;//身份证明号码
	 private String licensePlateNumber;//车牌号码
	 private String licensePlateType;//车牌种类  	"01"=>"黄牌","02"=>"蓝牌","06"=>"黑牌"
	 private String identificationNO;//身份证明名称
	 private String IDcard;//身份证明号码
	 private String sourceOfCertification;//认证来源
	 private String jblx;//
	public String getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}
	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}
	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}
	public String getLicensePlateType() {
		return licensePlateType;
	}
	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}
	public String getIdentificationNO() {
		return identificationNO;
	}
	public void setIdentificationNO(String identificationNO) {
		this.identificationNO = identificationNO;
	}
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	public String getJblx() {
		return jblx;
	}
	public void setJblx(String jblx) {
		this.jblx = jblx;
	}
	@Override
	public String toString() {
		return "UnbindVehicleVo [loginUser=" + loginUser + ", licensePlateNumber=" + licensePlateNumber
				+ ", licensePlateType=" + licensePlateType + ", identificationNO=" + identificationNO + ", IDcard="
				+ IDcard + ", sourceOfCertification=" + sourceOfCertification + ", jblx=" + jblx + "]";
	}
	
	
}
