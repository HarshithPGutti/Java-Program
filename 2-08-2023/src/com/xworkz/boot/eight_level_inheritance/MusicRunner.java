package com.xworkz.boot.eight_level_inheritance;

import com.xworkz.app.eight_Level_inheritance.FenderStratocaster;

public class MusicRunner {

	public static void main(String[] args) {
		FenderStratocaster guitar = new FenderStratocaster("Electric Guitar", 6, "Solid Body", "Single Coil", true, "Sunburst");
        
		System.out.println("---------------------------------------------------------------------------------------------------------");
		
		guitar.playSound();

	}

}
