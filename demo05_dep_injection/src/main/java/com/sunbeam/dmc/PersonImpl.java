package com.sunbeam.dmc;

public class PersonImpl implements Person {
	private int age;
	private String name;
	public PersonImpl() {
		//System.out.println("PersonImpl() called.");
	}
	public PersonImpl(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PersonImpl [age=" + age + ", name=" + name + "]";
	}
}
