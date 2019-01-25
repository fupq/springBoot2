/**
* @Title: TransactionalController.java
* @Package com.fpq.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月25日
* @version V1.0
*/
package com.fpq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpq.service.TransactionalService;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月25日 下午10:41:44
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@RestController
@Slf4j
public class TransactionalController {

	@Autowired
	private TransactionalService transactionalService;
	
	
	/**
	 * 
	* @Title: addVideoInfo
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param video_name
	* @param @param video_url
	* @param @param video_html
	* @param @param videoTypeId
	* @param @param video_del
	* @param @param count
	* @param @return    参数
	* @return String    返回类型
	* @throws
	* http://127.0.0.1:8080/addVideoInfo?video_name=英语1&video_url=1&videoTypeId=1&video_del=1&count=1
	 */
	@RequestMapping("/addVideoInfo")
	public String addVideoInfo(String video_name,String video_url,String video_html,Integer videoTypeId,Integer video_del,int count) {
		int result = transactionalService.addVideoInfo(video_name, video_url, video_html, videoTypeId, video_del, count);
		String msg = "";
		if(result >0) {
			msg = "课程"+video_name+"插入成功！";
		}else {
			msg = "课程"+video_name+"插入失败！";
		}
		log.info(msg);
		return msg;
	}
}
