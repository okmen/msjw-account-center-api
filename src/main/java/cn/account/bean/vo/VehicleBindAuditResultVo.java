package cn.account.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 车辆绑定审核结果Vo
 * @author Mbenben
 *
 */
public class VehicleBindAuditResultVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7058085922821359361L;
	
	private String serialNo;	//采集流水
	private String plateNo;		//号牌号码
	private String plateType;	//号牌种类
	private String auditStatus;	//审核状态
	private String cancelReason;//退办原因
	
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getAuditStatus() {
		return auditStatus;
	}
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}
	public String getCancelReason() {
		return cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
