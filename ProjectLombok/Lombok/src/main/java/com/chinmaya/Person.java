package com.chinmaya;

import lombok.Getter;
import lombok.NonNull;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person (String firstName, String lastName, int age) {
        this.firstName = firstName.toLowerCase();
        this.lastName = lastName;
        this.age = age;
    }

    public Person (@NonNull Person person) {
        this.firstName = person.getFirstName();
        this.lastName = person.getLastName();
        this.age = person.getAge();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
