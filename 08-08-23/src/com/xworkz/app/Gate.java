package com.xworkz.app;

public class Gate {
	public String material;

	public void protect()
	{
		System.out.println("invoking protect() in Gate");
	}

	public void protect(String material)
	{
		System.out.println("invoking protect(String) in Gate");
	}

}
