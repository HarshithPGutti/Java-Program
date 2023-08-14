package com.xworkz.boot;

import com.xworkz.app.Metro;
import com.xworkz.abstractTask.app.RajajinagarMetro;

public class MetroRunner {
	public static void main(String[] args) {
		System.out.println("Running main in MetroRunner");
		Metro metro = new RajajinagarMetro();
		metro.openDoors();
		metro.startMoving();
		metro.announceArrival();
		metro.stopMoving();
		metro.closeDoors();

		System.out.println("Next station: " + metro.getNextStationName());
		System.out.println("Total passengers: " + metro.getTotalPassengers());
		metro.takeTicket();
		metro.collectFare();
		metro.performMaintenance();

	}

}
