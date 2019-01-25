/**
* @Title: AsyncController.java
* @Package com.fpq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpq.service.AsyncService;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月24日 下午9:36:54
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@RestController
@Slf4j
public class AsyncController {

	@Autowired
	private AsyncService asyncService;
	
	/**
	 * http://127.0.0.1:8080/callSyncService
	* @Title: callSyncService
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("/callSyncService")
	public String callSyncService() {
		log.info("1");
		String result = asyncService.testSyncService();
		log.info("4");
		return result;
	}
	
	/**
	 * http://127.0.0.1:8080/callAsyncService
	* @Title: callAsyncService
	* @Description: TODO(异步调用testAsyncService方法)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	@RequestMapping("/callAsyncService")
	public String callAsyncService() {
		log.info("a");
		String result = asyncService.testAsyncService();
		log.info("d,result:"+result);
		
		if("".equals(result) || null == result) {
			return "请求已开始处理，处理结果请2分钟后调用XXX接口查询！";
		}
		return result;
	}
}
