package cn.account.bean.vo;

import java.io.Serializable;

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
	
}
