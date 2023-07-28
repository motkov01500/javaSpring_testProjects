package org.example;

public class Main {
    public static void main(String[] args) {

        Car firCar = new Car("audi" ,"test");
        Car secCar = new Car("audi" ,"test");
        System.out.println(firCar.equals(secCar));
    }
}