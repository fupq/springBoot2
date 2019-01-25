/**
* @Title: VideoInfoController.java
* @Package com.fpq.controller.oec
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月25日
* @version V1.0
*/
package com.fpq.controller.oec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fpq.entity.VideoInfo;
import com.fpq.service.VideoInfoService;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月25日 上午12:07:44
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@RestController
@Slf4j
public class VideoInfoController {

	@Autowired
	private VideoInfoService videoInfoService;
	
	/**
	 * 
	* @Title: myVideo
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param videoName
	* @param @return    参数
	* @return String    返回类型
	* @throws
	* http://127.0.0.1:8080/myVideo?videoName=carson游泳
	 */
	@RequestMapping("/myVideo")
	public String myVideo(String videoName) {
		VideoInfo videoInfo = videoInfoService.findByVideoName(videoName);
		log.info("controller层："+videoInfo.toString());
		return videoInfo.toString();
	}
}
