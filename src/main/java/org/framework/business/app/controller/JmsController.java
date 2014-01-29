package org.framework.business.app.controller;

import javax.jms.JMSException;

import org.apache.log4j.Logger;
import org.framework.business.exception.BusinessException;
import org.framework.xcode.jms.activemq.ActivemqSpringProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * 
 * @author songjian @Mar 3, 2013
 */
@Controller
@RequestMapping(value="/jms")
public class JmsController {

	private Logger LOG = Logger.getLogger(getClass());
	
	@Autowired
	@Qualifier("jms_proxy")
	private ActivemqSpringProxy proxy;

	
	@RequestMapping(value="/test.action",method=RequestMethod.GET)
	public String testjms(){
		return "jms/index";
	}
	
	@RequestMapping(value="/send.action",method=RequestMethod.GET)
	public void sendTxt(){
		proxy.sendMessage("hello world！");
	}

	
	@RequestMapping(value="/getjms.action",method=RequestMethod.GET)
	public void getTxt() throws BusinessException{
		try {
			String ccd = proxy.receiveMessage();
			LOG.debug("get jms message "+ccd);
		} catch (JMSException e) {
			throw new BusinessException("JMS 接收出错..");
		}
	}
	
}
