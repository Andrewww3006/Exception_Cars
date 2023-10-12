package com.company.vehicles;

public class Main {

    public static void main(String[] args)  {
	// write your code here

        Car bmw = new Car();
        Car audi = new Car();
        Car lada = new Car();

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
