package cn.account.bean.vo;

import java.io.Serializable;

public class QueryInformationCollectionVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String licenseNumber;
	private String numberPlate;
	private String status;
	private String auditDescription;
	private String rfStatus;
	private String rfDescription;
	private String rfId;
	private String rfTime;
	private String address;
	private String issuingBrigade;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIssuingBrigade() {
		return issuingBrigade;
	}
	public void setIssuingBrigade(String issuingBrigade) {
		this.issuingBrigade = issuingBrigade;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAuditDescription() {
		return auditDescription;
	}
	public void setAuditDescription(String auditDescription) {
		this.auditDescription = auditDescription;
	}
	public String getRfStatus() {
		return rfStatus;
	}
	public void setRfStatus(String rfStatus) {
		this.rfStatus = rfStatus;
	}
	public String getRfDescription() {
		return rfDescription;
	}
	public void setRfDescription(String rfDescription) {
		this.rfDescription = rfDescription;
	}
	public String getRfId() {
		return rfId;
	}
	public void setRfId(String rfId) {
		this.rfId = rfId;
	}
	public String getRfTime() {
		return rfTime;
	}
	public void setRfTime(String rfTime) {
		this.rfTime = rfTime;
	}
	@Override
	public String toString() {
		return "QueryInformationCollectionVo [licenseNumber=" + licenseNumber + ", numberPlate=" + numberPlate
				+ ", status=" + status + ", auditDescription=" + auditDescription + ", rfStatus=" + rfStatus
				+ ", rfDescription=" + rfDescription + ", rfId=" + rfId + ", rfTime=" + rfTime + ", address=" + address
				+ ", issuingBrigade=" + issuingBrigade + "]";
	}
	
	
}
