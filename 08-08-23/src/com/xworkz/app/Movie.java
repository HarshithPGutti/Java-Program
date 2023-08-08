package com.xworkz.app;

public class Movie extends Theater {

	@Override
	public void entertain() {
		System.out.println("invoking entertain in Movie");
		super.entertain();
	}

}
