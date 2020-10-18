package com.sparta.svilen.SortingAlgorithms;

import com.sparta.svilen.Exceptions.EmptyArrayException;
import com.sparta.svilen.Printer;
import com.sparta.svilen.Interfaces.Sorter;

/**
 * BubbleSort.java - an implementation of the BubbleSort algorithm.
 * @author  Svilen Petrov
 * @version 1.0
 * @see com.sparta.svilen.SortManager
 */

public class BubbleSort implements Sorter {

    @Override
    public void start(int[] arrayOfNumbers) {
        sort(arrayOfNumbers);
    }

    private void sort(int[] arrayOfNumbers) {
        int temp;
        try {
            if (arrayOfNumbers.length<1) {
                throw new EmptyArrayException("Array size must be greater than 0!");
            }
        } catch (EmptyArrayException e) {
            e.printStackTrace();
            return;
        } catch (NullPointerException npe) {
            Printer.print("Array undefined.");
            npe.printStackTrace();
            return;
        } catch (Exception e) {
            Printer.print(e.getMessage());
            e.printStackTrace();
            return;
        }

        Printer.printArrayBeforeSort(arrayOfNumbers);
        for (int i = 0; i < arrayOfNumbers.length-1; i++) {
            for (int j = 0; j < arrayOfNumbers.length-1-i; j++){
                if (arrayOfNumbers[j] > arrayOfNumbers[j+1]){
                    temp = arrayOfNumbers[j];
                    arrayOfNumbers[j] = arrayOfNumbers[j+1];
                    arrayOfNumbers[j+1] = temp;
                }
            }
        }
        Printer.printArrayAfterSort(arrayOfNumbers);
    }
}
