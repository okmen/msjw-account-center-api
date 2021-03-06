package cn.account.bean.vo;

import java.io.Serializable;
import java.util.List;

import cn.account.bean.Car;
import cn.sdk.bean.BaseBean;

/**
 * 登录返回的对象
 * @author Mbenben
 *
 */
public class LoginReturnBeanVo extends BaseBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 认证基本信息
	 */
	private AuthenticationBasicInformationVo authenticationBasicInformation;
	/**
	 * 档案编号
	 */
	private String fileNumber;
	
	private List<Car> cars;
	/**
	 * 身份认证审核结果
	 */
	private IdentityVerificationAuditResultsVo identityVerificationAuditResults;
	public AuthenticationBasicInformationVo getAuthenticationBasicInformation() {
		return authenticationBasicInformation;
	}
	public void setAuthenticationBasicInformation(AuthenticationBasicInformationVo authenticationBasicInformation) {
		this.authenticationBasicInformation = authenticationBasicInformation;
	}
	public IdentityVerificationAuditResultsVo getIdentityVerificationAuditResults() {
		return identityVerificationAuditResults;
	}
	public void setIdentityVerificationAuditResults(IdentityVerificationAuditResultsVo identityVerificationAuditResults) {
		this.identityVerificationAuditResults = identityVerificationAuditResults;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public String getFileNumber() {
		return fileNumber;
	}
	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}
	
}
