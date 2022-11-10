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


        // arrays

        int [] numbers = new int[3];

        numbers[0]=10;
        numbers[2]=4;
        numbers[1]=77;

        for(int i=0;i<=numbers.length-1;i++){
            System.out.println(numbers[i]);
        }

        //switch statements
        int i=1;
        switch (i){
            case 1:
                System.out.println("wtf1");
                break;
            case 2:
                System.out.println("wtf2");
                break;
            default:
                System.out.println("bun");
        }

    }
}