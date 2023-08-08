package com.xworkz.app;

public class Speaker extends Mic {
	@Override
	public void inform() {
		System.out.println("Invoking inform() in Speaker");
		super.inform();
	}


}
