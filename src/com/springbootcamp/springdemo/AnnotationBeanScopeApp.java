package com.springbootcamp.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springbootcamp.springdemo.services.Coach;

public class AnnotationBeanScopeApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		Coach otherCoach = context.getBean("tennisCoach", Coach.class);
		
		// Check if they are the same
		compareBeans(coach, otherCoach);
		context.close();
	}
	
	public static void compareBeans(Coach beanA, Coach beanB) {
		boolean result = (beanA == beanB);		
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for coach: " + beanA);
		System.out.println("\nMemory location for otherCoach: " + beanB);
	}
}
