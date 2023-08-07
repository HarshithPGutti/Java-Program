package com.xworkz.app.Gold;

public class Gold {
	public String color;
	public double price;
	public String purpose;
	public String shopName;

	public Gold(){
		this("Gold",2400.0,"Necklace","Saraswathi jwellers");
		System.out.println("Invoking no-arg const in Gold");
	}

	public Gold(String color,double price,String purpose,String shopName) {

		System.out.println("Invoking String,double,String,String const in Gold");
		this.color=color;
		this.price=price;
		this.purpose=purpose;
		this.shopName=shopName;
	}

}