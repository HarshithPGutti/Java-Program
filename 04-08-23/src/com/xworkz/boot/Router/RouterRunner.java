package com.xworkz.boot.Router;

import com.xworkz.app.Route.AirtelRouter;
import com.xworkz.app.Route.Router;

public class RouterRunner {
	public static void main(String[] args) {
		System.out.println("invoking main in RouetrRunner");

		System.out.println("----------------------------------------------------------");

		Router router=new Router();

		System.out.println("------------------------------------------------------------");
		System.out.println("Name of the Router "+router.name);
		System.out.println("Purpose of teh router "+router.purpose);
		System.out.println("Speed of the Router "+router.speed);
		System.out.println("Price of the router "+router.price);

		System.out.println("------------------------------------------------------------");

		AirtelRouter airtel=new AirtelRouter( "Internet","Jio",1500,2400);



	}

}
