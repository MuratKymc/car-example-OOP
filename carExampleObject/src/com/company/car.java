package com.company;

public class car {

    double speed;
    double engineVolume;
    double weight;
    String carColor;
    String carPlate;
    String carMark;
    double[] dimensions = new double[2];
    boolean isActive;
    double[] position = new double [2];

    public car(){
        this.speed = 50;
        this.engineVolume = 1.6;
        this.weight = 120;
        this.carColor = "yellow";
        this.carPlate = " 53 ARD 53";
        this.carMark = "renault";
        writeAttributes();
    }

    public car(String carColor){
        this.carColor = carColor;
        writeAttributes();
    }

    public car(double speed, double engineVolume, double weight, String carColor, String carPlate, String carMark, boolean isActive, double x, double y){
        this.speed = speed;
        this.engineVolume =engineVolume;
        this.weight = weight;
        this.carColor = carColor;
        this.carPlate = carPlate;
        this.carMark = carMark;
        this.isActive = isActive;
        this.position[0] = x;
        this.position[1] = y;
        writeAttributes();
    }

    public void writeAttributes(){
        System.out.println("Speed = " + this.speed);
        System.out.println("Engine Volume = " +this.engineVolume);
        System.out.println("Weight = " + this.weight);
        System.out.println("Car Color = " + this.carColor);
        System.out.println("Car Plate = " + this.carPlate);
        System.out.println("Car Mark = " + this.carMark);
        System.out.println("Is Active = " + this.isActive);
        System.out.println("Position x = " + this.position[0]);
        System.out.println("Position y = " + this.position[1]);
    }

    public void turnOnCar(){
        if(!isActive)
            this.isActive = true;
        else
            System.out.println("car is already active!");
    }

    public void turnOffCar(){
        if(isActive)
            this.isActive = false;
        else
            System.out.println("Car is already deactive!");
    }

    public void gas(int count){
        if(isActive)
            for(int i = 0 ; i<count ; i++)
            this.speed += (this.speed/10);
    }
    public void breaks(){
        if(isActive)
            this.speed -= (this.speed/5);


    }

}
