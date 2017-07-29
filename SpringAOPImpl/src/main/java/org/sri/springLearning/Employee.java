package org.sri.springLearning;

import org.sri.springLearning.aspect.Loggable;


public class Employee {

	private String name;
	
	public String getName(){
		return name;
	}
	
	@Loggable
	public void setName(String name){
		this.name = name;
	}
	
	public void throwException(){
		throw new RuntimeException("Dummy Exception");
	}

	@Override
	public String toString(){
		return "Employee: " + "[Name = " + getName() +"]";
	}

}
