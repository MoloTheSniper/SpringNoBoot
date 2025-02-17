package com.Moloko.springNoBoot;

public class Dev 
{
	private Laptop laptop;
	private int age;
	public Dev()
	{
		System.out.println("Dev Constructor");
	}
	//Constructor Injection
	public Dev(int age)
	{
		this.age = age;
		System.out.println("Dev 1 Constructor");
	}
	//Constructor Injection
	public Dev(Laptop laptop)
	{
		this.laptop = laptop;
		System.out.println("Dev 1 Constructor");
	}
	//Setter Injection
	public void setAge(int age)
	{
		this.age = age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setLaptop(Laptop laptop)
	{
		this.laptop = laptop;
	}
	public Laptop getLaptop()
	{
		return laptop;
	}
	public void build()
	{
		System.out.println("Working on an awesome project");
		laptop.compile();
	}
}
