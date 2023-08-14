package com.xworkz.boot;

import com.xworkz.app.Animal;
import com.xworkz.abstractTask.app.HerbivoreAnimal;

public class AnimalRunner {
	public static void main(String[] args) {
		System.out.println("Running main in AnimalRunner ");

		Animal animal = new HerbivoreAnimal();

		animal.eat();
		animal.move();
		animal.makeSound();
		animal.sleep();
		animal.breathe();


		System.out.println("Animal name: " + animal.getName());
		System.out.println("Animal age: " + animal.getAge());
		animal.roam();
		animal.reproduce();
		animal.habitat();

	}

}
