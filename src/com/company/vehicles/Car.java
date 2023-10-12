package com.company.vehicles;

import java.util.Random;

public class Car{

    private String brand;
    private double speed;
    private double price;

    public Car(){}

    public Car(String brand, double speed, double price)
    {

        this.brand = brand;
        this.speed = speed;
        this.price = price;

    }

    public void setBrand (String brand)
    {
        this.brand=brand;
    }

    public String getBrand(String brand)
    {
          return this.brand;
    }


    public void setSpeed(double speed)
    {
        this.speed = speed;
    }

    public  double getSpeed(double speed)
    {
        return this.speed;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public  double getPrice(double price)
    {
        return this.price;
    }

        public void start() throws MyException{

            Random r = new Random();
            int i = r.nextInt(20);

            if (i%2 == 0) {
                throw new MyException();
            }
            else
            System.out.println("ok " + i);



        }



}
