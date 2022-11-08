package hackerank.ubs;

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
class Car{
    public void printTopSpeed()
    {
        System.out.println("Top speed of the vehicle is 100 kmph");
    }
    public void printTopSpeed(int topSpeed)
    {
        System.out.println("Top speed of the vehicle is " +topSpeed+ " kmph ");
    }
    public void printTopSpeed(String vehicleName,int topSpeed)
    {
        System.out.println("Top speed of the vehicle " +vehicleName+ " is " +topSpeed+ " kmph ");
    }
    public void fuelType()
    {
        System.out.println("Car fuel type is Petrol");
    }


}

    public class Solution {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                String input = sc.nextLine();
                Car suv = new Car();
                if (input.equals("topSpeed")) {
                    suv.printTopSpeed();
                }
                if (input.equals("fuelType")) {
                    suv.fuelType();
                }
                Car car = new Car();
                if (input.equals("topSpeed")) {
                    car.printTopSpeed();
                    ;
                }
                if (input.equals("fuelType")) {
                    car.fuelType();
                }

            }
        }
    }


