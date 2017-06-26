package org.springAOPLearning.model;

public class Circle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Inside setName of Circle class");
		throw new RuntimeException();
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("Inside setNameAndReturn of Circle class");
		return "hehehehe";
	}
	
}
