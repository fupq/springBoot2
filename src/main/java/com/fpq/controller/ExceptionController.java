/**
* @Title: ExceptionController.java
* @Package com.fpq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月23日
* @version V1.0
*/
package com.fpq.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpq.common.ExceptionMsg;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：全局异常测试类
* @author 付品欣
* @createTime 2019年1月23日 下午9:47:01
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@RestController
@Slf4j
public class ExceptionController {

//	private static final Logger logger = LoggerFactory.getLogger(ExceptionController.class);
	/**
	 * 
	* @Title: createError
	* @Description: TODO(测试全局异常)
	* @param @param count
	* @param @return    参数
	* @return String    返回类型
	* @throws
	* http://127.0.0.1:8080/createError?count=0
	 */
	@RequestMapping("/createError")
	public String createError(int count) {
		if(count == 0) {
			ExceptionMsg exceptionMsg = ExceptionMsg.LOGIC_EXCEPT_ZERO;
			System.out.println("错误码："+exceptionMsg.getCode() + "，错误信息："+exceptionMsg.getMsg());
			log.error("错误码："+exceptionMsg.getCode() + "，错误信息："+exceptionMsg.getMsg());
			log.info("错误码："+exceptionMsg.getCode() + "，错误信息："+exceptionMsg.getMsg());
			return "错误码："+exceptionMsg.getCode() + "，错误信息："+exceptionMsg.getMsg();
		}
		int result = 0;
//		try {
			result = 100/count;
//		}catch(Exception e) {
//			return "执行中出现异常："+e.getMessage();
//		}
		return "执行成功！执行结果："+result;
	}
}
