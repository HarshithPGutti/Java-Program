package com.xworkz.boot.Diamond;

import com.xworkz.app.Diamond.Diamond;
import com.xworkz.app.Diamond.Stone;

public class DiamondRunner {
	public static void main(String[] args) {

		System.out.println("Invoking main in DiamondRunner");

		Stone stone=new Stone();

		System.out.println("--------------------------------------------------------------");


		System.out.println("Is it brokeable ? "+stone.breakable);
		System.out.println("Is it shines? "+stone.shine);
		System.out.println("How much carrot ? "+stone.carat);
		System.out.println("Color of diamond is "+stone.color);


		System.out.println("--------------------------------------------------------------");

		Diamond diamond=new Diamond();

		System.out.println("--------------------------------------------------------------");

		System.out.println("Is it brokeable ? "+diamond.breakable);
		System.out.println("Is it shines? "+diamond.shine);
		System.out.println("How much carrot ? "+diamond.carat);
		System.out.println("Color of diamond is "+diamond.color);




	}

}