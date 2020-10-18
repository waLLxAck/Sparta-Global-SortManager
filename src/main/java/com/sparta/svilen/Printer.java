package com.sparta.svilen;

import com.sparta.svilen.Exceptions.ChildNotFoundException;
import com.sparta.svilen.SortingAlgorithms.BinaryTreeImpl;

import java.util.Arrays;

/**
 * Printer.java - a class responsible for printing messages to the console.
 * @author  Svilen Petrov
 * @version 1.0
 */

public class Printer {
    //TODO: All prompts in one class that takes in string

    public static void print(Object object) {
        System.out.println(object);
    }

    public static void printArrayBeforeSort(int[] arrayOfNumbers) {
        System.out.println("Array before sort: " + Arrays.toString(arrayOfNumbers));
    }

    public static void printArrayAfterSort(int[] arrayOfNumbers) {
        System.out.println("Array after sort: " + Arrays.toString(arrayOfNumbers));
    }

    public static void printArraySizePrompt() {
        System.out.print("Enter Array size: ");
    }

    public static void printBinaryTreeInitialisationPrompt() {
        System.out.print("Enter a root node value: ");
    }

    public static void printEnterElements() {
        System.out.println("----- Enter Array elements -----");
    }

    public static void printMenu() {
        printTitle("Options Selection");
        System.out.println("Please choose from the following" +
                "\n1 - Start BubbleSort" +
                "\n2 - Start MergeSort" +
                "\n3 - Start Binary Tree Sort" +
                ""); //Add more menu options
    }

    private static void printTitle(String title) {
        System.out.println("----- " + title + " -----");
    }

    public static void printErr(String message) {
        System.err.println(message);
    }

    public static void printChoicePrompt() {
        System.out.print("Choice: ");
    }

    public static void printArrayItemPrompt(int currentItem, int arraySize) {
        System.out.print("Enter array item " + currentItem + " (of " + arraySize + "): ");
    }

    public static void printRightChild(BinaryTreeImpl binaryTree, int element) throws ChildNotFoundException {
        Printer.print("Right child of " + element + " is: " + binaryTree.getRightChild(element));
    }

    public static void printLeftChild(BinaryTreeImpl binaryTree, int element) throws ChildNotFoundException {
        Printer.print("Left child of " + element + " is: " + binaryTree.getLeftChild(element));
    }

    public static void printNodeAdded(int element) {
        print("Node " + element + " added.");
    }

    public static void printArrayChoice() {
        printTitle("Array Selection");
        System.out.println("Please choose from the following" +
                "\n1 - Use 1000 number array" +
                "\n2 - Input your own array" +
                ""); //Add more menu options
        printChoicePrompt();
    }

    public static void printTimeElapsed(String sorterName, float elapsedTime) {
        System.out.println(sorterName + " took a total of " +elapsedTime/1000000 + " ms.");
    }
}
