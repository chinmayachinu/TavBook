package com.chinmaya.nonnull;

import com.chinmaya.Person;
import lombok.NonNull;

public class NonNullMainClass {
    public static void main(String[] args) {

        Person person1 = null;

        Person person = new Person(person1);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

    }

    @NonNull // gives compile time warning
    private static Person getPerson() {
        return null;
    }
}
