package com.xworkz.app;

public abstract class Metro {
	public void openDoors() {
        System.out.println("Doors are now open");
    }

    public void closeDoors() {
        System.out.println("Doors are now closed");
    }

    public void startMoving() {
        System.out.println("Metro is starting to move");
    }

    public void stopMoving() {
        System.out.println("Metro has stopped moving");
    }

    public void announceArrival() {
        System.out.println("Metro Announce Arrival");
    }


    public abstract String getNextStationName();
    public abstract int getTotalPassengers();
    public abstract void takeTicket();
    public abstract void collectFare();
    public abstract void performMaintenance();



}
