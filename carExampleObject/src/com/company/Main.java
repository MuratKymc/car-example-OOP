package com.company;

public class Main {

    public static void main(String[] args) {

        car c = new car();
        c.turnOnCar();
        System.out.println();
        c.writeAttributes();
        System.out.println();


        car c2 = new car(100,1.6, 550,"black","53 aab 35", "bmw" ,false, 10 ,9);

            c2.turnOnCar();
        System.out.println();
        c2.writeAttributes();

        c2.gas(3);
        c.breaks();
        System.out.println();

        c.writeAttributes();
        System.out.println();

        c2.writeAttributes();



    }
}
