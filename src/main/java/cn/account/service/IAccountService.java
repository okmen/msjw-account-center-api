package cn.account.service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.account.bean.Documentation;
import cn.account.bean.ElectronicPolicyBean;

import cn.account.bean.ReservationBean;


import cn.account.bean.ReadilyShoot;
import cn.account.bean.ResultOfReadilyShoot;
import cn.account.bean.UserBind;
import cn.account.bean.UserBindAlipay;
import cn.account.bean.WechatUserInfoBean;
import cn.account.bean.vo.AuthenticationBasicInformationVo;
import cn.account.bean.vo.BindCarVo;
import cn.account.bean.vo.BindDriverLicenseVo;
import cn.account.bean.vo.BindTheVehicleVo;
import cn.account.bean.vo.DriverLicenseInformationSheetVo;
import cn.account.bean.vo.DrivingLicenseVo;
import cn.account.bean.vo.ElectronicDriverLicenseVo;
import cn.account.bean.vo.LoginReturnBeanVo;
import cn.account.bean.vo.MotorVehicleInformationSheetVo;
import cn.account.bean.vo.MyBusinessVo;
import cn.account.bean.vo.MyDriverLicenseVo;
import cn.account.bean.vo.ReadilyShootVo;
import cn.account.bean.vo.ReauthenticationVo;
import cn.account.bean.vo.RegisterVo;
import cn.account.bean.vo.ResultOfBIndDriverLicenseVo;
import cn.account.bean.vo.UnbindTheOtherDriverUseMyCarVo;
import cn.account.bean.vo.UnbindVehicleVo;
import cn.account.bean.vo.UserBasicVo;
import cn.account.bean.vo.queryclassservice.CertificationProgressQueryVo;
import cn.account.bean.vo.queryclassservice.DriverLicenseBusinessVo;
import cn.account.bean.vo.queryclassservice.MakeAnAppointmentVo;
import cn.account.bean.vo.queryclassservice.MotorVehicleBusinessVo;
import cn.sdk.bean.BaseBean;

/**
 * @author suntao
 */
public interface IAccountService {
	/**
	 * 重置密码
	 * @param idCard 身份证
	 * @param userName 用户名
	 * @param mobile 手机号
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception
	 */
	
	
	public Map<String, String> resetPwd(String idCard,String userName,String mobile,String sourceOfCertification)throws Exception;
	/**
	 * 根据须知文档key查询
	 * @param noticeKey
	 * @return Documentation
	 * @throws Exception
	 */
	public Documentation getDocumentationByNoticeKey(String noticeKey)throws Exception;
	
	/**
	 * 插入微信用户信息
	 * @param wechatUserInfo
	 * @return 成功则返回纪录id，失败返回0
	 */
	int insertWechatUserInfo(WechatUserInfoBean wechatUserInfo);
    
	/**
	 * 通过id获取用户微信信息
	 * @param id
	 * @return
	 */
	WechatUserInfoBean getWechatUserInfoById(int id);
	
	/**
	 * 获取全部对象List
	 * @return
	 */
	List<WechatUserInfoBean> getAllWechatUserInfoBeanList();
	/**
	 * 查询用户基本信息接口
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源    A-移动APP 	C-微信	Z-支付宝		E-邮政		W-外网星火
	 * @param mobilephone
	 * @return
	 * @throws Exception
	 */
	public AuthenticationBasicInformationVo getAuthenticationBasicInformation(String identityCard,String sourceOfCertification,String mobilephone) throws Exception;
	/**
	 * 登录
	 * @param loginName 登录账号
	 * @param password 密码
	 * @param sourceOfCertification 认证来源(A 移动APP C微信  Z支付宝   E邮政  W外网星火)
	 * @param openId 登录的openId 支付宝openId、微信openId
	 * @param loginClient 登录的客户端类型 支付宝、微信等
	 * @return
	 * @throws Exception
	 */
	public LoginReturnBeanVo login(String loginName,String password,String sourceOfCertification,String openId,String loginClient) throws Exception;
	
	/**
	 * 登录
	 * @param alipayLogin 登录账号
	 * @param sourceOfCertification 认证来源(A 移动APP C微信  Z支付宝   E邮政  W外网星火)
	 * @param openId 登录的openId 支付宝openId、微信openId
	 * @return
	 * @throws Exception
	 */
	public LoginReturnBeanVo alipayLogin(String loginName,String sourceOfCertification,String openId) throws Exception;
	/**
	 * 
	 * @param loginName 登录名称
	 * @param sourceOfCertification 认证来源(A 移动APP C微信  Z支付宝   E邮政  W外网星火)
	 * @return 登录信息
	 * @throws Exception
	 */
	public LoginReturnBeanVo getLoginInfoByLoginName(String loginName,String sourceOfCertification) throws Exception;
	
	/**
	 * 获取机动车信息单
	 * @param identityCard 身份证号
	 * @return
	 */
	public MotorVehicleInformationSheetVo getMotorVehicleInformationSheet(String identityCard);
	/**
     * 提交机动车信息单
     * @param userName 姓名
     * @param identityCard 身份证号
     * @param mobilephone 联系电话 
     * @param provinceAbbreviation 车牌核发省简称 例如：粤
     * @param numberPlateNumber 号牌号码 例如：B701NR
     * @param plateType 车辆类型 例如:小型汽车
     * @param sourceOfCertification 认证来源 微信-C
     */
	public Map<String, String> commitMotorVehicleInformationSheet(String userName, String identityCard, String mobilephone,
			String provinceAbbreviation, String numberPlateNumber, String plateType,String sourceOfCertification)throws Exception;
	/**
	 * 获取驾驶证信息单
	 * @param identityCard 身份证号
	 * @return
	 */
	public DriverLicenseInformationSheetVo getDriverLicenseInformationSheet(String identityCard);
	/**
	 * 提交无车证明申请
	 * @param applyType 申请类型
	 * @param applyName 申请人姓名
	 * @param identityCard 申请人身份证号
	 * @param applyPhone 申请人联系电话
	 * @param sourceOfCertification 申请来源
	 * @return
	 * @throws Exception 
	 */
	public BaseBean addNoneCarCertification(String applyType, String applyName, String identityCard, String applyPhone, String sourceOfCertification) throws Exception;
	/**
	 * 提交安全事故信用申请
	 * @param applyType 申请类型
	 * @param applyName 申请人姓名
	 * @param identityCard 申请人身份证号
	 * @param applyPhone 申请人联系电话
	 * @param sourceOfCertification 申请来源
	 * @return
	 * @throws Exception 
	 */
	public BaseBean addSafeAccidentCredit(String applyType, String applyName, String identityCard, String applyPhone, String sourceOfCertification) throws Exception;
	/**
	 * 提交 代表驾驶人信息单/无车证明申请/驾驶人安全事故信用表
	 * @param applyType 申请类型（1代表驾驶人信息单；2代表机动车信息单 3代表无车证明申请；4代表驾驶人安全事故信用表）
	 * @param userName 姓名
	 * @param identityCard 身份证号
	 * @param mobilephone 联系电话
	 * @return
	 * @throws Exception 
	 */
	public Map<String, String> commitDriverLicenseInformationSheet(String applyType, String userName, String identityCard,String mobilephone,String sourceOfCertification) throws Exception;
	/**
	 * 用户中心-查询类服务-预约查询-机动车业务/驾驶证业务
	 * @param businessType 业务类型	1-机动车业务、2-驾驶证业务
	 * @param reservationNumber 预约编号
	 * @param identityCard 身份证号
	 * @return
	 */
	public MakeAnAppointmentVo getMakeAnAppointment(int businessType,String reservationNumber,String identityCard);
	/**
	 * 用户中心-查询类服务-预约取消-机动车业务/驾驶证业务
	 * @param businessType
	 * @param reservationNumber
	 * @param identityCard
	 */
	public void bookingCancellation(int businessType,String reservationNumber,String identityCard);
	/**
	 * 用户中心-查询类服务-认证进度查询(身份认证审核/自然人认证/公车注册/车辆绑定/驾驶证绑定)
	 * @param businessType
	 * @param identityCard
	 * @param serialNumber
	 * @param agencyCode
	 * @return
	 */
	public CertificationProgressQueryVo getCertificationProgressQuery(int businessType,String identityCard,String serialNumber,String agencyCode);
	/**
	 * 用户中心-查询类服务-业务办理进度查询-驾驶证业务
	 * @param identityCard 身份证号
	 * @return
	 */
	public List<DriverLicenseBusinessVo> getDriverLicenseBusiness(String identityCard);
	/**
	 * 用户中心-查询类服务-业务办理进度查询-机动车业务
	 * @param identityCard 身份证号
	 * @return
	 */
	public List<MotorVehicleBusinessVo> getMotorVehicleBusiness(String identityCard);
	/**
	 * 用户中心-电子驾驶证
	 * @param driverLicenseNumber 驾驶证号
	 * @param userName 姓名
	 * @param mobileNumber 申请手机号码
	 * @return
	 * @throws Exception 
	 */
	public ElectronicDriverLicenseVo getElectronicDriverLicense(String driverLicenseNumber, String userName,String mobileNumber,String sourceOfCertification) throws Exception;
	/**
	 * 用户中心-电子行驶证
	 * @param numberPlatenumber 号牌号码
	 * @param plateType 号牌种类
	 * @param mobileNumber 申请手机号码
	 * @return DrivingLicenseVo
	 */
	public DrivingLicenseVo getDrivingLicense(String numberPlatenumber, String plateType, String mobileNumber,String sourceOfCertification)throws Exception;
	/**
	 * 用户中心-我的驾驶证
	 * @param identityCard 身份证号
	 * @throws Exception 
	 */
	public MyDriverLicenseVo getMyDriverLicense(String identityCard,String sourceOfCertification) throws Exception;
	/**
	 * 查询已绑车辆
	 * @param identityCard 身份证
	 * @param mobilephone 手机号
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception 
	 */
	public List<BindTheVehicleVo> getBndTheVehicles(String identityCard,String mobilephone,String sourceOfCertification) throws Exception;
	
	/**
	 * 认证基本信息查询接口
	 * @param idCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception
	 */
	public AuthenticationBasicInformationVo authenticationBasicInformationQuery(String idCard,String sourceOfCertification) throws Exception;
	/**
	 * 获取机动车信息单
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception
	 */
	public MotorVehicleInformationSheetVo getMotorVehicleInformationSheet(String identityCard, String sourceOfCertification)throws Exception;
	/**
	 * 
	 * @param applyType
	 * @param identityCard
	 * @param sourceOfCertification
	 * @return
	 * @throws Exception 
	 */
	public Map<String, Object> queryMachineInformationSheet(String applyType, String identityCard,String sourceOfCertification) throws Exception;
	/**
	 * 我的业务(切换查询-机动车业务、驾驶证业务)
	 * @param businessType 业务类型		0-全部、1-机动车业务、2-驾驶证业务
	 * @param businessStatus	业务状态 		0-全部、1-办理中、2-已完结
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @return
	 * @throws Exception 
	 */
	public List<MyBusinessVo> getMyBusiness(Integer businessType, Integer businessStatus, String identityCard,String sourceOfCertification) throws Exception;
	/**
	 * 发送验证码
	 * @param mobilephone
	 */
	public void sendSMSVerificatioCode(String mobilephone,String valideteCode);
	/**
	 * 验证验证码是否正确
	 * @param mobilephone 手机号
	 * @param validateCode 短信验证码
	 * @param 0-验证成功，1-验证失败，2-验证码失效
	 */
	public int verificatioCode(String mobilephone,String validateCode);
	/**
	 * 手机号码在redis是否存在
	 * @param mobile
	 * @return
	 * @throws Exception
	 */
	public String isExistMobile(String mobile)throws Exception;
	
	/**
     * 限制一个手机号短信5秒发一次
     * @param mobilephone
     */
    public void sendSmsFreqLimit(String mobilephone);
    /**
     * 根据手机号+limit获取
     * @param mobilephone
     * @return
     */
    public String getSendSmsFreqLimit(String mobilephone);

    
	/**
	 * 取消绑定微信
	 * @author liuminkang
	 * @param userBind
	 * @return
	 */
	int unbindVehicle(UserBind userBind);
	
	
	/**
	* @Title: addVehicle
	* @author liuminkang
	* @Description: TODO(绑定车辆)
	* @param @return    设定文件
	* @return String    返回类型
	* @throws
	 */
	JSONObject addVehicle(BindCarVo bindCarVo)throws Exception;
	
	/**
	 * 
	 * @Title: updateUser 
	 * @author liuminkang
	 * @Description: TODO(修改个人资料) 
	 * @param userBasicVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:41
	 */
	JSONObject updateUser(UserBasicVo userBasicVo)throws Exception;
	
	/**
	 * 
	 * @Title: updateMobile 
	 * @author liuminkang
	 * @Description: TODO(修改手机号) 
	 * @param userBasicVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:46
	 */
	JSONObject updateMobile(UserBasicVo userBasicVo)throws Exception;
	
	/**
	 * 
	 * @Title: updatePwd 
	 * @author liuminkang
	 * @Description: TODO(修改密码) 
	 * @param userBasicVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:49
	 */
	JSONObject updatePwd(UserBasicVo userBasicVo)throws Exception;
	
	/**
	 * 
	 * @Title: readilyShoot 
	 * @author liuminkang
	 * @Description: TODO(随手拍举报) 
	 * @param readilyShootVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:52
	 */
	JSONObject  readilyShoot(ReadilyShootVo readilyShootVo)throws Exception;
	
	/**
	 * 
	 * @Title: iAmTheOwner 
	 * @author liuminkang
	 * @Description: TODO(车主认证) 
	 * @param registerVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:55
	 */
	JSONObject iAmTheOwner(RegisterVo registerVo) throws Exception;

	/**
	 * 
	 * @Title: iamALongtimeUser 
	 * @author liuminkang
	 * @Description: TODO(长期使用人认证) 
	 * @param registerVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:48:59
	 */
	JSONObject iamALongtimeUser(RegisterVo registerVo)throws Exception;
	
	/**
	 * 
	 * @Title: haveDriverLicenseNotCar 
	 * @author liuminkang
	 * @Description: TODO(有驾驶证无车认证) 
	 * @param registerVo
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月18日 下午7:49:03
	 */
    JSONObject haveDriverLicenseNotCar(RegisterVo registerVo)throws Exception;
	
    /**
     * 
     * @Title: isPedestrianNotDriver 
     * @author liuminkang
     * @Description: TODO(行人认证) 
     * @param registerVo
     * @return
     * @throws Exception    设定文件 
     * @return JSONObject    返回类型 
     * @date 2017年4月18日 下午7:49:06
     */
	JSONObject isPedestrianNotDriver(RegisterVo registerVo) throws Exception;


	/**
	 * 
	 * @Title: getPositioningAddress 
	 * @author liuminkang
	 * @Description: TODO(根据关键字获取地址信息) 
	 * @param keyword
	 * @return
	 * @throws Exception    设定文件 
	 * @return JSONObject    返回类型 
	 * @date 2017年4月20日 下午2:05:30
	 */
	JSONObject getPositioningAddress(String keyword)throws Exception;
	/**
	 * 违法行为的选择项目
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public JSONObject getTheChoiceOfIllegalActivities(String keyword) throws Exception;
	/**
	 * 电子保单查询
	 * @param idCard 身份证号
	 * @param mobileNumber 手机号
	 * @param licensePlateNumber 车牌号码
	 * @param licensePlateType 车辆类型
	 * @param sourceOfCertification 认证来源
	 * @param url
	 * @param method
	 * @param userId
	 * @param userPwd
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getElectronicPolicy(String idCard,String mobileNumber,String licensePlateNumber,String licensePlateType,String sourceOfCertification) throws Exception;



    /**
     * 取消预约
     * @param sourceOfCertification 认证来源 微信C 支付宝Z
     * @param reservationNo 预约编号
     * @return
     * @throws Exception
     */
	public Map<String, Object> cancelReservation(String sourceOfCertification,String reservationNo) throws Exception;
	/**
	 * 查询预约
	 * @param sourceOfCertification 认证来源 微信C 支付宝Z
	 * @param mobilephone 手机号
	 * @param validateCode 验证码
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> getReservation(String sourceOfCertification,String mobilephone,String validateCode) throws Exception;
	/**
	 * 预约
	 * @param sourceOfCertification 认证来源  微信C 支付宝Z
	 * @param mobilephone 手机号
	 * @param validateCode 验证码
	 * @param plateNumber 车牌号码
	 * @param plateType 号牌种类
	 * @param vehicleType 车辆类型
	 * @param fourDigitsAfterTheEngine 发动机后4位
	 * @param time 上午-am  下午-bm
	 * @param date 预约日期
	 * @param address 预约地点 	1-梅沙片区、2-大鹏半岛片区
	 * @return
	 * @throws Exception
	 */
	public Map<String, Object> Reservation(String sourceOfCertification,String mobilephone,String validateCode,String plateNumber,String plateType,String vehicleType,
    		String fourDigitsAfterTheEngine,String time,String date,String address) throws Exception;
	
	 /**
     * id 范围查询
     * @param startId
     * @param endId
     * @return
     */
	public List<UserBind> getBetweenAndId(String startId,String endId);
	/**
	 * 绑定时间范围查询
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public List<UserBind> getBetweenAndBindDate(String startDate,String endDate);




	
	/**
	 * 保存违法举报信息
	 */
	public int saveReadilyShoot(ReadilyShoot readilyShoot);

	/**
	 * 违法信息查询
	 * @param recordNumber 记录号码
	 * @param queryPassword 查询密码
	 * @return
	 * @throws Exception
	 */
	public ResultOfReadilyShoot queryResultOfReadilyShoot(String reportSerialNumber,String password) throws Exception;
	


	
	/**
	 * 绑定驾驶证
	 */
	public JSONObject bindDriverLicense(BindDriverLicenseVo bindDriverLicenseVo) throws Exception;
	
	/**
	 * 绑定驾驶证结果查询
	 * @param identityCard 身份证号
	 * @param userSource 用户来源
	 * @return
	 * @throws Exception 
	 */
	public ResultOfBIndDriverLicenseVo queryResultOfBindDriverLicense(String identityCard, String userSource) throws Exception;
	
	/**
	 * 提交驾驶证信息单
	  *@param applyType 申请类型（1代表驾驶人信息单；2代表机动车信息单 3代表无车证明申请；4代表驾驶人安全事故信用表）
	 * @param userName 申请人姓名（必须是星级用户姓名）
	 * @param idnetityCard 申请人身份证号码（必须是星级用户身份证号码）
	 * @param mobilephone 申请人联系电话（必须是星级用户联系电话）
	 * @param sourceOfCertification 申请来源（APP 传A，微信传C，支付宝传Z）
	*/
	public Map<String, String> submitApplicationForDriverInformation(String applyType, String applyName,
			String identityCard, String applyPhone, String sourceOfCertification) throws Exception;
	
	
	/**
		 * 提交机动车信息单打印申请
		  *@param applyType 申请类型（1代表驾驶人信息单；2代表机动车信息单 3代表无车证明申请；4代表驾驶人安全事故信用表）
		 * @param userName 申请人姓名（必须是星级用户姓名）
		 * @param idnetityCard 申请人身份证号码（必须是星级用户身份证号码）
		 * @param mobilephone 申请人联系电话（必须是星级用户联系电话）
		 * @param numberPlateNumber 号牌号码 
	     * @param plateType 号牌种类 例如 02-蓝牌
	     * @param sourceOfCertification 申请来源（APP 传A，微信传C，支付宝传Z）
	     * */
	public Map<String, String> submitApplicationForMotorVehicleInformation(String applyType, String applyName,
			String identityCard, String applyPhone, String licensePlateNumber,
			String plateType, String sourceOfCertification) throws Exception;
	
	
	/**
	 * 查询驾驶人信息单
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @param applyType 
	 */
	public Map<String, Object> queryScheduleOfDriverInformationList(String applyType, String identityCard,
			String sourceOfCertification) throws Exception;
	
	/**
	 * 查询机动车信息单
	 * @param identityCard 身份证
	 * @param sourceOfCertification 认证来源
	 * @param applyType 
	 */
	public Map<String, Object> queryScheduleOfMotorVehicleInformationList(String applyType, String identityCard,
			String sourceOfCertification) throws Exception;
	
	
	/**
	 * 车辆解绑
	 * @param unbindVehicleVo
	 * @return
	 */
	public Map<String, String> unbindVehicle(UnbindVehicleVo unbindVehicleVo) throws Exception;
	
	/**
	 * 车主解绑车辆其他驾驶人
	 * @param unbindVehicleVo
	 * @return
	 */
	public Map<String, String> unbindTheOtherDriverUseMyCar(UnbindTheOtherDriverUseMyCarVo unbindTheOtherDriverUseMyCarVo) throws Exception;
	
	/**
	 * 车主查询本人车辆绑定的其他驾驶人
	 * @param identityCard
	 * @param numberPlateNumber
	 * @param plateType
	 * @param sourceOfCertification
	 * @return
	 * @throws Exception 
	 */
	public Map<String, Object> getBindTheOtherDriversUseMyCar(String identityCard, String numberPlateNumber,
			String plateType, String sourceOfCertification) throws Exception;
	/**
	 * 路况查询
	 * @param sourceOfCertification
	 * @return
	 */
	public Map<String, Object> trafficQuery(String sourceOfCertification) throws Exception;
	/**
	 * 单条路况查询
	 * @param sourceOfCertification
	 * @return
	 */
	public Map<String, String> detailsTrafficQuery(String zjz, String sourceOfCertification)throws Exception;
	/**
	 * 重新认证
	 * @param reauthenticationVo
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> reauthentication(ReauthenticationVo reauthenticationVo) throws Exception;


}
