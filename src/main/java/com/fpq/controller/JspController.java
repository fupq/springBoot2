/**
* @Title: JspController.java
* @Package com.fpq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月23日
* @version V1.0
*/
package com.fpq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月23日 上午12:46:53
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Controller
public class JspController {

	/**
	 * 
	* @Title: myJsp
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	* http://127.0.0.1:8080/myJsp
	 */
	@RequestMapping("/myJsp")
	public String myJsp() {
		return "indexJsp";
	}
}
