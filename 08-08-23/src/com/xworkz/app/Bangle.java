package com.xworkz.app;

public class Bangle {

	public String color;

	public void makeSound()
	{
		System.out.println("invoking makeSound in Bangle");
	}

	public void makeSound(String color)
	{
		System.out.println("Invoking makeSound(string) in Bangle");
	}

}