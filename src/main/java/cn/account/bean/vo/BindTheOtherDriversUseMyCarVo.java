package cn.account.bean.vo;

import java.io.Serializable;

public class BindTheOtherDriversUseMyCarVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String IDcard;
	private String mobilephone;
	private String name;
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BindTheOtherDriversUseMyCarVo [IDcard=" + IDcard + ", mobilephone=" + mobilephone + ", name=" + name
				+ "]";
	}
	
	
}
