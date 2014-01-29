package org.framework.business.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 * 
 * @author songjian @Mar 4, 2013
 */
@Controller
@RequestMapping("/music")
public class MusicZoneController {

	@RequestMapping("/myzone")
	public String myzone(ModelMap modelMap,HttpServletRequest request,HttpSession session){
		System.out.println(session==null);
		
		return "music/my";
	}
	
}
