package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;

public class ConstructorInjectionTest2 {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		//FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		
		//create IOC container(BeanFactory container)
		//XmlBeanFactory factory = new XmlBeanFactory(res);
		
		//get Target spring bean class object
		//Object obj = factory.getBean("wmg");
		
		//typcasting
		//WishMessageGenerator generator = (WishMessageGenerator)obj;
		
		
		//create IOC Container
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		WishMessageGenerator generator = factory.getBean("wmg" ,WishMessageGenerator.class);
		
		//invoke the b.logic
		String result = generator.GenerateMessage("Raja");
		System.out.println("Wish Message is :"+ result);
	}//end maain

}//end class
