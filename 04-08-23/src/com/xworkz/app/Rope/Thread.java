package com.xworkz.app.Rope;

public class Thread extends Rope {
	public Thread() {
		super();
		System.out.println("Invoking no-arg const in Thread");
	}

	public Thread(String material,int length,String purpose,String color)
	{

		super(material,length,purpose,color);
		System.out.println("invoking String,int String,String const in Thread");
	}


}
