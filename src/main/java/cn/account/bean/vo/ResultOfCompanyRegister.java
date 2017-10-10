package cn.account.bean.vo;

import java.io.Serializable;

public class ResultOfCompanyRegister implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String inputTime;       //录入时间
	private String serialNumber;    //流水号
	private String status;          //审核状态
	private String applicantName;   //申请人姓名
	public String getInputTime() {
		return inputTime;
	}
	public void setInputTime(String inputTime) {
		this.inputTime = inputTime;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	@Override
	public String toString() {
		return "ResultOfCompanyRegister [inputTime=" + inputTime + ", serialNumber=" + serialNumber + ", status="
				+ status + ", applicantName=" + applicantName + "]";
	}
	
}
