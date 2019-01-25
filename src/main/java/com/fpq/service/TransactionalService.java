/**
* @Title: TransactionalService.java
* @Package com.fpq.service
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月25日
* @version V1.0
*/
package com.fpq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fpq.mapper.VideoInfoMapper;

import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月25日 下午10:21:02
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Service
@Slf4j
public class TransactionalService {

	@Autowired
	private VideoInfoMapper videoInfoMapper;
	
	@Transactional //让该方法开启事物控制
	public int addVideoInfo(String video_name,String video_url,String video_html,Integer videoTypeId,Integer video_del,int count) {
		int result = videoInfoMapper.insert(video_name, video_url, video_html, videoTypeId, video_del);
		int a = 100/count;
		log.info("课程"+video_name+"添加成功!");
		return result;
	}
}
