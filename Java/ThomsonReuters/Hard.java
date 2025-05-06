package ThomsonReuters;

import java.util.StringJoiner;

public class Hard {
    public static void main(String[] args) {
        System.out.println("hello");

        Class c = Hard.class;
        System.out.println(c.getClassLoader());
        System.out.println(String.class.getClassLoader()); // null because it is loaded by the bootstrap class loader
    }
}

class Hard2 {
    public static void main(String[] args) {
        System.out.println("hello");

        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("a");
        sj.add("b");
        System.out.println(sj);
    }
}

//So the class name could be different from file name if the class is not public.
// out is the object of PrintStream class and println is the method of that.


/*
JVM Arch

JVM is loaded on the RAM.
It has three parts:-
1. class loader :- this loads the .class file to ram
2. bytecode verifier :- checks if the bytecode is valid or not
3. Execution engine :- converts the bytecode to machine code (JIT compiling)

JDK, JRE, JVM :- Platform dependent

-> JVM is the specification and JRE is the implementation.
-> JDK contains the JRE and other tools like javac, java, jdb etc.
 */

/*
Data Abstraction :- Hiding internal implementation and showing only the functionality to the user.
e.g. Brake in a car. We do not know how the brake is implemented, we just need to know how to use it.
-> This can be achieved by using interfaces & abstract classes.

Data Encapsulation :- bundles the data i.e. properties and methods that work on the data into a single unit.
-> Also known as Data Hiding.
-> We could put the data in a class and make it private so that it can be accessed only by the methods of that class.

Inheritance :- It allows us to define a class that inherits all the methods and properties from another class.
-> It can be of 4 types :- single, multiple, multilevel and hierarchical.
-> single :- one class inherits from one class.
-> multiple :- one class inherits from multiple classes. this is the diamond problem and not allowed in java.This can be avoided by using interfaces.
-> multilevel :- one class inherits from another class which in turn inherits from another class.
-> hierarchical :- hierarchical is two class inherited from one class.

Polymorphism :- It is the ability of an object to take many forms.
-> Runtime Polymorphism :- It is the ability of an object to take many forms at runtime. This is achieved by method overriding.
-> Compile Time Polymorphism :- It is the ability of an object to take many forms at compile time. This is achieved by method overloading
-> Based on return type overloading can not be done.It should be based on method arguments.
-> In method overriding everything should be same that is return type, method name and method arguments.

Object Relationship :- It is the relation between objects.
-> Is-a relationship :- e.g. A dog is a mammal. So a dog is a type of mammal.Basically it is a subtype of mammal.
-> Has-a relationship :- e.g. A car has a driver. So a car has a driver. Basically it is a part of driver.
-> it could be one to one, one to many or many to many. e.g. student has many courses, course has many students. so it is a many-to-many relationship.
-> Association :- relationship between two different objects. e.g. A student has a school. So a student is associated with a school.
-> it is of two types :- composition and aggregation.
-> Aggregation :- if one object is destroyed then the other object is not affected. e.g. a student object is destroyed then school object is not affected.
-> Composition :- if one object is destroyed then the other object is also destroyed. e.g if a building object is destroyed then bricks inside it are also destroyed.

 */

/*

 */