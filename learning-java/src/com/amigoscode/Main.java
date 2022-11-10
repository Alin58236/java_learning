package com.amigoscode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class Main {

    static class Person{
        String name;
        Person(String name){
            this.name=name;

        }
    }



    public static void main(String[] args) {

        System.out.println("Hello world!");

        Person alin= new Person("Alin");

        System.out.println(alin.name + " ii smecher.");

        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);
    }
}