package com.kunitish.prototype;

public class StudentCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
   
		Student s = new Student("Hemant",12);
		System.out.println(s);
		
		Student s2 = (Student)s.clone();
		s2.setName("Nitish");
		System.out.println(s2);
	}

}
