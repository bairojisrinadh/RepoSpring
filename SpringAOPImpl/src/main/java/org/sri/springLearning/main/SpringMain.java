package org.sri.springLearning.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.sri.springLearning.EmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Srinadh");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}
}
