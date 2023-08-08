package com.xworkz.boot.Rope;

import com.xworkz.app.Rope.Rope;
import com.xworkz.app.Rope.Thread;

public class RopeRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main in RopeRunner");

		System.out.println("-----------------------------------------------------");
		Rope rope=new Rope();

		System.out.println("-----------------------------------------------------");

		System.out.println("Rope color : "+rope.color);
		System.out.println("Rope length : "+rope.length);
		System.out.println("Rope material : "+rope.material);
		System.out.println("Rope Purpose : "+rope.purpose);

		Thread thread=new Thread("Nylon",24,"Cloth drying","green");

		System.out.println("-----------------------------------------------------");

		System.out.println("Rope color : "+thread.color);
		System.out.println("Rope length : "+thread.length);
		System.out.println("Rope material : "+thread.material);
		System.out.println("Rope Purpose : "+thread.purpose);



	}

}