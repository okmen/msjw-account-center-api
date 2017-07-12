package cn.account.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 身份认证审核结果查询
 * @author Mbenben
 *
 */
public class IdentificationOfAuditResultsVo implements Serializable{
	
	private String RZLX; //认证  1车主本人2非车主本人3驾驶人
	private String SHSJ; //信息登记时间
	private String SHZT; //当前状态 	0待审核、1审核通过 、TB退办
	private String TBYY; //退办原因
	
	public String getRZLX() {
		return RZLX;
	}
	public void setRZLX(String rZLX) {
		RZLX = rZLX;
	}
	public String getSHSJ() {
		return SHSJ;
	}
	public void setSHSJ(String sHSJ) {
		SHSJ = sHSJ;
	}
	public String getSHZT() {
		return SHZT;
	}
	public void setSHZT(String sHZT) {
		SHZT = sHZT;
	}
	public String getTBYY() {
		return TBYY;
	}
	public void setTBYY(String tBYY) {
		TBYY = tBYY;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
}
