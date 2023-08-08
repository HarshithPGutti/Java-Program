package com.xworkz.app.Coffee;

public class Starbucks {
	public Starbucks() {

		System.out.println("Invoking no-arg const in Starbucks");
	}

	public Starbucks(String color,boolean taste,int temp,double price)
	{
		super();
		System.out.println("Invoking String,boolean,int,double in Starbucks");
		this.brand=color;
		this.taste=taste;
		this.temp=temp;
		this.price=price;
	}

}