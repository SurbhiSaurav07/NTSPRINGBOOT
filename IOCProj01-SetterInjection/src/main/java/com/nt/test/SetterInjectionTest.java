package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//hold spring bean cfg file name and location
		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create IOC container(BeanFactory container)
		XmlBeanFactory factory = new XmlBeanFactory(res);
		//get Target spring bean class object
		Object obj = factory.getBean("wmg");
		
	/*	Object obj1 = factory.getBean("wmg");
		System.out.println(obj.hashCode() + " " + obj1.hashCode());
		System.out.println(obj==obj1);*/
		
		//typcasting
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		//invoke the b.logic
		String result = generator.GenerateMessage("Raja");
		System.out.println("Wish Message is :"+ result);
	}//end maain

}//end class
