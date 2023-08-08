package com.xworkz.app.Diamond;

public class Diamond {
	public boolean shine;
	public boolean breakable;
	public int carat;
	public String color;

	public Diamond()
	{
		this(true,false,24,"green");
		System.out.println("Invoking no-arg const in Diamond");

	}

	public Diamond(boolean shine,boolean breakable,int carat,String color) {
		// TODO Auto-generated constructor stub
		System.out.println("invoking no-arg const in Diamond");
		this.shine=shine;
		this.breakable=breakable;
		this.carat=carat;
		this.color=color;

	}

}