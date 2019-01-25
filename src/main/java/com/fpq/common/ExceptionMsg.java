/**
* @Title: ExceptionMsg.java
* @Package com.fpq.common
* @Description: TODO(异常消息的枚举)
* @author slx
* @date 2019年1月23日
* @version V1.0
*/
package com.fpq.common;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月23日 下午10:49:18
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
public enum ExceptionMsg {

	//逻辑异常
	LOGIC_EXCEPT_ZERO("100000","除去0时报异常"),
	
	// 默认异常
	PARAM_EXCEPTION_DEFAULT("100001", "参数错误！"), 
	BUSINESS_EXCEPTION_DEFAULT("100002","业务异常，请联系管理员！"), 
	UNAUTH_EXCEPTION_DEFAULT("100003","权限不够！"), 
	SYS_EXCEPTION_DEFAULT("100001", "系统错误，请联系管理员！"),

	// 权限
	AUTH_NOPERMISSIONS("110001", "没有权限！"), 
	ROLE_CODE_NULL("110002", "角色编码为空！"), 
	ROLE_CODE_EXIST("110003", "角色编码已存在！"), 
	MENU_NULL("110004", "菜单不存在！"), 
	BTN_CODE_NULL("110005","按钮权限编码为空！"), 
	BTN_CODE_EXIST("110006", "按钮权限编码已存在！");
	
	/**
	 * 信息编码
	 */
	private String code;

	/**
	 * 信息
	 */
	private String msg;

	/**
	 * 枚举私有构造器
	 * 
	 * @param code
	 *            信息编码，格式：共6位数字组成，前两位为提示类型编码，中间两位为具体子类型编码，后两位为提示信息递增编码
	 * @param key
	 *            国际化资源key
	 */
	private ExceptionMsg(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
