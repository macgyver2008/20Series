/*
 * This class creates an String stack
 *
 * @author  Yoochan Han
 * @version 1.0
 * @since   2025-11-15
 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 * This is class program.
 */
public final class Vehicle {
    // static ArrayList<String> ITEM_ARRAY = new ArrayList<>(Arrays.asList());


    public static int accelerate(int power, int time) {
        /*
        * Accelerate, speed = power * time
        */
       return int speed;
    }
    public static void Status() {
        //show items in the Array
        System.out.println(ITEM_ARRAY);
    }
    
    public static void getSpeed() {
        // it returns an integer value of the number of elements in the stack
        int arrayLength = ITEM_ARRAY.size();
        System.out.println(arrayLength);
    }
    
    public static String changeLIisencePlate(String LIisencePlate) {
        // change lisence plate number
        
    }
    
    public static String popItem() {
        // it returns an integer value of the number of elements in the stack
        int arrayLength = ITEM_ARRAY.size();
        ITEM_ARRAY.remove(arrayLength - 1);
        return ITEM_ARRAY.getLast();
        // if (arrayLength == 0) {
        //     ITEM_ARRAY{arrayLength} = ;
        //     return true;
        // } else {
        //     System.out.println("False");
            // return false;
        }
    public static void peekItem() {
        System.out.println(ITEM_ARRAY.get(0));
    }
    }

