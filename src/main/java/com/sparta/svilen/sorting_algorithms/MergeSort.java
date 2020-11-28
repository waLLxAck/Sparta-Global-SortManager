package com.sparta.svilen.sorting_algorithms;

import com.sparta.svilen.interfaces.Sorter;
import com.sparta.svilen.factory.SortManager;
import com.sparta.svilen.utility.Printer;

import java.util.Arrays;

/**
 * MergeSort.java - an implementation of the MergeSort algorithm.
 * @author  Svilen Petrov
 * @version 1.0
 * @see SortManager
 */

public class MergeSort implements Sorter {
    @Override
    public void start(int[] arrayOfNumbers) {
        mergeSort(arrayOfNumbers);
        Printer.print(Arrays.toString(arrayOfNumbers));
    }

    public static void mergeSort(int[] arrayOfNumbers) {
        if (arrayOfNumbers.length < 2) {
            return;
        }
        int[] arrayOne = new int[arrayOfNumbers.length/2];
        int[] arrayTwo = new int[arrayOfNumbers.length - arrayOne.length];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (i < arrayOfNumbers.length/2){
                arrayOne[i] = arrayOfNumbers[i];
                continue;
            }
            arrayTwo[i-arrayOfNumbers.length/2] = arrayOfNumbers[i];
        }
        mergeSort(arrayOne);
        mergeSort(arrayTwo);

        merge(arrayOfNumbers, arrayOne, arrayTwo);
    }

    public static void merge(int[] arrayOfNumbers, int[] arrayOne, int[] arrayTwo) {
        int arrayOneCounter = 0, arrayTwoCounter = 0, arrayOfNumbersCounter = 0;
        while (arrayOneCounter < arrayOfNumbers.length/2 && arrayTwoCounter < arrayOfNumbers.length - arrayOfNumbers.length/2) {
            if (arrayOne[arrayOneCounter] <= arrayTwo[arrayTwoCounter]) {
                arrayOfNumbers[arrayOfNumbersCounter++] = arrayOne[arrayOneCounter++];
            }
            else {
                arrayOfNumbers[arrayOfNumbersCounter++] = arrayTwo[arrayTwoCounter++];
            }
        }
        while (arrayOneCounter < arrayOfNumbers.length) {
            if (arrayOneCounter < arrayOfNumbers.length/2){
                arrayOfNumbers[arrayOfNumbersCounter++] = arrayOne[arrayOneCounter++];
                continue;
            } else if (arrayTwoCounter < arrayOfNumbers.length - arrayOfNumbers.length/2){
                arrayOfNumbers[arrayOfNumbersCounter++] = arrayTwo[arrayTwoCounter++];
                continue;
            }
            arrayOneCounter++;
        }
    }
}
