package cn.account.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import cn.account.bean.DrivingLicense;
import cn.account.bean.vo.ReadilyShootVo;

/**
 * 提供给第三方调用的dubbo服务
 * @author Mbenben
 *
 */
public interface IThirdPartyInformationService {
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
	JSONObject readilyShoot(ReadilyShootVo readilyShootVo)throws Exception;
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
	 * 获取所有的车牌类型
	 * @return
	 */
	List<DrivingLicense> getLicensePlateTypes();
}
