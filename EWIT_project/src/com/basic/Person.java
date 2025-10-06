package com.basic;

public class Person {
	private String personName;
	protected int personAge;
    String personCity;
  public void setPersonName(String personName) {
	  this.personName= personName;
    
  }
 
	public String getPersonName() {
		return personName;
		
	}
	public void display() {
		System.out.println(personName + personAge + personCity);
	}
}
