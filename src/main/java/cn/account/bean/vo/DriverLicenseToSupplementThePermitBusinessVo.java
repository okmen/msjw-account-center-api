package cn.account.bean.vo;

import java.io.Serializable;

/**
 * 驾驶证业务查询
 * @author Mbenben
 *
 */
public class DriverLicenseToSupplementThePermitBusinessVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String HBLX; //B：补证 H换证
	private String HJSZD; //户籍所在地
	private String  LYBZ; //来源标志
	private String SFZMHM;//身份证明号码
	private String SFZMMC;//身份证明名称
	private String SJRDZ;//收件人地址
	private String SJRSJ;//收件人手机
	private String SJRXM;//收件人姓名
	private String SQFS;// 1本人申请
	private String WSLRSJ;//申请时间
	private String WWLSH;//申请流水号
	private String XM;//姓名
	private String XPHZBH;//相片回执编号
	private String ZHCLSJ;//最后处理时间，含退办原因
	private String ZHCLSM;// 原因
	private String ZHCLZT;//(0待初审，3待初审，1初审通过，待制证，2车管已制证，TB退办)
	public String getHBLX() {
		return HBLX;
	}
	public void setHBLX(String hBLX) {
		HBLX = hBLX;
	}
	public String getHJSZD() {
		return HJSZD;
	}
	public void setHJSZD(String hJSZD) {
		HJSZD = hJSZD;
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
	public String getSFZMMC() {
		return SFZMMC;
	}
	public void setSFZMMC(String sFZMMC) {
		SFZMMC = sFZMMC;
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
	public String getWSLRSJ() {
		return WSLRSJ;
	}
	public void setWSLRSJ(String wSLRSJ) {
		WSLRSJ = wSLRSJ;
	}
	public String getWWLSH() {
		return WWLSH;
	}
	public void setWWLSH(String wWLSH) {
		WWLSH = wWLSH;
	}
	public String getXM() {
		return XM;
	}
	public void setXM(String xM) {
		XM = xM;
	}
	public String getXPHZBH() {
		return XPHZBH;
	}
	public void setXPHZBH(String xPHZBH) {
		XPHZBH = xPHZBH;
	}
	public String getZHCLSJ() {
		return ZHCLSJ;
	}
	public void setZHCLSJ(String zHCLSJ) {
		ZHCLSJ = zHCLSJ;
	}
	public String getZHCLSM() {
		return ZHCLSM;
	}
	public void setZHCLSM(String zHCLSM) {
		ZHCLSM = zHCLSM;
	}
	public String getZHCLZT() {
		return ZHCLZT;
	}
	public void setZHCLZT(String zHCLZT) {
		ZHCLZT = zHCLZT;
	}
	
	
}
