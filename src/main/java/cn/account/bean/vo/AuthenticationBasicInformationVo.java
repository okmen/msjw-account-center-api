package cn.account.bean.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

/**
 * 认证基本信息
 * @author Mbenben
 *
 */
public class AuthenticationBasicInformationVo  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 真实姓名
	 */
	private String trueName;
	/**
	 * 手机号
	 */
	private String mobilephone;
	/**
	 * 我的身份证
	 */
	private String identityCard;
	/**
	 * 我的车牌号
	 */
	private String myNumberPlate;
	/**
	 * 我的头像
	 */
	private String myAvatar;
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	public String getMyNumberPlate() {
		return myNumberPlate;
	}
	public void setMyNumberPlate(String myNumberPlate) {
		this.myNumberPlate = myNumberPlate;
	}
	public String getMyAvatar() {
		return myAvatar;
	}
	public void setMyAvatar(String myAvatar) {
		this.myAvatar = myAvatar;
	}

	
	public static void main(String[] args) {
		List<InformationSheetVo> informationSheetVos = new ArrayList<InformationSheetVo>();
		InformationSheetVo informationSheetVo1 = new InformationSheetVo();
		informationSheetVo1.setApplicationTime("11111111111");
		InformationSheetVo informationSheetVo2 = new InformationSheetVo();
		informationSheetVo2.setApplicationTime("222222222222");
		
		informationSheetVos.add(informationSheetVo1);
		informationSheetVos.add(informationSheetVo2);
		
		System.out.println(JSON.toJSONString(informationSheetVos));
	}
}
