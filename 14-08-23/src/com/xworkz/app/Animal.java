package com.xworkz.app;

public abstract class Animal {
	public void eat() {
        System.out.println("Animal is eating.");
    }

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }

    public void move() {
        System.out.println("Animal is moving.");
    }

    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }

    public void breathe() {
        System.out.println("Animal is breathing.");
    }

    public abstract String getName();
    public abstract int getAge();
    public abstract void roam();
    public abstract void reproduce();
    public abstract void habitat();


}
