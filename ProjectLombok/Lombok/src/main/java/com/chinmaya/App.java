package com.chinmaya;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        Person person = new Person("Chinmaya", "Panigrahi", 24);

        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        person = new Person("chinu", "panigrahi", 24);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
    }
}
