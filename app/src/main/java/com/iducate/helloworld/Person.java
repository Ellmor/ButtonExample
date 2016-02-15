package com.iducate.helloworld;

/**
 * Created by nezi2 on 15.02.2016.
 */
public class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isOld(){
        return this.age>40;
    }

    public String toString() {
        return name + ", " + age  +(isOld()?", is old":"");
    }

}
