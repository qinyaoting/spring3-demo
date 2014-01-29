package org.framework.xcode.jms.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;



/**
 * 
 * @author songjian @Mar 3, 2013
 */
@Service("jms_proxy")
public class ActivemqSpringProxy extends ActivemqProxyFactory{
	
	@Autowired
	@Qualifier("jmsTemplate")
	private JmsTemplate jmsTemplate;
	
	
	/**
	 * 发送
	 * @param test
	 */
	public void sendMessage(final String test){
		jmsTemplate.send(DEFAULT_ActiveMQQueue,new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(test);
			}
		});
	}
	
	/**
	 * 接收
	 *...自行扩展入参
	 * @throws JMSException 
	 */
	public String receiveMessage() throws JMSException{
		return ((TextMessage) jmsTemplate.receive(DEFAULT_ActiveMQQueue)).getText();
	}
	
}
