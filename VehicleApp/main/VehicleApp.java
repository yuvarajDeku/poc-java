package com.vehicleapp.main;

import com.vehicleapp.model.Vehicle;

/**
 * Main class to test the Vehicle class and add sample vehicle details.
 */
public class VehicleApp {

    public static void main(String[] args) {
        // Create a Vehicle object using the parameterized constructor
        Vehicle vehicle1 = new Vehicle("Toyota Camry", "Sedan", "Toyota", "Family car");

        // Display the vehicle details using toString
        System.out.println(vehicle1);

        // Modify vehicle details using setter methods
        vehicle1.setRemarks("Popular for long trips");
        System.out.println("Updated Vehicle: " + vehicle1);

        // Create another vehicle using setters
        Vehicle vehicle2 = new Vehicle();
        vehicle2.setName("Ford Mustang");
        vehicle2.setType("Sports");
        vehicle2.setMake("Ford");
        vehicle2.setRemarks("High-performance sports car");

        // Display the second vehicle details
        System.out.println(vehicle2);
    }  
}
