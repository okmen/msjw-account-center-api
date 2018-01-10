package cn.account.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import cn.sdk.bean.BaseBean;

/**
 * 驾驶证
 * @author Mbenben
 *
 */
public class MyDriverLicenseVo extends BaseBean implements Serializable{			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 档案编号
	 */
	private String fileNumber;
	/**
	 * 当前状态
	 */
	private String status;
	/**
	 * 可用计分
	 */
	private String availableScore;
	/**
	 * 体检日期
	 */
	private String physicalExaminationDate;
	/**
	 * 有效日期
	 */
	private String effectiveDate;
	/**
	 * 是否已领取电子驾照 0-是，1-否
	 */
	private Integer isReceive;
	/**
	 * 记分（扣分）
	 */
	private String deductScore;
	/**
	 * 准驾车型
	 */
	private String carType;
	/**
	 * 驾驶证号码
	 */
	private String driverLicenseNumber;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 性别
	 */
	private String gender;
	
	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}
	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDeductScore() {
		return deductScore;
	}
	public void setDeductScore(String deductScore) {
		this.deductScore = deductScore;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAvailableScore() {
		return availableScore;
	}
	public void setAvailableScore(String availableScore) {
		this.availableScore = availableScore;
	}
	public String getPhysicalExaminationDate() {
		return physicalExaminationDate;
	}
	public void setPhysicalExaminationDate(String physicalExaminationDate) {
		this.physicalExaminationDate = physicalExaminationDate;
	}
	public String getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Integer getIsReceive() {
		return isReceive;
	}
	public void setIsReceive(Integer isReceive) {
		this.isReceive = isReceive;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
}
