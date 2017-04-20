package cn.account.bean.vo;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 电子驾驶证
 * @author Mbenben
 *
 */
public class ElectronicDriverLicenseVo implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 电子驾驶证
	 */
	private String electronicDriverLicense;
	/**
	 * 电子驾驶证二维码
	 */
	private String electronicDriverLicenseQRCode;
	
	public String getElectronicDriverLicense() {
		return electronicDriverLicense;
	}
	public void setElectronicDriverLicense(String electronicDriverLicense) {
		this.electronicDriverLicense = electronicDriverLicense;
	}
	public String getElectronicDriverLicenseQRCode() {
		return electronicDriverLicenseQRCode;
	}
	public void setElectronicDriverLicenseQRCode(String electronicDriverLicenseQRCode) {
		this.electronicDriverLicenseQRCode = electronicDriverLicenseQRCode;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
}
