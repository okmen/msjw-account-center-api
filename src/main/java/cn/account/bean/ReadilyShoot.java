package cn.account.bean;

import java.io.Serializable;
import java.util.Date;
/**
 * 违法举报结果
 * @author Mbenben
 *
 */
public class ReadilyShoot implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	/**
	 * 添加时间
	 */
	private Date addDate;
	/**
	 * 违法地点
	 */
	private String illegalSections;
	
	/**
	 * 违法时间
	 */
	private Date illegalTime;
	
	/**
	 * 情况说明
	 */
	private String situationStatement;
	
	/**
	 * 记录号码
	 */
	private String reportSerialNumber;
	
	/**
	 * 查询密码
	 */
	private String password;
	
	/**
	 * 违法图片1
	 */
	private String illegalImg1;
	
	/**
	 * 违法图片2
	 */
	private String illegalImg2;
	
	/**
	 * 违法图片3
	 */
	private String illegalImg3;
	
	/**
	 * 备注
	 */
	private String remark;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getIllegalSections() {
		return illegalSections;
	}

	public void setIllegalSections(String illegalSections) {
		this.illegalSections = illegalSections;
	}



	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Date getIllegalTime() {
		return illegalTime;
	}

	public void setIllegalTime(Date illegalTime) {
		this.illegalTime = illegalTime;
	}

	public String getSituationStatement() {
		return situationStatement;
	}

	public void setSituationStatement(String situationStatement) {
		this.situationStatement = situationStatement;
	}

	public String getReportSerialNumber() {
		return reportSerialNumber;
	}

	public void setReportSerialNumber(String reportSerialNumber) {
		this.reportSerialNumber = reportSerialNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIllegalImg1() {
		return illegalImg1;
	}

	public void setIllegalImg1(String illegalImg1) {
		this.illegalImg1 = illegalImg1;
	}

	public String getIllegalImg2() {
		return illegalImg2;
	}

	public void setIllegalImg2(String illegalImg2) {
		this.illegalImg2 = illegalImg2;
	}

	public String getIllegalImg3() {
		return illegalImg3;
	}

	public void setIllegalImg3(String illegalImg3) {
		this.illegalImg3 = illegalImg3;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "ReadilyShoot [id=" + id + ", addDate=" + addDate + ", illegalSections=" + illegalSections
				+ ", illegalTime=" + illegalTime + ", situationStatement=" + situationStatement
				+ ", reportSerialNumber=" + reportSerialNumber + ", password=" + password + ", illegalImg1="
				+ illegalImg1 + ", illegalImg2=" + illegalImg2 + ", illegalImg3=" + illegalImg3 + ", remark=" + remark
				+ "]";
	}

	
}
