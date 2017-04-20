package cn.account.bean.vo.queryclassservice;

import java.util.List;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 *用户中心-查询类服务-认证进度查询(身份认证审核/自然人认证/公车注册/车辆绑定/驾驶证绑定)
 * @author Mbenben
 *
 */
public class CertificationProgressQueryVo {
	private  IdentityVerificationAuditVo identityVerificationAudit;
	private List<IdentityVerificationAuditApartFromVo> identityVerificationAuditApartFromVos;
	public IdentityVerificationAuditVo getIdentityVerificationAudit() {
		return identityVerificationAudit;
	}
	public void setIdentityVerificationAudit(IdentityVerificationAuditVo identityVerificationAudit) {
		this.identityVerificationAudit = identityVerificationAudit;
	}
	public List<IdentityVerificationAuditApartFromVo> getIdentityVerificationAuditApartFromVos() {
		return identityVerificationAuditApartFromVos;
	}
	public void setIdentityVerificationAuditApartFromVos(
			List<IdentityVerificationAuditApartFromVo> identityVerificationAuditApartFromVos) {
		this.identityVerificationAuditApartFromVos = identityVerificationAuditApartFromVos;
	}
	@Override 
    public String toString() { 
            return ReflectionToStringBuilder.toString(this); 
    }
	
}
