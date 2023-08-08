package com.xworkz.boot;

import com.xworkz.app.BandDrum;
import com.xworkz.app.Bangle;
import com.xworkz.app.ChildDinasaur;
import com.xworkz.app.Coal;
import com.xworkz.app.Dinasaur;
import com.xworkz.app.Drum;
import com.xworkz.app.Flex;
import com.xworkz.app.FrontGate;
import com.xworkz.app.Gate;
import com.xworkz.app.GoldBangle;
import com.xworkz.app.GoodCoal;
import com.xworkz.app.Mic;
import com.xworkz.app.Movie;
import com.xworkz.app.PromotionFlex;
import com.xworkz.app.ShapeAmoeba;
import com.xworkz.app.Speaker;
import com.xworkz.app.Theater;
import com.xworkz.app.Ticket;
import com.xworkz.app.TicketCounter;

public class MainRunner {
	public static void main(String[] args) {

		System.out.println("invoking main in MainRunner");
		System.out.println("---------------------------------------");
		Coal coal=new GoodCoal();
		coal.burn();

		System.out.println("---------------------------------------");

		ShapeAmoeba shape= new ShapeAmoeba();
		shape.changeshape();

		System.out.println("---------------------------------------");

		Bangle bangle=new GoldBangle();
		bangle.makeSound();

		System.out.println("---------------------------------------");

		Gate frontgate=new FrontGate();
		frontgate.protect();

		System.out.println("---------------------------------------");

		Dinasaur dinasaur=new ChildDinasaur();
		dinasaur.makeSound();

		System.out.println("---------------------------------------");

		Flex flex=new PromotionFlex();
		flex.display();

		System.out.println("---------------------------------------");

		Mic mic=new Speaker();
		mic.inform();

		System.out.println("---------------------------------------");

		Drum drum=new BandDrum();
		drum.usedfor();

		System.out.println("---------------------------------------");

		Theater theater=new Movie();
		theater.entertain();

		System.out.println("---------------------------------------");

		Ticket ticket=new TicketCounter();
		ticket.enterMovie();

		System.out.println("---------------------------------------");




	}

}
