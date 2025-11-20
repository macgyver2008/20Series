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
    static String color;
    final String licensePlate;
    final int maxSpeed;
    final int numberOfDoors;
    static int speed;

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

    public int break(int power, int time) {
        /*
        * break, speed = speed - power * time
        * speed >= 0
        */
       speed =- power * time;
        if (speed >= 0) {
            // return speed;
        }else {
            speed = 0;
            // return speed;
        }
    }

    public static void Status() {
        //show status
    }

    public static void getColor() {
        // it returns an integer value of the number of elements in the stack
        System.out.print(color);
    }

    public static void getSpeed() {
        // it returns an integer value of the number of elements in the stack
        System.out.print(speed);
    }
    public static void setColor(String newColor) {
        // it returns an integer value of the number of elements in the stack
        color = newColor;
        System.out.print(color);
    }

    public static String changeLicensePlate(String newLicensePlate) {
        // change lisence plate number
        licensePlate = newLicensePlate;
        System.out.print(licensePlate);
    }
    
    public static String getDoorNumber() {
        // print door
    System.out.print(numberOfDoors);
        
        }
    }
