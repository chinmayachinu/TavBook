package com.chinmaya.val;

import com.chinmaya.Person;
import lombok.val;

public class ValMainClass {
    public static void main(String[] args) {
        final Person person = new Person("Chinmaya", "Panigrahi", 24);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        //person = new Person("chinu", "panigrahi", 24);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        final int age = 40;

        val name = "Chinmaya";
        System.out.println("name is => " + name);


    }

}
