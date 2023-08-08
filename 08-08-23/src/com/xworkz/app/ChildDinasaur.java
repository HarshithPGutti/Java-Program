package com.xworkz.app;

public class ChildDinasaur {
	@Override
	public void makeSound() {
		System.out.println("inovoking makesound() in ChildDinasaur");
		super.makeSound();
	}

}