package cn.account.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 机动车业务
 * @author Mbenben
 *
 */
public class MotorVehicleBusiness implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FJSZD;//户籍所在地
	private String HPHM; //车牌号码
	private String HPZL;//车牌种类
	private String JDCSYR;//车主姓名
	private String LYBZ;//来源标志
	private String SFZMHM;//身份证明号码
	private String SJRDZ;//收件人地址
	private String SJRSJ;//收件人手机
	private String SJRXM;//收件人姓名
	private String SQFS;//1本人申请
	private String WWLSH;//申请流水号 111506151203
	private String YWLX;//1-补领机动车行驶证、2-机动车补检验合格、3-补领机动车牌号码、4-申请机动车临牌、5-换领机动车行驶证、6-机动车变更联系方式、
	private String ZHCLZT;//(0待初审，3待初审，1初审通过，待制证，2车管已制证，TB退办)
	private String ZSXXDZ;//住所详细地址
	
	public String getFJSZD() {
		return FJSZD;
	}
	public void setFJSZD(String fJSZD) {
		FJSZD = fJSZD;
	}
	public String getHPHM() {
		return HPHM;
	}
	public void setHPHM(String hPHM) {
		HPHM = hPHM;
	}
	public String getHPZL() {
		return HPZL;
	}
	public void setHPZL(String hPZL) {
		HPZL = hPZL;
	}
	public String getJDCSYR() {
		return JDCSYR;
	}
	public void setJDCSYR(String jDCSYR) {
		JDCSYR = jDCSYR;
	}
	public String getLYBZ() {
		return LYBZ;
	}
	public void setLYBZ(String lYBZ) {
		LYBZ = lYBZ;
	}
	public String getSFZMHM() {
		return SFZMHM;
	}
	public void setSFZMHM(String sFZMHM) {
		SFZMHM = sFZMHM;
	}
	public String getSJRDZ() {
		return SJRDZ;
	}
	public void setSJRDZ(String sJRDZ) {
		SJRDZ = sJRDZ;
	}
	public String getSJRSJ() {
		return SJRSJ;
	}
	public void setSJRSJ(String sJRSJ) {
		SJRSJ = sJRSJ;
	}
	public String getSJRXM() {
		return SJRXM;
	}
	public void setSJRXM(String sJRXM) {
		SJRXM = sJRXM;
	}
	public String getSQFS() {
		return SQFS;
	}
	public void setSQFS(String sQFS) {
		SQFS = sQFS;
	}
	public String getWWLSH() {
		return WWLSH;
	}
	public void setWWLSH(String wWLSH) {
		WWLSH = wWLSH;
	}
	public String getYWLX() {
		return YWLX;
	}
	public void setYWLX(String yWLX) {
		YWLX = yWLX;
	}
	public String getZHCLZT() {
		return ZHCLZT;
	}
	public void setZHCLZT(String zHCLZT) {
		ZHCLZT = zHCLZT;
	}
	public String getZSXXDZ() {
		return ZSXXDZ;
	}
	public void setZSXXDZ(String zSXXDZ) {
		ZSXXDZ = zSXXDZ;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
	
}
