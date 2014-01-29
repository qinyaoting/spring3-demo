package org.framework.business.app.controller;

import javax.validation.Valid;

import org.framework.business.app.vo.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/member")
public class MemberController{

	
	
	@RequestMapping(value = "/add-member.action", method = {RequestMethod.GET})
	public String addMember(ModelMap modelMap){
		modelMap.addAttribute("member", new Member());
//		return "#member/add-member";///"redirect:/member/add-member";
		return "member/add-member";
	}

	@RequestMapping(value = "/save-member.action", method = {RequestMethod.POST})
	public String saveMember(@ModelAttribute("member") @Valid Member member, BindingResult bindingResult, ModelMap modelMap) {
		if (bindingResult.hasErrors()) {
			modelMap.addAttribute("hasErrors", true);
			return "member/add-member";
		}
		return null;
	}
	
}
