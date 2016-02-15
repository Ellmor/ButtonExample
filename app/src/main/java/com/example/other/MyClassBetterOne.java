package com.example.other;

public class MyClassBetterOne {
	String name;
	int age;
	public static int maxAge = 100;
	
	public MyClassBetterOne(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	public MyClassBetterOne(String name)
	{
		this.name = name;
		this.age = 0;
	}
	


}
