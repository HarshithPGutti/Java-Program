package com.xworkz.boot;

import com.xworkz.app.Elevator;
import com.xworkz.app.Gadget;
import com.xworkz.app.Hotel;
import com.xworkz.app.IronBox;
import com.xworkz.app.Mouse;
import com.xworkz.app.Plier;
import com.xworkz.app.Stapler;
import com.xworkz.app.Umbrella;


public class MainRunner {

public static void main(String[] args) {
		
		
		IronBox box=new IronBox();
		box.iron();
		System.out.println("\n");
		box.iron("Philipes",2250);

		

		Hotel star=new Hotel();
		star.fivestar();
		System.out.println("\n");
		star.fivestar("Nalanda",true);
		
		
		
		
		Stapler store=new Stapler();
		store.pin();
		System.out.println("\n");
		store.pin("Hippo",759);
		
		
		
		Umbrella drop=new Umbrella();
		drop.rain();
		System.out.println("\n");
		drop.rain("Red",350);

		
		
		Gadget product=new Gadget();
		product.item();
		System.out.println("\n");
		product.item("Trimer",1999);
		
		
		
		Plier kit=new Plier();
		kit.tool();
		System.out.println("\n");
		kit.tool("Kamat",'M');
		
		
		
		Mouse key=new Mouse();
		key.point();
		System.out.println("\n");
		key.point("Dell",1500);
		
		
		
		Elevator run=new Elevator();
		run.lift();
		System.out.println("\n");
		run.lift("Eclipes",542);
	}

}