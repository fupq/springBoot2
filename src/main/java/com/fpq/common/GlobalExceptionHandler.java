/**
* @Title: GlobalExceptionHandler.java
* @Package com.fpq.common
* @Description: TODO(用一句话描述该文件做什么)
* @author slx
* @date 2019年1月23日
* @version V1.0
*/
package com.fpq.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
* @classDesc: 功能描述：
* @author 付品欣
* @createTime 2019年1月23日 下午10:05:55
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
*/
@ControllerAdvice(basePackages="com.fpq.controller")
public class GlobalExceptionHandler {
    
	//通过json格式返回错误信息
//	@ExceptionHandler(RuntimeException.class)
//	@ResponseBody  //返回json格式
//	public Map<String,Object> exceptionResult(){
//		Map<String,Object> exceptionMap = new HashMap<String,Object>();
//		exceptionMap.put("errorCode", "2000");
//		exceptionMap.put("errorMessage", "系统异常，请联系管理员处理！");
//		return exceptionMap;
//	}
	
	@ExceptionHandler(value = Exception.class)
	   public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception
	   {
	      return createModelAndView(request, "ErrorMessage", HttpStatus.INTERNAL_SERVER_ERROR, e);
	   }

	   private ModelAndView createModelAndView(HttpServletRequest request, String viewName, HttpStatus status, Exception e)
	   {
	      ModelAndView mav = new ModelAndView();
	      if (e != null)
	      {
	         mav.addObject("error", e);
	      }
	      mav.addObject("url", request.getRequestURI());
	      mav.addObject("method", request.getMethod());
	      if (status != null)
	      {
	         mav.setStatus(status);
	      }
	      mav.setViewName(viewName);
	      return mav;
	   }
}
