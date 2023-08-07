package com.xworkz.app.Route;

public class AirtelRouter {
	public AirtelRouter() {
		super();
		System.out.println("invoking no-arg const in AirtelRouter");
	}

	public AirtelRouter(String purpose,String name,int speed,double price)
	{
		System.out.println("invoking String,String,int,double const in AirtelRouter");
	}
}
