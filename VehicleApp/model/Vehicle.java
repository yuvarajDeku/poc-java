package com.vehicleapp.model;

/**
 * Vehicle class represents a vehicle with attributes like name, type, make, and remarks.
 * Follows Java standards and conventions.
 */
public class Vehicle {

    // Private fields to ensure encapsulation
    private String name;
    private String type;
    private String make;
    private String remarks;

    // Default constructor
    public Vehicle() {
    }

    // Parameterized constructor to initialize vehicle properties
    public Vehicle(String name, String type, String make, String remarks) {
        this.name = name;
        this.type = type;
        this.make = make;
        this.remarks = remarks;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter and Setter for remarks
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    // Override the toString method for better object representation
    @Override
    public String toString() {
        return "Vehicle [Name=" + name + ", Type=" + type + ", Make=" + make + ", Remarks=" + remarks + "]";
    }
}
