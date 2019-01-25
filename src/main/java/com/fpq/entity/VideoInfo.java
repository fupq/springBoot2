/**
* @Title: VideoInfo.java
* @Package com.fpq.entity
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
* @classDesc: 功能描述：课程信息实体类
* @author 付品欣
* @createTime 2019年1月24日 下午11:37:11
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@Setter
@Getter
@ToString
public class VideoInfo {

	private int id;
	private String video_name;
	private String video_url;
	private String video_html;
	private int video_type_id;
	private int video_del;
	private String fee_type;
	private long study_times;
}
