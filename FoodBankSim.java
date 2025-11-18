// Copyright (c) 2025 St. Mother Teresa HS All rights reserved.

// Created by: Yoochan Han
// Created on: Oct 2025
// program for get user order and output food
import java.util.*;

public class FoodBankSim{
    public static void main(String[] args) {
    Scanner scamer = new Scanner(System.in);
    System.out.println("plsease order with numbers.\n");
    System.out.println()
    int productName = scamer.nextInt();
    double average = 0;
    ArrayList<Integer> myArray = new ArrayList<Integer>();
        // get the number elements
        for (int i=0; i < repeats; i++){
            System.out.print("input Your number: ");
            int elements = scamer.nextInt();
            average += elements;
            String Stringelements = "" + elements;
            myArray.add(elements);
        }
        average = average / repeats;
        System.out.println("The numbers are: " + myArray);
        System.out.println("The Average of numbers is: " + average);
        System.out.println("\nDone.");
        
    }
}



// Copyright (c) 2025 St. Mother Teresa HS All rights reserved.

// Created by: Yoochan Han
// Created on: Sep 2025
// program for get 5 interger and gets average

#include <iostream>
#include <vector>
#include <numeric>

int main() {
    int repeats = 5;
    double average = 0;
    std::vector<int> myArray;
    for (int i = 0; i < repeats; i++) {
        std::cout << "input Your number: ";
        int elements;
        std::cin >> elements;
        average += elements;
        myArray.push_back(elements);
    }

    average = average / repeats;
    std::cout << "The numbers are: ";
    for (size_t i = 0; i < repeats; ++i) {  // print list
        std::cout << myArray[i];
        if (i != myArray.size() - 1) std::cout << ", ";
    }
    std::cout << "\n";
    std::cout << "The Average of numbers is: " << average << "\n";
    std::cout << "\nDone.\n";
    return 0;
}

