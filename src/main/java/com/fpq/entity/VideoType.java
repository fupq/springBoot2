/**
* @Title: VideoType.java
* @Package com.fpq.entity
* @Description: TODO(使用lombok工具自动生成get,set,toString方法和log4j的日志处理)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.entity;

import org.springframework.boot.SpringApplication;

import com.fpq.SpringBoot2Jsp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月24日 上午12:18:42
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Getter
@Setter
//@Slf4j
@ToString
public class VideoType {

	private long id;
	
	private String typeName;
	
//	public static void main(String[] args) {
//		VideoType videoType = new VideoType();
//		videoType.setId(1);
//		videoType.setTypeName("视频");
//		log.info("id:"+videoType.getId()+",typeName:"+videoType.getTypeName());
//		log.debug(videoType.toString());
//	}
	
	
}
