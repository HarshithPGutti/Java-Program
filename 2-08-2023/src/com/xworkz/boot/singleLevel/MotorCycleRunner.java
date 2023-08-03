package com.xworkz.boot.singleLevel;

import com.xworkz.app.single_level.MotorCycle;
import com.xworkz.app.single_level.Vehicle;

public class MotorCycleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MotorCycleRunner");
		
		Vehicle vehicle=new MotorCycle(12.0);
		vehicle.run();
		
		
	}

}
