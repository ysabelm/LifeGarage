package com.LifeGarage;


public abstract class Vehicle {
    private String brand;
    private Color color;
    private float price;

    public abstract float getPriceWithTax();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand ='" + brand + '\'' +
                ", color ='" + color + '\'' +
                ", price ='" + getPriceWithTax() +
                '}';
    }
}