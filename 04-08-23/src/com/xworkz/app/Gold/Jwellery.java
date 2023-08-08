package com.xworkz.app.Gold;

public class Jwellery extends Gold {
	public Jwellery() {
		super();
		System.out.println("Invoking no-arg const in Jwellery");
	}

	public Jwellery(String color,double price,String purpose,String shopName) {
		super();
		System.out.println("Invoking String,double,String,String const in Jwellery");
	}
}
