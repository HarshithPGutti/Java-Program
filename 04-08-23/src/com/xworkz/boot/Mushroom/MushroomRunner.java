package com.xworkz.boot.Mushroom;

import com.xworkz.app.Mushroom.Mushroom;
import com.xworkz.app.Mushroom.PoisonMushroom;

public class MushroomRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Mushroom");

		System.out.println("___________________________________________________");

		Mushroom mushroom=new Mushroom();

		System.out.println("___________________________________________________");

		System.out.println("Mushroom color is "+mushroom.color);
		System.out.println("Mushroom price is "+mushroom.price);
		System.out.println("Mushroom season "+mushroom.season);
		System.out.println("ushroom taste "+mushroom.taste);

		System.out.println("___________________________________________________");

		PoisonMushroom poison=new PoisonMushroom();

		System.out.println("___________________________________________________");

		System.out.println("Mushroom color is "+poison.color);
		System.out.println("Mushroom price is "+poison.price);
		System.out.println("Mushroom season "+poison.season);
		System.out.println("ushroom taste "+poison.taste);

	}

}