/**
* @Title: VideoInfoService.java
* @Package com.fpq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月25日
* @version V1.0
*/
package com.fpq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fpq.entity.VideoInfo;
import com.fpq.mapper.VideoInfoMapper;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月25日 上午12:01:23
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Service
@Slf4j
public class VideoInfoService {

	@Autowired
	private VideoInfoMapper videoInfoMapper;
	
	/**
	 * 
	* @Title: findByVideoName
	* @Description: TODO(根据课程名称查询课程信息)
	* @param @param videoName
	* @param @return    参数
	* @return VideoInfo    返回类型
	* @throws
	 */
	public VideoInfo  findByVideoName(String videoName) {
		VideoInfo  videoInfo  = videoInfoMapper.findByVideoName(videoName);
		log.info(videoInfo.toString());
		return videoInfo;
	}
}
