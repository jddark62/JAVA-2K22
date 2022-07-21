/*
 * Implement a class Car with the following properties. 
 * A car has a certain fuel efficiency 
 * (measured in miles/gallon or liters/km—pick one) 
 * and a certain amount of fuel in the gas tank. 
 * The efficiency is specified in the constructor, 
 * and the initial fuel level is 0. 
 * Supply a method drive that simulates driving the car for a certain 
 * distance, reducing the fuel level in the gas tank, and methods 
 * getFuelLevel, returning the current fuel level, and tank, to tank up. 
 * Sample usage:
 * Car mycar = new Car(29); // 29 miles per gallon
 * mycar.tank(20); // tank 20 gallons
 * mycar.drive(100); // drive 100 miles
 * System.out.println(mycar.getFuelLevel()); 
 */

 class Car {
    private double efficiency;
    private double fuel;

    //Constructor
    public Car(double efficiency){
        this.efficiency = efficiency;
        this.fuel = 0;
    }

    public void drive(double distance){
        double fuelConsumed = distance/efficiency;
        fuel -= fuelConsumed;
    }

    public double getGas(){
        return fuel;
    }

    public void tank (double f){
        fuel += f;
    }

 }

 /**
  * three
  */
 public class three {
 
    public static void main(String[] args) {
        Car myHybrid = new Car(29);
        myHybrid.tank(20);
        myHybrid.drive(100);
        System.out.println(myHybrid.getGas());
    }
 }