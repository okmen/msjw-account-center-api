package cn.account.bean.vo;
/**
 * 信息单Vo
 * @author Mbenben
 *
 */
public class InformationSheetVo {
	/**
	 * 车牌号
	 */
	private String numberPlate;
	/**
	 * 号牌类型
	 */
	private String plateType;
	/**
	 * 图片
	 */
	private String photo;
	/**
	 * 身份证
	 */
	private String idCard;
	/**
	 * 状态代码
	 */
	private String statusCode;
	/**
	 * 申请时间
	 */
	private String applicationTime;
	/**
	 * 审核结果
	 */
	private String auditResults;
	/**
	 * 申请流水号
	 */
	private String applyForSerialNumber;
	/**
	 * 姓名
	 */
	private String name;
	public String getNumberPlate() {
		return numberPlate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	public String getPlateType() {
		return plateType;
	}
	public void setPlateType(String plateType) {
		this.plateType = plateType;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getApplicationTime() {
		return applicationTime;
	}
	public void setApplicationTime(String applicationTime) {
		this.applicationTime = applicationTime;
	}
	public String getAuditResults() {
		return auditResults;
	}
	public void setAuditResults(String auditResults) {
		this.auditResults = auditResults;
	}
	public String getApplyForSerialNumber() {
		return applyForSerialNumber;
	}
	public void setApplyForSerialNumber(String applyForSerialNumber) {
		this.applyForSerialNumber = applyForSerialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
