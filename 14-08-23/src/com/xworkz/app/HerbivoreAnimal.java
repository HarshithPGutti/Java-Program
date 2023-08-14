package com.xworkz.app;

public class HerbivoreAnimal extends Animal {
	@Override
    public String getName() {
        return "Elephant";
    }

    @Override
    public int getAge() {
        return 5;
    }

    @Override
    public void roam() {
        System.out.println("Animal is roaming around.");
    }

    @Override
    public void reproduce() {
        System.out.println("Animal is reproducing.");
    }

    @Override
    public void habitat() {
        System.out.println("Animal lives in the savanna.");
    }


}