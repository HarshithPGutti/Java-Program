package com.xworkz.app;

public class RuralRoad extends Road {
	@Override
	public String getRoadType() {
		return "Rural Roads";
	}

	@Override
	public void markLanes() {
		System.out.println("Invoking markLanes");		
	}

	@Override
	public void controlTraffic() {
		System.out.println("Invoking controlTraffic");	

	}

	@Override
	public void construct() {
		System.out.println("Invoking construct");	

	}

	@Override
	public void inspect() {
		System.out.println("Invoking inspect");	

	}



}