



/*
 * This class creates an String stack
 *
 * @author  Yoochan Han
 * @version 1.0
 * @since   2025-11-15
 */

/**
 * This is class program.
 */
public final class Vehicle {
    /**
    * Color of Car.
    */
    private static String color = "";
    /**
    * license plate number of Car.
    */
    private static String licensePlate = "";
    /**
    * limited speed of Car.
    */
    private static int maxSpeed = 0;
    /**
    * # of doors of Car.
    */
    private static int numberOfDoors = 0;
    /**
    * Speed of Car.
    */
    static int speed = 0;


    /**
     * 
     */
    public Vehicle(final String fColor, final String fLicensePlate,
    final int fNumberOfDoors, final int fMaxSpeed) {
        this.color = fColor;
        this.licensePlate = fLicensePlate;
        this.maxSpeed = fMaxSpeed;
        this.numberOfDoors = fNumberOfDoors;
        this.speed = 0;
    }


    public int accelerate(int power, int time) {
        /*
        * Accelerate, speed = power * time
        * speed <= maxSpeed
        */
        speed =+ power * time;
        if (speed <= maxSpeed) {
            return speed;
        }else {
            speed = maxSpeed;
            return speed;
        }
    }

    public int brake(int power, int time) {
        /*
        * break, speed = speed - power * time
        * speed >= 0
        */
       speed =- power * time;
        if (speed >= 0) {
            return speed;
        }else {
            speed = 0;
            return speed;
        }
    }

    public static void status() {
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("License plate number: " + licensePlate);
        System.out.println("Max speed: " + maxSpeed);
        System.out.println("Number of doors: " + numberOfDoors);
        //show status
    }

    public static String getColor() {
        // it returns an integer value of the number of elements in the stack
        return color;
        // System.out.print(color);
    }

    public static int getSpeed() {
        // it returns an integer value of the number of elements in the stack
        return speed;
    }
    public static void setColor(String newColor) {
        // it returns an integer value of the number of elements in the stack
        color = newColor;
        System.out.println(color);
    }

    public static void changeLicensePlate(String newLicensePlate) {
        // change lisence plate number
        licensePlate = newLicensePlate;
        // System.out.print(licensePlate);
    }
    
    public static int getDoorNumber() {
        // print door
        return numberOfDoors;
    // System.out.print(numberOfDoors);
        }
    }
