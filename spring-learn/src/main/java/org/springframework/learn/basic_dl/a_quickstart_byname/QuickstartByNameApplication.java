package org.springframework.learn.basic_dl.a_quickstart_byname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.learn.basic_dl.a_quickstart_byname.bean.Person;

public class QuickstartByNameApplication {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("basic_dl/quickstart-byname.xml");
		Person person = (Person) beanFactory.getBean("person");

		System.out.println(person);
	}

}
