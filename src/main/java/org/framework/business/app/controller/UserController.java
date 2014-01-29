package org.framework.business.app.controller;

import java.util.Calendar;
import java.util.Map.Entry;

import javax.validation.Valid;

import org.framework.business.app.vo.TestForm;
import org.framework.business.model.entity.UserInfo;
import org.framework.business.model.service.privilege.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping(value="/user")
public class UserController {

	private final org.apache.log4j.Logger LOG = org.apache.log4j.Logger.getLogger(getClass());
	
	@Autowired
    private UserService userService;//注入业务接口
	
	@RequestMapping(value="/add-user.action",method=RequestMethod.GET)
	public String toAddUser(ModelMap modelMap){
		modelMap.addAttribute("userInfo",new UserInfo());
		return "user/add-user";
	}
	
	@RequestMapping(value = "/save-user.action", method = {RequestMethod.POST})
	public String toSaveUser(@ModelAttribute("userInfo") @Valid UserInfo userInfo, BindingResult bindingResult, ModelMap modelMap){
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("hasErrors", true);
			LOG.debug(modelMap.get("default message")+"__________________________________________1");
			for(Entry<String,Object> e: modelMap.entrySet()){
				LOG.debug("get\t"+e.getKey()+"\t\t>>"+e.getValue());
			}
			LOG.debug("__________________________________________2");
			return "user/add-user";
		}
		long t1 = System.currentTimeMillis();
		userService.save(userInfo);
		long t2 = System.currentTimeMillis();
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(t2-t1); 
		LOG.debug("======================="+c.get(Calendar.SECOND) + "秒 " + c.get(Calendar.MILLISECOND) + " 微秒");
		return "ok/sccuess";
	}
	
	/**
	 * 页面传递2个对象
	 * @param test
	 * @param bindingResult
	 * @param modelMap
	 * @return
	 */
	@RequestMapping(value = "/test.action", method = {RequestMethod.POST})
	public String test(@Valid TestForm test, BindingResult bindingResult, ModelMap modelMap){
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("hasErrors", true);
			return "user/test";
		}
		long t1 = System.currentTimeMillis();
		userService.save(test.getUserInfo());
		long t2 = System.currentTimeMillis();
		Calendar c=Calendar.getInstance();
		c.setTimeInMillis(t2-t1); 
		LOG.debug("======================="+c.get(Calendar.SECOND) + "秒 " + c.get(Calendar.MILLISECOND) + " 微秒");
		return "ok/sccuess";
	}
	
	@RequestMapping(value = "/totest.action", method = {RequestMethod.GET})
	public String totest(){
		return "user/test";	
	}
}
