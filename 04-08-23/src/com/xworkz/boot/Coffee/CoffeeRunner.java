package com.xworkz.boot.Coffee;

public class CoffeeRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in CoffeeRunner");
		System.out.println("---------------------------------------------------");

		Coffee coffee=new Coffee();
		System.out.println("---------------------------------------------------");
		System.out.println("Brand of coffee is "+coffee.brand);
		System.out.println("Price of coffee is "+coffee.price);
		System.out.println("Taste of coffee is "+coffee.taste);
		System.out.println("Temperature of coffee is "+coffee.temp);

		System.out.println("---------------------------------------------------");

		Starbucks starbucks=new Starbucks("Sunrise",false,18,32);
		System.out.println("---------------------------------------------------");
		System.out.println("Brand of coffee is"+starbucks.brand);
		System.out.println("Price of coffee is "+starbucks.price);
		System.out.println("Taste of coffee is "+starbucks.taste);
		System.out.println("Temperature of coffee is "+starbucks.temp);
	}

}
