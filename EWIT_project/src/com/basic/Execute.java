package com.basic;

public class Execute {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.personAge=20;
		p1.personCity="bangalore";
		p1.setPersonName("Spoorthi");
		p1.display();
		
		System.out.println(p1.getPersonName());
		Person p2=new Person();
		p2.display();
		
		Person p3=new Person();
		p3.display();
	}

}
