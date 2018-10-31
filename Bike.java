package com.LifeGarage;


public class Bike extends Vehicle {

    public Bike(String brand, Color color, float price) {
        super(brand, color, price);
    }
    
    @Override
    public float getPriceWithTax() {
        int tax = 1;
        return price + tax;
    }
}
