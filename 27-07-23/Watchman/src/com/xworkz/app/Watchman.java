package com.xworkz.app;

public class Watchman {
      public Gun gun;
      public void secure() {
    	  System.out.println("invoking secure in wathchman");
    	  gun.shoot();
      }
}
