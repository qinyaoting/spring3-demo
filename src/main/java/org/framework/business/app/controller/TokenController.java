package org.framework.business.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.framework.business.app.WebConstains;
import org.framework.xcode.util.csrf_xss_sql.CSRFTokenManager;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/token")
@Scope(value="prototype")
public class TokenController{

	
	
	@RequestMapping(value = "/index.action", method = {RequestMethod.GET})
	public String showPage(ModelMap modelMap,HttpServletRequest request,HttpSession session){
		if(request!=null){
			System.out.println("session id = "+request.getSession().getId());
		}
		modelMap.addAttribute("csrf", CSRFTokenManager.getTokenForSession(session));
		return "token/index";
	}
	
	@RequestMapping(value = "/mytoken.action", method = {RequestMethod.GET})
	public String mytoken(ModelMap modelMap,@RequestParam(value=WebConstains.WEBTOKEN$,required=false) String CSRFToken,HttpSession session){
		if(CSRFToken == null || !CSRFToken.equals(session.getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME).toString())){
			return "error/xss";
		}
		modelMap.addAttribute("csrf", CSRFTokenManager.getTokenForSession(session));
		return "token/index";
	}
	
	
	@RequestMapping(value = "/ajaxtoken.action", method = {RequestMethod.GET})
	public String ajaxtoken(ModelMap modelMap,HttpServletRequest request,HttpSession session,HttpServletResponse response){
		if(StringUtils.isBlank(request.getHeader(WebConstains.AJAX__RequestVerificationToken))
			||StringUtils.isBlank(session.getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME).toString())
			||!request.getHeader(WebConstains.AJAX__RequestVerificationToken).
			equals(session.getAttribute(CSRFTokenManager.CSRF_TOKEN_FOR_SESSION_ATTR_NAME).toString())){
			return "error/xss"; 
		}
		
		return null;
	}
	
}
