package com.LifeGarage;

import java.util.List;


public class Garage {
    private String name;
    private List<Car> cars;
    private List<Bike> bikes;

    public Garage(String name, List<Car> cars, List<Bike> bikes) {
        this.name = name;
        this.cars = cars;
        this.bikes = bikes;
    }
    public String getName() {
        return name;
    }
    public List<Car> getCars() {
        return cars;
    }
    public List<Bike> getBikes() {
        return bikes;
    }
    public void setCars(List<Car> cars) {
        return cars;
    }
    public void setBikes(List<Bike> bikes) {
        return bikes;
    }
    public void addCar(Car car) {
        cars.add(car);
    }
    public void addBike(Bike bike) {
        bikes.add(bike);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                ", cars='" + cars + '\'' +
                ", bikes='" + bikes +
                '}'
    }
}
