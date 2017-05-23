package cn.account.bean;

import java.io.Serializable;

import cn.sdk.bean.BaseBean;

public class ResultOfReadilyShoot extends BaseBean implements Serializable{

	
	private static final long serialVersionUID = -7710764534045834999L;
	
	/**
	 * 违法地点
	 */
	private String illegalSections;
	
	/**
	 * 违法时间
	 */
	private String illegalTime;
	
	/**
	 * 情况说明
	 */
	private String situationStatement;
	
	/**
	 * 受理状态
	 */
	private String status;
	
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
	
	public String getIllegalSections() {
		return illegalSections;
	}

	public void setIllegalSections(String illegalSections) {
		this.illegalSections = illegalSections;
	}

	public String getIllegalTime() {
		return illegalTime;
	}

	public void setIllegalTime(String illegalTime) {
		this.illegalTime = illegalTime;
	}

	public String getSituationStatement() {
		return situationStatement;
	}

	public void setSituationStatement(String situationStatement) {
		this.situationStatement = situationStatement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

}
