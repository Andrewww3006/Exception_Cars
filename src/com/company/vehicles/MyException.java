package com.company.vehicles;

public class MyException extends Exception{

    public void signal()
    {
        System.out.println("Машина не завелась");
    }


}
