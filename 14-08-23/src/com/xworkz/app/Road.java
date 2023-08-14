package com.xworkz.app;

public abstract class Road {
	public void open() {
        System.out.println("Road is now open.");
    }

    public void close() {
        System.out.println("Road is now closed.");
    }

    public void startTraffic() {
        System.out.println("Invoking startTraffic");
    }

    public void stopTraffic() {
        System.out.println("Invoking stopTraffic");
    }

    public void maintain() {
        System.out.println("Invoking maintain");
    }

    public abstract String getRoadType();
    public abstract void markLanes();
    public abstract void controlTraffic();
    public abstract void construct();
    public abstract void inspect();


}