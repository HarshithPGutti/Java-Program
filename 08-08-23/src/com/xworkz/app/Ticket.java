package com.xworkz.app;

public class Ticket {
	public String paper;

	public void enterMovie()
	{
		System.out.println("invoking enterMovie() in Ticket");

	}

	public void enterMovie(String paper)
	{
		System.out.println("invoking enterMovie(String) in Ticket");
	}

}
