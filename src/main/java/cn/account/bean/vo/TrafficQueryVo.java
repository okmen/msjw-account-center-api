package cn.account.bean.vo;

import java.io.Serializable;

public class TrafficQueryVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//事件编号
	private String roadName;//道路名称
	private String sectionName;//路段名称
	private String startUnitName;//拥堵起始路段
	private String endUnitName;//拥堵终止路段
	private String eventLevel;//拥堵级别
	private String eventReason;//拥堵原因
	private String summary;//详细情况说明
	private String startDate;//拥堵开始事件
	private String modifyDate;//更新时间
	private String gpsX;//经度
	private String gpsY;//纬度
	private String pic;//图文码
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRoadName() {
		return roadName;
	}
	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public String getStartUnitName() {
		return startUnitName;
	}
	public void setStartUnitName(String startUnitName) {
		this.startUnitName = startUnitName;
	}
	public String getEndUnitName() {
		return endUnitName;
	}
	public void setEndUnitName(String endUnitName) {
		this.endUnitName = endUnitName;
	}
	public String getEventLevel() {
		return eventLevel;
	}
	public void setEventLevel(String eventLevel) {
		this.eventLevel = eventLevel;
	}
	public String getEventReason() {
		return eventReason;
	}
	public void setEventReason(String eventReason) {
		this.eventReason = eventReason;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getGpsX() {
		return gpsX;
	}
	public void setGpsX(String gpsX) {
		this.gpsX = gpsX;
	}
	public String getGpsY() {
		return gpsY;
	}
	public void setGpsY(String gpsY) {
		this.gpsY = gpsY;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	@Override
	public String toString() {
		return "TrafficQueryVo [id=" + id + ", roadName=" + roadName + ", sectionName=" + sectionName
				+ ", startUnitName=" + startUnitName + ", endUnitName=" + endUnitName + ", eventLevel=" + eventLevel
				+ ", eventReason=" + eventReason + ", summary=" + summary + ", startDate=" + startDate + ", modifyDate="
				+ modifyDate + ", gpsX=" + gpsX + ", gpsY=" + gpsY + ", pic=" + pic + "]";
	}
	

}
