package cn.account.bean.vo;

import java.io.Serializable;

import cn.sdk.bean.BaseBean;

public class ResultOfBIndDriverLicenseVo extends BaseBean implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String CID;//采集流水
	 private String JSZHM;//驾驶证号码
	 private String LJJF;//
	 private String SFZMHM;//身份证号码
	 private String SHZT;//审核状态
	 private String SYRQ;//
	 private String SYYXQZ;//
	 private String XB;//性别
	 private String XM;//姓名
	 private String YXQZ;//
	 private String ZJCX;//
	 private String  ZT;//
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getJSZHM() {
		return JSZHM;
	}
	public void setJSZHM(String jSZHM) {
		JSZHM = jSZHM;
	}
	public String getLJJF() {
		return LJJF;
	}
	public void setLJJF(String lJJF) {
		LJJF = lJJF;
	}
	public String getSFZMHM() {
		return SFZMHM;
	}
	public void setSFZMHM(String sFZMHM) {
		SFZMHM = sFZMHM;
	}
	public String getSHZT() {
		return SHZT;
	}
	public void setSHZT(String sHZT) {
		SHZT = sHZT;
	}
	public String getSYRQ() {
		return SYRQ;
	}
	public void setSYRQ(String sYRQ) {
		SYRQ = sYRQ;
	}
	public String getSYYXQZ() {
		return SYYXQZ;
	}
	public void setSYYXQZ(String sYYXQZ) {
		SYYXQZ = sYYXQZ;
	}
	public String getXB() {
		return XB;
	}
	public void setXB(String xB) {
		XB = xB;
	}
	public String getXM() {
		return XM;
	}
	public void setXM(String xM) {
		XM = xM;
	}
	public String getYXQZ() {
		return YXQZ;
	}
	public void setYXQZ(String yXQZ) {
		YXQZ = yXQZ;
	}
	public String getZJCX() {
		return ZJCX;
	}
	public void setZJCX(String zJCX) {
		ZJCX = zJCX;
	}
	public String getZT() {
		return ZT;
	}
	public void setZT(String zT) {
		ZT = zT;
	}
	 
	 
}
