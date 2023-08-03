package com.xworkz.boot.Showroom;

import com.xworkz.app.Showroom.MobileShowroom;
import com.xworkz.app.Showroom.Showroom;
import com.xworkz.app.Showroom.ShowroomUtil;
import com.xworkz.app.Showroom.WatchShowroom;


public class ShowroomWinner {
	public static void main(String[] args) {
		System.out.println("Invoking main in ShowroomRunner");
		System.out.println("----------------------");
		Showroom showroom=new Showroom();
		WatchShowroom watchShowroom=new WatchShowroom();
		MobileShowroom mobileShowroom=new MobileShowroom();
		ShowroomUtil.run(watchShowroom);
		System.out.println("----------------------");
		ShowroomUtil.run(mobileShowroom);


	}

}


