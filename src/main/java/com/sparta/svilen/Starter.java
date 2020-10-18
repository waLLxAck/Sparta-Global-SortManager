package com.sparta.svilen;

import com.sparta.svilen.Interfaces.Sorter;

/**
 * Starter.java - Acts as a starting point for the application.
 * @author  Svilen Petrov
 * @version 1.0
 */

public class Starter {
    public static void start() {
        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getAlgorithm();
        sorter.start(chooseArray());
    }

    private static int[] chooseArray() {
        int choice;
        do {
            Printer.printArrayChoice();
            choice = InputCollector.getUserChoice();
        } while (choice < 1 || choice > 2);
        switch (choice) {
            case 1:
                return InputCollector.getThousandNumbers();
            case 2:
                return InputCollector.getArrayInput();
            default:
                return null;
        }
    }


}
