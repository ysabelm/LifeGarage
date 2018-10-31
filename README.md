# LifeGarage


LifeGarage application consists in managing vehicles (cars&bikes) stock and sales.

## Car Class

A car is defined by its brand, its color and its price. Its properties are not visible. There are only 3 colors:

	Red = #FFFF00

	Green = #008000

	Blue =  #0000FF


## Garage Class

A garage is defined by its name and a list of cars which is empty. It has a `addCar` method which enables to add one vehicle or more.


## LifeGarage Application (only with cars)

*Implement classes and Color enum*

*Add and display the next car in the following way:*

brand, color, price

renault, rouge, 999.9

*Add and display the next cars in that way:*

brand, color, price

"peugeot",Color.GREEN, 1000

"volkswagen",Color.BLUE, 1500

"renault",Color.RED, 2000.5


## LifeGarage Application (we add motorbikes)

We add motorbikes and we want to display all the vehicles whose price is taxed.
Car tax: + 1 euro,
Bike tax: + 2 euros.

*Create an abstract class Vehicle and a Bike class according to the Unified Modeling Language*

In LifeGarage

*Add the following motorbikes*

brand, color, price

"harley", Color.RED, 800

"ducati", Color.BLUE, 1000

"bmw", Color.GREEN, 1999.9

*Display the vehicles in the garage, their price including tax.