package cn.account.service;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.account.bean.UserBind;
import cn.account.bean.WechatUserInfoBean;
import cn.account.bean.vo.AuthenticationBasicInformationVo;
import cn.account.bean.vo.BindCarVo;
import cn.account.bean.vo.BindTheVehicleVo;
import cn.account.bean.vo.DriverLicenseInformationSheetVo;
import cn.account.bean.vo.DrivingLicenseVo;
import cn.account.bean.vo.ElectronicDriverLicenseVo;
import cn.account.bean.vo.LoginReturnBeanVo;
import cn.account.bean.vo.MotorVehicleInformationSheetVo;
import cn.account.bean.vo.MyDriverLicenseVo;
import cn.account.bean.vo.RegisterVo;
import cn.account.bean.vo.UserBasicVo;
import cn.account.bean.vo.queryclassservice.CertificationProgressQueryVo;
import cn.account.bean.vo.queryclassservice.DriverLicenseBusinessVo;
import cn.account.bean.vo.queryclassservice.MakeAnAppointmentVo;
import cn.account.bean.vo.queryclassservice.MotorVehicleBusinessVo;

/**
 * @author suntao
 */
public interface IAccountService {
	
	
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
	public Object getMyBusiness(Integer businessType, Integer businessStatus, String identityCard,String sourceOfCertification) throws Exception;
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
	
//	/**
//	 * 添加新用户
//	 * 
//	 * @param UserRegInfo userRegInfo
//	 * @return
//	 */
//	public UserRegInfo addNewUser(UserRegInfo userRegInfo);
//	
//	
//	/**
//     * 根据userId来获取accessToken
//     * 
//     * @param userId
//     * @return
//     */
//    public String getAccessTokenByUserId(long userId);
//
//    /**
//     * 获取缓存的加密accessToken和accessToken的对应关系
//     * 
//     * @param encyptAccessToken
//     * @return
//     */
//    public String getAccessTokenFromEncypt(String encyptAccessToken);
//
//    /**
//     * 插入加密accessToken和accessToken的对应关系
//     * 
//     * @param encyptAccessToken
//     * @param AccessToken
//     */
//    public void insertEncyptAccessToken(String encyptAccessToken, String AccessToken);
//    
//    /**
//     * 获取并插入Token
//     * @param userId
//     * @return
//     */
//    public Token getAccessToken(long userId);
//    
//    
//    /**
//     * 检查accessToken是否过期
//     * 
//     * @param accessToken
//     * @param userId
//     * @return 是否成功
//     */
//    public boolean isAccessTokenValidate(String accessToken, String userId);
//    
//    /**
//     * 根据refreshToken来获取accessToken
//     * 
//     * @param refreshToken
//     * @return 是否成功
//     */
//    public Map<String, String> getAccessTokenByRefreshToken(String userId, String refreshToken);
//    
//    /**
//     * 绑定微信
//     * 
//     * @param userOpenidBean
//     * @author shengfenglai
//     * @return long
//     */
//    public long  addBindOpenid(UserOpenidBean userOpenidBean);
//    
//    /**
//     * 取消绑定微信
//     * 
//     * @param userOpenidBean
//     * @author shengfenglai
//     * @return long 
//     */
//    public long cancelBindOpenid(UserOpenidBean userOpenidBean);
//    
//    /**
//     * 通过openid拿到userId
//     * @param openid
//     * @return userId
//     * @author shengfenglai
//     */
//    public long getUserIdByOpenid(String openid);
//    
//    /**
//     * 通过userId拿到openid
//     * @param userId 
//     * @return 
//     * @author shengfenglai
//     */
//    public String getOpenidByUserId(long userId);
//    
//    /**
//     * 获取DeviceBean
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @return
//     */
//    public DeviceBean getDevice(String deviceUuid,int osType);
//    
//    /**
//     * 记录设备号
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @param userId 用户id
//     */
//    public void addDevice(String deviceUuid,int osType,long userId);
//    
//    /**
//     * 更新cm_devices表的user_id
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @param userId 用户id
//     * @return
//     */
//    public boolean updateDevice(String deviceUuid,int osType,long userId);
//    
	
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
	
	
	JSONObject updateUser(UserBasicVo userBasicVo)throws Exception;
	
	
	JSONObject updateMobile(UserBasicVo userBasicVo)throws Exception;
	
	
	JSONObject updatePwd(UserBasicVo userBasicVo)throws Exception;
	
	JSONObject iAmTheOwner(RegisterVo registerVo) throws Exception;

	JSONObject isPedestrianNotDriver( String identityCard,String mobilephone,String idCardImgPositive,String idCardImgHandHeld) throws Exception;
	
	JSONObject iamALongtimeUser( String licensePlateType, String provinceAbbreviation,String licensePlateNumber, String ownerName
    		,String ownerIdCard, String userIdCard, String linkAddress,String mobilephone, String driverLicenseIssuedAddress
    		, String idCardImgPositive, String idCardImgHandHeld)throws Exception;
	
    JSONObject haveDriverLicenseNotCar(String identityCard, String linkAddress
    		 ,String mobilephone,String driverLicenseIssuedAddress,String idCardImgPositive
    		 ,String idCardImgHandHeld)throws Exception;
    
    JSONObject  readilyShoot(String illegalTime, String illegalSections    		
    		, String img, String situationStatement
    		, String whistleblower, String identityCard
    		, String mobilephone)throws Exception;

	

    
    
    
	
}
