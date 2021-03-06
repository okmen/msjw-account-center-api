package cn.account.bean.vo;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import cn.sdk.bean.BaseBean;

/**
 * 已绑定车辆
 * @author Mbenben
 *
 */
public class BindTheVehicleVo extends BaseBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<BindTheOtherDriversUseMyCarVo> list ;
	
	public List<BindTheOtherDriversUseMyCarVo> getList() {
		return list;
	}
	public void setList(List<BindTheOtherDriversUseMyCarVo> list) {
		this.list = list;
	}
	/**
	 * 号牌号码
	 */
	private String numberPlateNumber;
	/**
	 * 号牌种类
	 */
	private String plateType;
	/**
	 * 审验/年审日期
	 */
	private String annualReviewDate;
	/**
	 * 车主姓名
	 */
	private String name;
	/**
	 * 车主身份证号码
	 */
	private String identityCard;
	/**
	 * 是否本人
	 */
	private String isMyself;
	/**
	 * 审验/年审日期提醒
	 */
	private String annualReviewDateRemind;
	/**
	 * 手机号
	 */
	private String mobilephone;
	/**
	 * 未处理违法数量
	 */
	private String illegalNumber;
	/**
	 * 车辆是否有其他人使用
	 */
	private String otherPeopleUse;
	/**
	 * 车架后4位
	 */
	private String behindTheFrame4Digits;
	
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
	public String getAnnualReviewDate() {
		return annualReviewDate;
	}
	public void setAnnualReviewDate(String annualReviewDate) {
		this.annualReviewDate = annualReviewDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getIsMyself() {
		return isMyself;
	}
	public void setIsMyself(String isMyself) {
		this.isMyself = isMyself;
	}
	public String getAnnualReviewDateRemind() {
		return annualReviewDateRemind;
	}
	public void setAnnualReviewDateRemind(String annualReviewDateRemind) {
		this.annualReviewDateRemind = annualReviewDateRemind;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getIllegalNumber() {
		return illegalNumber;
	}
	public void setIllegalNumber(String illegalNumber) {
		this.illegalNumber = illegalNumber;
	}
	public String getOtherPeopleUse() {
		return otherPeopleUse;
	}
	public void setOtherPeopleUse(String otherPeopleUse) {
		this.otherPeopleUse = otherPeopleUse;
	}
	public String getBehindTheFrame4Digits() {
		return behindTheFrame4Digits;
	}
	public void setBehindTheFrame4Digits(String behindTheFrame4Digits) {
		this.behindTheFrame4Digits = behindTheFrame4Digits;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
}
