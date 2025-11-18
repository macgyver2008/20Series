/*
 * This class creates an String stack
 *
 * @author  Yoochan Han
 * @version 1.0
 * @since   2025-11-12
 */
import java.util.ArrayList;
import java.util.Arrays;
/**
 * This is class program.
 */
public final class HYCStack {
    
    static ArrayList<String> ITEM_ARRAY = new ArrayList<>(Arrays.asList());

    
    public static void pushItem(String item) {
        // push item into stackClass
        ITEM_ARRAY.add(item);
    }
    public static void showStack() {
        //show items in the Array
        System.out.println(ITEM_ARRAY);
    }
    
    public static void getSize() {
        // it returns an integer value of the number of elements in the stack
        int arrayLength = ITEM_ARRAY.size();
        System.out.println(arrayLength);
    }
    
    public static boolean isEmpty() {
        // it returns an integer value of the number of elements in the stack
        int arrayLength = ITEM_ARRAY.size();
        if (arrayLength == 0){
            System.out.print("True");
            return true;
        } else {
            System.out.print("False");
            return false;
        }
        
    }

    public static String getLast() {
        System.out.print(ITEM_ARRAY.get(ITEM_ARRAY.size() - 1));
        return(ITEM_ARRAY.get(ITEM_ARRAY.size() - 1));
    }

    public static String popItem() {
        // it returns an integer value of the number of elements in the stack
        System.out.print(ITEM_ARRAY.get(ITEM_ARRAY.size() - 1));
        int arrayLength = ITEM_ARRAY.size();
        ITEM_ARRAY.remove(arrayLength - 1);
        return (ITEM_ARRAY.get(ITEM_ARRAY.size() - 1));
        }

    public static void peekItem() {
        System.out.print(ITEM_ARRAY.get(ITEM_ARRAY.size() - 1));
    }

    public static void makeEmpty() {
        // it returns an integer value of the number of elements in the stack
        ITEM_ARRAY.clear();
    }
}
