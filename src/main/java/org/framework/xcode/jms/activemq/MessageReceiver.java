package org.framework.xcode.jms.activemq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * 
 * @author songjian
 * @Mar 3, 2013
 */
public class MessageReceiver {

	
	public static void main(String[] args) throws JMSException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-jms.xml");
			JmsTemplate template = (JmsTemplate) ctx.getBean("jmsTemplate");
			Destination destination = (Destination) ctx.getBean("destination");
			while (true) {
				TextMessage msg = (TextMessage) template.receive(destination);
				if (null != msg){
					System.out.println("收到消息内容为: " + msg.getText());
				}
				else
					break;
			
			}
	}
	
}