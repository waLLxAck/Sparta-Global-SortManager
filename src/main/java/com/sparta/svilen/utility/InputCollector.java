package com.sparta.svilen.utility;

import com.sparta.svilen.exceptions.EmptyArrayException;
import com.sparta.svilen.start.Starter;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;

/**
 * InputCollector.java - a class that deals with system and user input.
 * @author  Svilen Petrov
 * @version 1.0
 * @see Starter
 */

public class InputCollector {
    private static Scanner input = new Scanner(System.in);

    private InputCollector() {
        //Makes class non-instantiable
    }

    public static int[] getArrayInput() {
        int arraySize;
        int[] arrayOfNumbers;
        while (true) {
            try {
                Printer.printArraySizePrompt();
                arraySize = input.nextInt();
                arrayOfNumbers = new int[arraySize];

                Printer.printEnterElements();
                for (int i = 0; i < arraySize; i++) {
                    Printer.printArrayItemPrompt(i+1, arraySize);
                    arrayOfNumbers[i] = getUserChoiceInt();
                }
                if (arrayOfNumbers.length<1) {
                    throw new EmptyArrayException("Array size must be greater than 0!");
                }

                return arrayOfNumbers;
            } catch (InputMismatchException ime) {
                Printer.print("Only numbers allowed!");
                Log.logError(ime);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                resetScanner();
            }
        }
    }

    public static int getBinaryTreeRootNodeInput() {
        Printer.printBinaryTreeInitialisationPrompt();
        return getUserChoiceInt();
    }

    public static int getUserChoiceInt() {
        return input.nextInt();
    }

    public static String getUserAlgorithmChoice() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            Printer.displayAlgorithmChoice();
            Printer.displayChoicePrompt();
            try {
                input = scanner.nextLine();
                if (FileRetriever.getFileString().lines().anyMatch(Predicate.isEqual(input))){
                    return input;
                }
                else throw new InputMismatchException("Invalid input.");
            } catch (Exception e) {
                displayErrorMessage();
            }
        } while (true);
    }

    private static void displayErrorMessage() {
        Printer.displayError();
        Sleeper.sleep(100);
    }

    private static void resetScanner(){
        input = new Scanner(System.in);
    }

    public static int[] getThousandNumbers() {
        return ThreadLocalRandom.current().ints(1000, 0, 10000 ).toArray();
    }
}
