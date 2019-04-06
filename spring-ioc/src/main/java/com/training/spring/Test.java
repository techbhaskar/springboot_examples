package com.training.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
/* We can get the Bean reference not only ApplicationContext Interface but also
 * with BeanFactory
 * 
 * The org.springframework.beans.factory.BeanFactory and the 
 * org.springframework.context.ApplicationContext interfaces acts as the IoC container. 
 * The ApplicationContext interface is built on top of the BeanFactory interface. 
 * It adds some extra functionality than BeanFactory such as simple integration 
 * with Spring's AOP
 */
public class Test {
public static void main(String[] args) {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	ExplainSpringIoc student=(ExplainSpringIoc)context.getBean("iocbean");
	student.displayInfo();
	/* We can get the Bean reference not only ApplicationContext Interface but also
	 * with BeanFactory 
	 * */ 
	Resource resource=new ClassPathResource("applicationContext.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	ExplainSpringIoc student1=(ExplainSpringIoc)factory.getBean("iocbean");
	student1.displayInfo();
	
}
}
