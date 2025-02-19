package com.Moloko.springNoBoot;

public class Dev 
{
	private Computer com;
	
	//--Desktop---
	private Desktop desktop;
	
	
	public Dev()
	{
		System.out.println("Dev Constructor");
	}
	
	public Computer getCom()
	{
		return com;
	}
	public void setCom(Computer com)
	{
		this.com = com;
	}
	public void build()
	{
		System.out.println("Working on an awesome project");
		com.compile();
	}
}
