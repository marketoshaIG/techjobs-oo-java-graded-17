package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{
    public Location(String value) {
        super(value); // Call the constructor of the parent class (JobField) to set the value.
    }

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    // Default constructor to initialize the id field
//    public Location() {
//        id = nextId;
//        nextId++;
//    }
//
//    // Constructor that takes a string as a parameter and assigns it to the 'value' field.
//    // It also calls the empty constructor to initialize the 'id' field.
//    public Location(String value) {
//        this(); // Call the default constructor to initialize 'id'
//        this.value = value; // Assign the 'value' field
//    }
//
//    // Custom toString, equals, and hashCode methods:
//
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }
}

