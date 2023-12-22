package com.jtcarlos.springbootmvc.models;

public class Staff {
    private int id;
    private String firstName;
    private String lastName;
    private String position;

    public Staff() {}
    public Staff(int id, String firstName, String lastName, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public int getId() { return this.id; }
    public String getFirstName() { return this.firstName; }
    public String getLastName() { return this.lastName; }
    public String getPosition() { return this.position; }

    public void setId(int id) { this.id = id; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPosition(String position) { this.position = position; }
}
