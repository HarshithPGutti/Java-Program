package com.xworkz.app;

public  class RajajinagarMetro extends Metro {
	@Override
    public String getNextStationName() {
        return "Majestic Station";
    }

    @Override
    public int getTotalPassengers() {
        return 1500;
    }

    @Override
    public void takeTicket() {
        System.out.println("Invoking Ticket taken");
    }

    @Override
    public void collectFare() {
        System.out.println("Invoking Fare collected");
    }

    @Override
    public void performMaintenance() {
        System.out.println("Invoking Performing maintenance");
    }

}
