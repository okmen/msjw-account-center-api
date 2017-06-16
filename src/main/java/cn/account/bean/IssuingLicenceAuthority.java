package cn.account.bean;

import java.io.Serializable;

public class IssuingLicenceAuthority implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String longName;
	private String shortName;
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	@Override
	public String toString() {
		return "IssuingLicenceAuthority [longName=" + longName + ", shortName=" + shortName + "]";
	}
	
}
