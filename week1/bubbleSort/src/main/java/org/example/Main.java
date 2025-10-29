package org.example;

import java.util.Arrays;

/**
 * A driver class to demonstrate the BubbleSort implementation.
 */
public class Main {

    public static void main(String[] args) {
        // Instantiate the sorter
        BubbleSort sorter = new BubbleSort();

        // Arrays to be sorted (as specified in the task)
        Integer[][] arraysToSort = {
                {70, 61, 72, 83, 38},  // a)
                {7, 2, 76, 4, 99},     // b)
                {28, 9, 13, 78, 19},   // c)
                {68, 84, 41, 62, 18},  // d)
                {37, 57, 40, 13, 50}   // e)
        };

        // Labels for printing
        char label = 'a';

        System.out.println("--- Bubble Sort Demonstration ---");

        // Iterate through all arrays, sort them, and print the results
        for (Integer[] originalArray : arraysToSort) {
            // Create a copy for the sorter to modify, as it sorts in place (mutates the array)
            // This is good practice if we wanted to preserve the original array values.
            Integer[] arrayCopy = Arrays.copyOf(originalArray, originalArray.length);

            // 1. Sort the array
            Integer[] sortedArray = sorter.sort(arrayCopy);

            // 2. Print the results
            System.out.printf(
                    "%c) Original: %s%n   Sorted:   %s%n%n",
                    label,
                    Arrays.toString(originalArray),
                    Arrays.toString(sortedArray)
            );

            // Move to the next labelL
            label++;
        }
    }
}