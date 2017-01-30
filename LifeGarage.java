package com.LifeGarage;

import java.util.ArrayList;
import java.util.List;



public class LifeGarage {
    public static void main(String[] args){
        Garage garage = new Garage("garage1");
        Car car1 = new Car("renault", "Red", 999.9f);

        garage.addCar(car1);

        Car car2 = new Car("peugeot", Color.Green, 1000.0f);
        Car car3 = new Car("wolkswagen", Color.Blue, 1500.0f);
        Car car4 = new Car("renault", Color.Red, 2000.5f);

        List<Car> cars = new ArrayList(Car);
        garage.addCar(cars);

        Bike bike1 = new Bike("harley", Color.Red, 800.0f );
        Bike bike2 = new Bike("ducati", Color.Blue, 1000.0f );
        Bike bike1 = new Bike("bmw", Color.Green, 1999.9f );

        List<Bike> bikes = new ArrayList<>(Bike);
        garage.addBike(bikes);

        System.out.println(garage);
    }
}
