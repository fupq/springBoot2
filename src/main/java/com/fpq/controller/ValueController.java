/**
* @Title: ValueController.java
* @Package com.fpq.controller
* @Description: TODO(使用value注解获取配置文件中自定义参数的值)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月24日 下午10:40:48
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@RestController
@Slf4j
public class ValueController {

	@Value("${name}")  //使用value注解获取配置文件中自定义参数的值，应用启动时就就行赋值
	private String name;
	
	/**
	 * 
	* @Title: testValue
	* @Description: TODO(使用value注解获取配置文件中自定义参数的值)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	* http://127.0.0.1:8080/testValue
	 */
	@RequestMapping("/testValue")
	public String testValue() {
		log.info("配置文件中自定义参数name的值："+this.name);
		return "从配置文件中获取自定义参数name的值："+this.name;
	}
}
