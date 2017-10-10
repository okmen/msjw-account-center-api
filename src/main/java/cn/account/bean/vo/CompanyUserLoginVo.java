package cn.account.bean.vo;

import java.io.Serializable;

public class CompanyUserLoginVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String organizationCodeNumber;    //单位组织机构代码证号
	private String companyName;               //单位名称
	private String managerIdentityCard;       //管理人身份证号
	private String managerName;               //管理人姓名
	private String managerMobilephone;        //管理人联系电话
	private String managerAddress;            //管理人联系地址
	private String status;                    //状态
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
	public String getManagerIdentityCard() {
		return managerIdentityCard;
	}
	public void setManagerIdentityCard(String managerIdentityCard) {
		this.managerIdentityCard = managerIdentityCard;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerMobilephone() {
		return managerMobilephone;
	}
	public void setManagerMobilephone(String managerMobilephone) {
		this.managerMobilephone = managerMobilephone;
	}
	public String getManagerAddress() {
		return managerAddress;
	}
	public void setManagerAddress(String managerAddress) {
		this.managerAddress = managerAddress;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CompanyUserLoginVo [organizationCodeNumber=" + organizationCodeNumber + ", companyName=" + companyName
				+ ", managerIdentityCard=" + managerIdentityCard + ", managerName=" + managerName
				+ ", managerMobilephone=" + managerMobilephone + ", managerAddress=" + managerAddress + ", status="
				+ status + "]";
	}
	
}
