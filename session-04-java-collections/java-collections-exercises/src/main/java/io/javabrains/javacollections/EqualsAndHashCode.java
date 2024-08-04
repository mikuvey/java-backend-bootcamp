package io.javabrains.javacollections;

import java.util.Date;

/*
Generate a Person class with the member variables firstName, lastName, age, lastModifiedDate.
Generate equals and hashcode methods using member variables firstName, lastName, age
Compare two instances of Person that have the same data
*/


public class EqualsAndHashCode {

    public static void main(String[] args) {

    }
}

class Person {
    private String firstName;
    private String lastName;
    private Date lastModifiedDate;

    //Equals
    @Override
    public boolean equals(Object o){
        return true; //YEt to implement
    }

    // Getters and Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setLastModifiedDate(Date lastModifiedDate){
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Date getLastModifiedDate(){
        return this.lastModifiedDate;
    }
}