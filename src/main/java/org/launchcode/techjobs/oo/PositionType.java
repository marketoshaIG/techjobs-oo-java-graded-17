package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {
    public PositionType(String value){
        super (value);
    }
}
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // Custom toString() method that returns the data stored in 'value'.
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    // Custom equals method. Two PositionType objects are "equal" when their id fields match.
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PositionType)) return false;
//        PositionType that = (PositionType) o;
//        return id == that.id;
//    }
//
//    // Custom hashCode method.
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
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
//}
//
