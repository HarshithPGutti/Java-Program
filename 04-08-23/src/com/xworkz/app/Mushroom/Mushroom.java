package com.xworkz.app.Mushroom;

public class Mushroom {
	public boolean taste;
	public String color;
	public String season;
	public double price;


	public Mushroom() {
		this(true,"white","Monsoon",174.00);
		System.out.println("Invoking no-arg const in Mushroom");
	}

	public Mushroom(boolean taste , String color,String season,double price)
	{
		System.out.println("Invoking boolean,String,String,double in Mushroom");
		this.taste=taste;
		this.color=color;
		this.season=season;
		this.price=price;
	}
}
