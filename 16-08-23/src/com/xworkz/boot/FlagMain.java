package com.xworkz.boot;

import com.xworkz.app.Flag;

public class FlagMain {
	System.out.println("Invoking main in Flag");

	Flag flag=new Flag();
	System.out.println(flag);

	System.out.println("_____________________________");

	Flag flag1=new Flag("India", "Tri-Color", 20);
	System.out.println(flag1);

	System.out.println("_____________________________");

	Flag flag2=new Flag("USA", "double-Color", 10);
	System.out.println(flag2);

}

}
