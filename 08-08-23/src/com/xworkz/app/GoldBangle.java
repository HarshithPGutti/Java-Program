package com.xworkz.app;

public class GoldBangle extends Bangle {
	@Override
	public void makeSound() {
		System.out.println("invoking makeSound() in GoldBangle");
		super.makeSound();
	}

}