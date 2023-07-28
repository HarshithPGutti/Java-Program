package com.xworkz.boot;

import com.xworkz.app.Country;
import com.xworkz.app.HomeMinister;
import com.xworkz.app.PersonalAssitant;
import com.xworkz.app.President;
import com.xworkz.app.PrimeMinister;
import com.xworkz.app.SecurityHead;
import com.xworkz.app.StateFrom;

public class CountryRunner {
public static void main(String[] args) {
		
		Country country=new Country();
		
		String name=country.name;
		System.out.println("Country name is: "+name);
		
	    int code=country.code;
	    System.out.println("Country code is: "+code);
	    
	    System.out.println("###############################################");

	    
	    President president=country.president;
	    
	    String presidentName=president.PresidentName;
	    System.out.println("President name: "+presidentName);
	    
	    int age=president.age;
	    System.out.println("President age: "+age);
	    
	    System.out.println("###############################################");

	    PrimeMinister primeMinister=country.primeMinister;
	    
	    String party=primeMinister.party;
	    System.out.println("PrimeMinister party: "+party);
	    
	    int noOfYearAsPm=primeMinister.noOfYearAsPm;
	    System.out.println("Number Of yeras as PM: "+noOfYearAsPm);

	    System.out.println("###############################################");
	    
	    SecurityHead securityHead=primeMinister.securityHead;
	    
	    String headName=securityHead.headName;
	    System.out.println("Security Head Name: "+headName);
	    
	    double salary=securityHead.salary;
	    System.out.println("Security Head Salary: "+salary);

	    System.out.println("###############################################");

	    PersonalAssitant personalAssitant=primeMinister.personalAssitant;
	    
	    String paName=personalAssitant.paName;
	    System.out.println("PersonalAssitant name: "+paName);
	    
	    String qualification=personalAssitant.qualification;
	    System.out.println("PersonalAssitant qualification: "+qualification);

	    System.out.println("###############################################");
	    
	    HomeMinister homeMinister=primeMinister.homeMinister;
	    
	    String education=homeMinister.education;
	    System.out.println("HomeMinister education: "+education);
	    
	    String office=homeMinister.office;
	    System.out.println("HomeMinister office: "+office);
	    
	    System.out.println("###############################################");

	    
	    StateFrom stateFrom=president.stateFrom;
	    
	    String state=stateFrom.state;
	    System.out.println("President state: "+state);

	   
	    String profession=stateFrom.profession;
	    System.out.println("President profession: "+profession);


	    
	    


	    
		
	}

}

