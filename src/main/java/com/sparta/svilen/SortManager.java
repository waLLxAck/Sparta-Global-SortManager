package com.sparta.svilen;

import com.sparta.svilen.Interfaces.Sorter;
import com.sparta.svilen.SortingAlgorithms.BinaryTreeImpl;
import com.sparta.svilen.SortingAlgorithms.BubbleSort;
import com.sparta.svilen.SortingAlgorithms.MergeSort;

/**
 * SortManager.java - a managing class for all sorting algorithms.
 * @author  Svilen Petrov
 * @version 1.0
 */

public class SortManager {
    public Sorter getAlgorithm() {
        int choice;
        do {
            Printer.printMenu();
            choice = InputCollector.getUserChoice();
        } while (choice < 1 || choice > 3);
        switch (choice) {
            case 1:
                return new BubbleSort();
            case 2:
                return new MergeSort();
            case 3:
                return new BinaryTreeImpl();
            default:
                return null;
        }
    }
}
