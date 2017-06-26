package org.springAOPLearning.driver;

import org.springAOPLearning.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
		//shapeService.getCircle().setNameAndReturn("New Circle");
		shapeService.getCircle().setName("New Circle");
		//System.out.println(shapeService.getCircle().getName());
	}

}
