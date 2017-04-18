package cn.account.bean.vo;

import java.io.Serializable;

/**
 * 我的业务切换查询Vo
 * @author Mbenben
 *
 */
public class MyBusinessVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//业务名称
	private String businessTitle;
	//车辆号码 例如 粤B701NR
	private String vehicleNumber;
	//受理时间
	private String receptionTime;
	//业务状态	0-全部、1-办理中、2-已完结
	private Integer status;
	//原始状态名称
	private String statusStr;
	//业务类型	0-全部、1-机动车业务、2-驾驶证业务
	private Integer businessType;
	//姓名
	private String userName;
	//身份证
	private String identityCard;
	//申请时间
	private String applicationTime;
	//号牌种类例如 蓝牌
	private String plateType;
	//具体业务 1、驾驶人信息单；2、机动车信息单；3、无车证明申请；4、驾驶人安全事故信用表；5、机动车行驶证；6、驾驶证
	private Integer detailedBusiness;
	
	public String getBusinessTitle() {
		return businessTitle;
	}
	public void setBusinessTitle(String businessTitle) {
		this.businessTitle = businessTitle;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getReceptionTime() {
		return receptionTime;
	}
	public void setReceptionTime(String receptionTime) {
		this.receptionTime = receptionTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	public Integer getDetailedBusiness() {
		return detailedBusiness;
	}
	public void setDetailedBusiness(Integer detailedBusiness) {
		this.detailedBusiness = detailedBusiness;
	}
	
}
