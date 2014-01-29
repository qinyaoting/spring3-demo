package org.framework.business.app.controller;

import java.util.HashMap;
import java.util.Map;
import org.framework.business.exception.BusinessException;
import org.framework.business.exception.SystemException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/exc")
public class ExcController {

	
	/**
	 * jump into the index page
	 * 
	 * @return
	 */
	@RequestMapping(value = "/index.action")
	public String indexPage() {
		return "error/index";
	}

	/**
	 * get the json Exception
	 * 
	 * @return
	 * @throws BusinessException
	 */
	@RequestMapping(value = "/josonException.action")
	public @ResponseBody Map<String, Object> getjson() throws BusinessException {
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			map.put("content", "123");
			map.put("result", true);
			map.put("account", 1);
			throw new Exception();
		} catch (Exception e) {
			throw new BusinessException("this is the detail of ajax exception information");
		}
	}

	/**
	 * 
	 */
	@RequestMapping(value = "/SystemException.action")
	public void TestSystemException() {
		throw new SystemException("this is system error ");
	}

	/**
	 * @throws com.jason.exception.BusinessException
	 * 
	 */
	@RequestMapping(value = "/BusinessException.action")
	public void TestBusinessException() throws BusinessException {
		throw new BusinessException("this is Business error ");
	}
	
}
