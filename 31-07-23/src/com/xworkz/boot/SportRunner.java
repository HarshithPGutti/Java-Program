package com.xworkz.boot;

import com.xworkz.app.Player;
import com.xworkz.app.Sport;


public class SportRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in SportRunner");
		
		Player players1 = new Player("Rohit", "Two");
		Player players2 = new Player("Virat", "Three");
		Player players3 = new Player("Sachin", "fourteen");
		Player players4 = new Player("Dhoni", "Eleven");
		Player players5 = new Player("Akash", "seven");

		Player[] name = new (); players = { players1, players2, players3, players4, players5 };
		
		Sport  name = new ();sport=new Sport("Cricket", players);
		sport.printInfo();
		
	}

}
