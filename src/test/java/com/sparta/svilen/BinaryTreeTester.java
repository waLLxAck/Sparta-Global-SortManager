package com.sparta.svilen;

import com.sparta.svilen.sorting_algorithms.BinaryTreeImpl;
import com.sparta.svilen.utility.InputCollector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * BinaryTreeTester.java - Testing the binary tree implementation.
 * @author  Svilen Petrov
 * @version 1.0
 * @see BinaryTreeImpl
 */

public class BinaryTreeTester {
    static BinaryTreeImpl binaryTree;
    static int[] arrayTest1;
    static int[] sortedArrayTest1;

    @BeforeAll
    static void setBinaryTree(){
        binaryTree = new BinaryTreeImpl(1000);
        arrayTest1 = InputCollector.getThousandNumbers();
        sortedArrayTest1 = InputCollector.getThousandNumbers();
        Arrays.sort(sortedArrayTest1);
    }

    @Test
    @DisplayName("Comparing sorted array to the result of BinaryTree sorted array with the same values.")
    public static void binaryTreeSortTest() {
        binaryTree.start(arrayTest1);
        Assertions.assertEquals(Arrays.toString(sortedArrayTest1), Arrays.toString(arrayTest1));
    }

}
