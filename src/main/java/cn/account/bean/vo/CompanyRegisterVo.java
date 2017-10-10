package cn.account.bean.vo;

import java.io.Serializable;

public class CompanyRegisterVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String organizationCodeNumber;    //组织机构代码证号
	private String companyName;               //单位名称
	private String applicantIdentityCard;     //申请人申请人身份证号码
	private String applicantName;             //申请人姓名
	private String applicantMobilephone;      //申请人联系电话
	private String applicantAddress;          //申请人联系地址
	private String photo9;                    //身份证正面照片
	private String photo32;                   //组织机构代码证照片
	private String photo33;                   //申请人手持身份证正面和组织机构代码证照片
	private String sourceOfCertification;     //注册来源
	public String getOrganizationCodeNumber() {
		return organizationCodeNumber;
	}
	public void setOrganizationCodeNumber(String organizationCodeNumber) {
		this.organizationCodeNumber = organizationCodeNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getApplicantIdentityCard() {
		return applicantIdentityCard;
	}
	public void setApplicantIdentityCard(String applicantIdentityCard) {
		this.applicantIdentityCard = applicantIdentityCard;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getApplicantMobilephone() {
		return applicantMobilephone;
	}
	public void setApplicantMobilephone(String applicantMobilephone) {
		this.applicantMobilephone = applicantMobilephone;
	}
	public String getApplicantAddress() {
		return applicantAddress;
	}
	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}
	public String getPhoto9() {
		return photo9;
	}
	public void setPhoto9(String photo9) {
		this.photo9 = photo9;
	}
	public String getPhoto32() {
		return photo32;
	}
	public void setPhoto32(String photo32) {
		this.photo32 = photo32;
	}
	public String getPhoto33() {
		return photo33;
	}
	public void setPhoto33(String photo33) {
		this.photo33 = photo33;
	}
	public String getSourceOfCertification() {
		return sourceOfCertification;
	}
	public void setSourceOfCertification(String sourceOfCertification) {
		this.sourceOfCertification = sourceOfCertification;
	}
	@Override
	public String toString() {
		return "CompanyRegisterVo [organizationCodeNumber=" + organizationCodeNumber + ", companyName=" + companyName
				+ ", applicantIdentityCard=" + applicantIdentityCard + ", applicantName=" + applicantName
				+ ", applicantMobilephone=" + applicantMobilephone + ", applicantAddress=" + applicantAddress
				+ ", photo9=" + photo9 + ", photo32=" + photo32 + ", photo33=" + photo33 + ", sourceOfCertification="
				+ sourceOfCertification + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
