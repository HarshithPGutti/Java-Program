package com.xworkz.app;

public class BandDrum extends Drum {
	@Override
	public void usedfor() {
		System.out.println("Invoking usedfor() in BandDrum");
		super.usedfor();
	}

}