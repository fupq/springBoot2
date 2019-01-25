/**
* @Title: VideoInfoMapper.java
* @Package com.fpq.mapper
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月24日
* @version V1.0
*/
package com.fpq.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fpq.entity.VideoInfo;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月24日 下午11:50:13
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
//@Mapper //启动mybatis的方式2，不采用此注解，只需在启动类中添加mapperScan注解就可以了
public interface VideoInfoMapper {

	@Select("SELECT vi.id,vi.fee_type,vi.study_times,vi.video_del,vi.video_html,vi.video_html,vi.video_name,vi.video_type_id,vi.video_url FROM oec.video_info vi WHERE vi.video_name = #{videoName}")
	VideoInfo findByVideoName(@Param("videoName") String videoName);

	@Select("SELECT a.id AS id,a.video_name AS videoName, a.video_html AS videoHtml ,a.video_url AS videoUrl, a.video_del AS videoDel, b.type_name AS typeName,CASE a.fee_type WHEN 'fee' THEN '会员' WHEN 'free' THEN '免费' ELSE '免费' END AS feeType,a.study_times AS studyTimes FROM oec.video_info  AS a  INNER JOIN video_type AS b  ON a.video_type_id=b.id")
	List<VideoInfo> selectAll();
	
	
	@Insert("INSERT INTO oec.video_info (id, video_name, video_url, video_html, video_type_id, video_del)VALUES (NULL, #{video_name}, #{video_url}, #{video_html}, #{video_type_id}, #{video_del})")
	int insert(@Param("video_name") String video_name,@Param("video_url") String video_url,@Param("video_html") String video_html,@Param("video_type_id") Integer videoTypeId,@Param("video_del") Integer video_del);

//	@Select("SELECT id, video_name, video_url, video_html, video_type_id, video_del FROM oec.video_info WHERE id = #{id}")
//	VideoInfo selectByPrimaryKey(@Param("id") Integer id);
	@Select("SELECT a.id AS id,a.video_name AS videoName, a.video_html AS videoHtml , video_type_id as videoTypeId, video_del as videoDel,CASE a.fee_type WHEN 'fee' THEN '会员' WHEN 'free' THEN '免费' ELSE '免费' END AS feeType,a.study_times AS studyTimes FROM oec.video_info a where a.id=#{id}")
	VideoInfo selectByPrimaryKey(@Param("id") Integer id);
	
	@Update("UPDATE oec.video_info a SET a.study_times = a.study_times + 1 WHERE a.id = #{id} AND a.study_times = #{studyTimes}")
	int updatgeStudyTimes(@Param("id") Integer id,@Param("studyTimes") long studyTimes);

}
