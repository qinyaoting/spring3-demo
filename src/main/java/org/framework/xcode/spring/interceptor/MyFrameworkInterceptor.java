package org.framework.xcode.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



/**
 * 
 * @author songjian @Mar 1, 2013
 */
public class MyFrameworkInterceptor extends HandlerInterceptorAdapter {

	private final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(getClass());
	
	
	/**
	 * 最后执行，可用于释放资源
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		LOG.debug("afterCompletion");
	}

	/**
	 * render
	 */
	@Override
	public void afterConcurrentHandlingStarted(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		LOG.debug("afterConcurrentHandlingStarted");
	}

	/**
	 * 生成视图之前执行
	 */
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		LOG.debug("postHandle");
	}

	/**
	 * Action之前执行
	 */
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
			return true;
	}

}
