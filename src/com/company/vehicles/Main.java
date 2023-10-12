package com.company.vehicles;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        Car bmw = new Car("bmw", 250, 15000);
        Car audi = new Car("audi", 270, 17000);
        Car lada = new Car("lada", 150, 7000);

        try {
             bmw.start();
            }
       catch (MyException e)
       {
           e.signal();
       }

        try {
            audi.start();
        }
        catch (MyException e)
        {
            e.signal();
        }
        try {
            lada.start();
        }
        catch (MyException e)
        {
            e.signal();
        }

    }
}
