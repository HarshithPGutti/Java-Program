package com.xworkz.app.Rope;

public class Rope {
	public String material;
	public int length;
	public String purpose;
	public String color;

	public Rope() {

		this("Jute",25,"cloth drying","green");
		System.out.println("invoking no-arg const in Rope");

	}

	public Rope(String material,int length,String purpose,String color)
	{
		System.out.println("invoking String,int String,String const in Rope");
	}
}
