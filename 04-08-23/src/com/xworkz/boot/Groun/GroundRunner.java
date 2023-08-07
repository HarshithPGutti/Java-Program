package com.xworkz.boot.Groun;

import com.xworkz.app.Ground.Ground;
import com.xworkz.app.Ground.PlayGround;

public class GroundRunner {
	public static void main(String[] args) {

		System.out.println("Invoking main in GroundRunner");

		System.out.println("----------------------------------------------------------------------");

		Ground ground=new Ground();

		System.out.println("----------------------------------------------------------------------");

		System.out.println("Name of the ground "+ground.name);
		System.out.println("Location of the ground "+ground.location);
		System.out.println("Metro station near ground "+ground.nearMetroStation);
		System.out.println("Shape of the ground "+ground.shape);

		System.out.println("----------------------------------------------------------------------");

		PlayGround playground=new PlayGround("Ramamandir","RajajiNagar","Magadi","Rectangle");

		System.out.println("----------------------------------------------------------------------");




	}

}