package com.kunitish.prototype;

public class Student implements Cloneable{
	private String name;
	private int roll_no;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
;

	public Student(String name, int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll_no=" + roll_no + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
