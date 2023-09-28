package org.launchcode.techjobs.oo;
import java.util.Objects;
public abstract class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    // Create constructors, assigns a unique ID to each JobField
    public JobField() {
        id = nextId;
        nextId++;
    }
    // calls the first constructor and initializes id
    public JobField(String value) {
        this(); // calls the first constructor
        this.value = value; // assigns value parameter to value field
    }
    // GETTERS AND SETTERS
    public int getId() {
        return id;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    // My custom Methods: returns the data stored in 'value'
    @Override
    public String toString() {
        return value;
    }
    // Two objects are equal if they have the same id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobField = (JobField) o;
        return getId() == jobField.getId();
    }
    // gives the id a unique hashcode
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}


