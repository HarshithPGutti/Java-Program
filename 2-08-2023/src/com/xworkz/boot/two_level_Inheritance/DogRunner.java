package com.xworkz.boot.two_level_Inheritance;

import com.xworkz.app.two_sharing_inheritance.Animal;
import com.xworkz.app.two_sharing_inheritance.Dog;

public class DogRunner {

	public static void main(String[] args) {
		
		System.out.println("Invoking main in DogRunner");
		
		
		Dog dog=new Dog("German Shepard");
		
		System.out.println("-----------------------------------------------");
		dog.bark();
		dog.eat();
		dog.produceMilk();
		System.out.println("-----------------------------------------------");
		
		Animal animal=new Dog("Golden Retriever");
		
		
	}

}
