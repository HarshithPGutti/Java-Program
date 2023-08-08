package com.xworkz.app.Diamond;

public class Stone extends Diamond {
	public Stone()  {
		super();
		System.out.println("Invoking no-arg const in Stone");
	}

	public Stone(boolean shine,boolean breakable,int carat,String color) {

		System.out.println("invoking no-arg const in Stone");
		this.shine=shine;
		this.breakable=breakable;
		this.carat=carat;
		this.color=color;
	}

}

