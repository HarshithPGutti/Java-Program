package com.xworkz.app.Mushroom;

public class PoisonMushroom extends Mushroom {
	public PoisonMushroom() {
		super();
		System.out.println("Invoking no-const arguement in PoisonMushroom");
		}

		public PoisonMushroom(boolean taste , String color,String season,double price)
		{
			super(taste ,color,season, price);

			System.out.println("Invoking boolean,string ,string,double const in PoisonMushroom");
		}
}
