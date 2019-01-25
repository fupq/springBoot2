/**
* @Title: AsyncService.java
* @Package com.fpq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月24日 下午9:37:35
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Service
@Slf4j
public class AsyncService {

	/**
	 * 
	* @Title: testSyncService
	* @Description: TODO(同步方式调用此方法)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	public String testSyncService() {
		log.info("2");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("3");
		return "testNomalService";
	}
	
	/**
	 * 
	* @Title: testAsyncService
	* @Description: TODO(采用异步执行此方法（新建一个线程来执行此方法）)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	 */
	@Async
	public String testAsyncService() {
		log.info("b");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("c");
		return "testAsyncService";
	}
}
