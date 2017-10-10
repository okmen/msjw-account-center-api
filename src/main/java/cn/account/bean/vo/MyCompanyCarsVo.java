package cn.account.bean.vo;

import java.io.Serializable;

public class MyCompanyCarsVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String bindTime;               //绑定时间
	private String source;                 //来源
	private String licenseNumber;          //车牌号码
	private String numberPlate;            //号牌种类
	private String compulsoryScrapTime;    //强制报废期至
	private String status;                 //状态
	private String inspectionDate;         //审验日期
	private String serialNumber;           //流水号
	public String getBindTime() {
		return bindTime;
	}
	public void setBindTime(String bindTime) {
		this.bindTime = bindTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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
	public String getCompulsoryScrapTime() {
		return compulsoryScrapTime;
	}
	public void setCompulsoryScrapTime(String compulsoryScrapTime) {
		this.compulsoryScrapTime = compulsoryScrapTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInspectionDate() {
		return inspectionDate;
	}
	public void setInspectionDate(String inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	@Override
	public String toString() {
		return "MyCompanyCarsVo [bindTime=" + bindTime + ", source=" + source + ", licenseNumber=" + licenseNumber
				+ ", numberPlate=" + numberPlate + ", compulsoryScrapTime=" + compulsoryScrapTime + ", status=" + status
				+ ", inspectionDate=" + inspectionDate + ", serialNumber=" + serialNumber + "]";
	}
	
	
}
