package cn.account.bean.vo;

import java.io.Serializable;

public class ReadilyShootVo implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	
	/**
	 * 车牌号码
	 */
	private String licensePlateNumber;
	
	/**
	 * 车牌种类
	 */
	private String licensePlateType;
	
	
	/**
	 * 违法行为1
	 */
	private String illegalActivitieOne;
	
	/**
	 * 违法行为2
	 */
	private String illegalActivitieTwo;
	
	/**
	 * 违法行为3
	 */
	private String illegalActivitieThree;
	
	/**
	 * 违法地点
	 */
	private String illegalSections;
	
	/**
	 * 违法时间
	 */
	private String illegalTime;
	
	
	/**
	 * 录入人
	 */
	private String inputMan;
	
	/**
	 * 录入人姓名
	 */
	private String inputManName;
	

	
	/**
	 * 申诉人联系电话
	 */
	private String inputManPhone;
		
	/**
	 * 接口调用账户
	 */
	private String callAccount;
	
	/**
	 * 举报图片1
	 */
	private String reportImgOne;
	
	/**
	 * 举报图片2
	 */
	private String reportImgTwo;
	
	/**
	 * 举报图片3
	 */
	private String reportImgThree;
	
	/**
	 * 举报图片4
	 */
	private String reportImgFour;
	
	/**
	 * 举报图片5
	 */
	private String reportImgFive;
	
	/**
	 * 举报视频url
	 */
	private String reportVideoPath;

	/**
	 *  举报来源
	 */
	private String userSource;
	
	
	/**
	 * 身份证明号码
	 */
	private String userIdCard;
	
	/**
	 * 微信openid
	 */	
	private String openId;
	
	/**
	 * 支付宝id
	 */
	private String unionId;
	
	/**
	 *  是否实名 0  -非实名  1-实名认证过
	 */
	private int isRealName;
	
	/**
	 * 车载公司对应用户ID.规则：车载公司账号+本公司用户唯一编号
	 */
	private  String carCompanyId;

	/**
	 * 车载设备id
	 */
	private  String carEquipmentId;
	
	/**
	 * 银行卡号
	 */
	private String bankCardNumber;
		
	/**
	 * 银行开户行代码
	 */
	private String bankCode;
	
	/**
	 * 卡户银行
	 */
	private String bankName;
	
	/**
	 * 领奖方式
	 */
	private String AcceptWay;
	
	/**
	 * 备注
	 */
	private String note;
	/**
	 * 违法行为1
	 */
	private String wfxw1;
	/**
	 * 是否实名 0  -非实名  1-实名认证过
	 */
	private String shsm;
	/**
	 * 经度
	 */
	private String gpsx;
	/**
	 * 纬度
	 */
	private String gpsy;
	
	public String getGpsx() {
		return gpsx;
	}

	public void setGpsx(String gpsx) {
		this.gpsx = gpsx;
	}

	public String getGpsy() {
		return gpsy;
	}

	public void setGpsy(String gpsy) {
		this.gpsy = gpsy;
	}

	public String getLicensePlateNumber() {
		return licensePlateNumber;
	}

	public void setLicensePlateNumber(String licensePlateNumber) {
		this.licensePlateNumber = licensePlateNumber;
	}

	public String getLicensePlateType() {
		return licensePlateType;
	}

	public void setLicensePlateType(String licensePlateType) {
		this.licensePlateType = licensePlateType;
	}

	public String getIllegalActivitieOne() {
		return illegalActivitieOne;
	}

	public void setIllegalActivitieOne(String illegalActivitieOne) {
		this.illegalActivitieOne = illegalActivitieOne;
	}

	public String getIllegalActivitieTwo() {
		return illegalActivitieTwo;
	}

	public void setIllegalActivitieTwo(String illegalActivitieTwo) {
		this.illegalActivitieTwo = illegalActivitieTwo;
	}

	public String getIllegalActivitieThree() {
		return illegalActivitieThree;
	}

	public void setIllegalActivitieThree(String illegalActivitieThree) {
		this.illegalActivitieThree = illegalActivitieThree;
	}

	public String getIllegalSections() {
		return illegalSections;
	}

	public void setIllegalSections(String illegalSections) {
		this.illegalSections = illegalSections;
	}

	public String getIllegalTime() {
		return illegalTime;
	}

	public void setIllegalTime(String illegalTime) {
		this.illegalTime = illegalTime;
	}

	public String getInputMan() {
		return inputMan;
	}

	public void setInputMan(String inputMan) {
		this.inputMan = inputMan;
	}

	public String getInputManName() {
		return inputManName;
	}

	public void setInputManName(String inputManName) {
		this.inputManName = inputManName;
	}

	public String getInputManPhone() {
		return inputManPhone;
	}

	public void setInputManPhone(String inputManPhone) {
		this.inputManPhone = inputManPhone;
	}

	public String getCallAccount() {
		return callAccount;
	}

	public void setCallAccount(String callAccount) {
		this.callAccount = callAccount;
	}

	public String getReportImgOne() {
		return reportImgOne;
	}

	public void setReportImgOne(String reportImgOne) {
		this.reportImgOne = reportImgOne;
	}

	public String getReportImgTwo() {
		return reportImgTwo;
	}

	public void setReportImgTwo(String reportImgTwo) {
		this.reportImgTwo = reportImgTwo;
	}

	public String getReportImgThree() {
		return reportImgThree;
	}

	public void setReportImgThree(String reportImgThree) {
		this.reportImgThree = reportImgThree;
	}

	public String getReportImgFour() {
		return reportImgFour;
	}

	public void setReportImgFour(String reportImgFour) {
		this.reportImgFour = reportImgFour;
	}

	public String getReportImgFive() {
		return reportImgFive;
	}

	public void setReportImgFive(String reportImgFive) {
		this.reportImgFive = reportImgFive;
	}

	public String getReportVideoPath() {
		return reportVideoPath;
	}

	public void setReportVideoPath(String reportVideoPath) {
		this.reportVideoPath = reportVideoPath;
	}

	public String getUserSource() {
		return userSource;
	}

	public void setUserSource(String userSource) {
		this.userSource = userSource;
	}

	public String getUserIdCard() {
		return userIdCard;
	}

	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUnionId() {
		return unionId;
	}

	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}

	public int getIsRealName() {
		return isRealName;
	}

	public void setIsRealName(int isRealName) {
		this.isRealName = isRealName;
	}

	public String getCarCompanyId() {
		return carCompanyId;
	}

	public void setCarCompanyId(String carCompanyId) {
		this.carCompanyId = carCompanyId;
	}

	public String getCarEquipmentId() {
		return carEquipmentId;
	}

	public void setCarEquipmentId(String carEquipmentId) {
		this.carEquipmentId = carEquipmentId;
	}

	public String getBankCardNumber() {
		return bankCardNumber;
	}

	public void setBankCardNumber(String bankCardNumber) {
		this.bankCardNumber = bankCardNumber;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAcceptWay() {
		return AcceptWay;
	}

	public void setAcceptWay(String acceptWay) {
		AcceptWay = acceptWay;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getWfxw1() {
		return wfxw1;
	}

	public void setWfxw1(String wfxw1) {
		this.wfxw1 = wfxw1;
	}
	
	public String getShsm() {
		return shsm;
	}

	public void setShsm(String shsm) {
		this.shsm = shsm;
	}

	@Override
	public String toString() {
		return "ReadilyShootVo [licensePlateNumber=" + licensePlateNumber + ", licensePlateType=" + licensePlateType
				+ ", illegalSections=" + illegalSections + ", illegalTime=" + illegalTime + ", inputMan=" + inputMan
				+ ", inputManName=" + inputManName + ", inputManPhone=" + inputManPhone + ", callAccount=" + callAccount
				+ ", reportImgOne=" + "随手拍图片1不显示" + ", reportImgTwo=" + "随手拍图片2不显示" + ", reportImgThree="
				+ "随手拍图片3不显示" + ", reportImgFour=" + reportImgFour + ", reportImgFive=" + reportImgFive
				+ ", reportVideoPath=" + reportVideoPath + ", userSource=" + userSource + ", userIdCard=" + userIdCard
				+ ", openId=" + openId + ", unionId=" + unionId + ", isRealName=" + isRealName + ", carCompanyId="
				+ carCompanyId + ", carEquipmentId=" + carEquipmentId + ", bankCardNumber=" + bankCardNumber
				+ ", bankCode=" + bankCode + ", bankName=" + bankName + ", AcceptWay=" + AcceptWay + ", note=" + note
				+ "]";
	}


	
	

	

	

}
