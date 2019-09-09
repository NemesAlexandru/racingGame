package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //this is a one-line comment

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1600;

        Car car = new Car(engine);
        car.setName("Dacia");
        car.setFuelLevel(60);
        car.setMileage(8.5);
        car.doorCount = 5;
        car.setMaxSpeed(180);
        car.setFuelType("Gasoline");

        System.out.println("Car object: " + car.toString());
        //System.out.println("Car object: " + car);

        System.out.println(car.getName());
        System.out.println(car.getTraveledDistance());
        System.out.println(car.isRunning());

        car.accelerate(60, 1);

        Engine engine2 = new Engine();
        engine2.manufacturer = "VW";
        engine2.capacity = 1600;

        Car car2 = new Car(engine2);
        car2.setName("Golf");
        car2.setFuelType("Diesel");
        car2.setMileage(7);
        car2.setFuelLevel(50);
        car2.setMaxSpeed(200);
        car2.doorCount = 3;

        car.setName("Skoda");

//        car.name = null;

        //concatenation
        System.out.println("Car 2 name: " + car2.getName());
        System.out.println("Car 1 name: " + car.getName());

        //car = car2;

        System.out.println("Modulo Examples");
        System.out.println(4 % 2);
        System.out.println(4 % 3);

        System.out.println("Please Enter Some Text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("Input from User " + text);

       // System.out.println("Static variables example: ");

//        car.totalCount = 1;
//        System.out.println("Total count in car: " + car.totalCount);
//        car2.totalCount = 12;
//        System.out.println("Total count in car after setting car2: " + car.totalCount);
//        System.out.println("Total count in car2: " + car2.totalCount);
//        System.out.println("Total count in Car class: " + Car.totalCount); //this line is ok
//        //we should only call static variables from class itself (Car),
//        //not from a variable containing an object of that class

        Vehicle hybridCar = new HybridCar();
        hybridCar.setName("cheater");
        hybridCar.accelerate(60, 1);
        System.out.println("Traveled Distance " + hybridCar.getTraveledDistance());
        System.out.println("Fuel Level " + hybridCar.getFuelLevel());

        //method implementation from object's class not from variable's class

        hybridCar.accelerate(60, 1);
        System.out.println("Fuel Level: " + hybridCar.getFuelLevel());
        System.out.println("Traveled Distance: " + hybridCar.getTraveledDistance());

        //variable type decides what methods can be invoked
        ((HybridCar) hybridCar).fly();
        //casting
    }
}
