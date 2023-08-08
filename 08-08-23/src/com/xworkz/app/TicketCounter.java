package com.xworkz.app;

public class TicketCounter extends Ticket {
	@Override
	public void enterMovie() {
		System.out.println("invoking enterMovie() in TicketCounter");
		super.enterMovie();
	}

}
