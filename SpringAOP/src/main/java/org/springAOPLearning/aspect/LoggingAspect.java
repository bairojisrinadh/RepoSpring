package org.springAOPLearning.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	/* @Before annotation of aspect is used to execute before each JoinPoint*/
	/*@Before("allGetters() && allMethodsOfCircle()")
	public void loggingAdvice(){
		System.out.println("Executing LoggingAdvice, before Getters...");
	}
	
	@Before("allGetters()")
	public void secondAdvice(){
		System.out.println("Executing SecondAdvice, before Getters...");
	}*/
	
	@After("allGetters() && allMethodsOfCircle()")
	public void loggingAdvice(){
		System.out.println("Executing LoggingAdvice, After Getters and Methods of Circle Class...");
	}
	
	/*@After("allSetters()")
	public void secondAdvice(JoinPoint joinPoint){
		System.out.println("Executing SecondAdvice, After Setters..."+ joinPoint.getSignature().getName());
	}*/
	
	/*@After("args(name)")
	public void displayAspectArguments(String name){
		System.out.println("In displayAspectArguments, value of argument is "+ name);
	}*/
	
	@AfterReturning(pointcut = "args(name)", returning = "returnValue")
	public void displayAspectArgumentsAndReturn(String name, String returnValue){
		System.out.println("In displayAspectArguments, argument passed "+name+", and returned argument is "+returnValue);
	}
	
	@AfterThrowing(pointcut = "allSetters()", throwing = "ex")
	public void setNameAndThrow(Exception ex){
		System.out.println("In setNameAndThrow, exception thrown: "+ ex);
	}
	
	@Pointcut("execution(* set*(..))")
	public void allSetters(){};
	
	@Pointcut("execution(* get*(..))")
	public void allGetters(){};
	
	@Pointcut("within(org.springAOPLearning.model.Circle)")
	public void allMethodsOfCircle(){};
	
}
