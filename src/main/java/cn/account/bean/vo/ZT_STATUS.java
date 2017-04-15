package cn.account.bean.vo;
/**
 * 调用方式 String zt = ZT_STATUS.valueOf("A").getZtStatus();
 * @author Mbenben
 *
 */
public enum ZT_STATUS {
	
	A("正常"),B("超分"),C("转出"),D("暂扣"),E("撤销"),F("吊销"),G("注销"),
	H("违法未处理"),I("事故未处理"),J("停止使用"),K("抵押"),L("锁定"),
	M("逾期未换证"),N("延期换证"),P("延期体检"),R("注销可恢复"),S("逾期未审验状态"),
	T("延期审验"),U("扣留");
	
	private String status;
	
	private ZT_STATUS(String status){
		this.status = status;
	}
	
	public String getZtStatus(){
		return status;
	}
}

