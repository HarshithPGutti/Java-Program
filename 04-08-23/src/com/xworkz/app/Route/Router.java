package com.xworkz.app.Route;

public class Router {
	public String purpose;
	public String name;
	public int speed;
	public double price;


	public Router() {
		this("Internet","Airtel",1000,500.0);
		System.out.println("Invoking no-arg const in Router");
	}

	public Router(String purpose,String name,int speed,double price)
	{
		System.out.println("invoking String,String,int,double const in Router");
		this.name=name;
		this.purpose=purpose;
		this.speed=speed;
		this.price=price;
	}

}
