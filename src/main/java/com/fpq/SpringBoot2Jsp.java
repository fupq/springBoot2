/**
* @Title: SpringBoot2Jsp.java
* @Package com.fpq
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月23日
* @version V1.0
* springboot集成mybatis:
* 1.springboot启动mybatis的2种方式
* mybatis启动方式1：可以在mapper层不添加mapper注解，但需要在应用启动类上添加@MapperScan注解
* mybatis启动方式2：在mapper的接口上添加@Mapper注解，将mapper注入mybatis容器
*/
package com.fpq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月23日 上午12:48:33
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@SpringBootApplication
@MapperScan(basePackages= {"com.fpq.mapper"})  //通过反射技术扫描包中的mapper后注入spring容器
@EnableAsync  //启动应用时开启异步调用
public class SpringBoot2Jsp {

	/**
	* @Title: main
	* @Description: TODO(springboot2.0集成jsp)
	* @param @param args    参数
	* @return void    返回类型
	* @throws
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringBoot2Jsp.class, args);
	}

}
