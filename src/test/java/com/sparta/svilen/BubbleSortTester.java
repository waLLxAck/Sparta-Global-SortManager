package com.sparta.svilen;

import com.sparta.svilen.sorting_algorithms.BubbleSort;
import com.sparta.svilen.utility.InputCollector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * BubbleSortTester.java - Testing the BubbleSort implementation.
 * @author  Svilen Petrov
 * @version 1.0
 * @see BubbleSort
 */

public class BubbleSortTester {
    static BubbleSort bubbleSort;
    static int[] arrayTest1;
    static int[] sortedArrayTest1;
    @BeforeAll
    static void setup() {
        bubbleSort = new BubbleSort();
        arrayTest1 = InputCollector.getThousandNumbers();
        sortedArrayTest1 = InputCollector.getThousandNumbers();
        Arrays.sort(sortedArrayTest1);
    }

    @Test
    @DisplayName("Comparing sorted array to the result of BubbleSort-ed unordered array with the same values.")
    public static void bubbleSortTest() {
        bubbleSort.start(arrayTest1);
        Assertions.assertEquals(Arrays.toString(sortedArrayTest1), Arrays.toString(arrayTest1));
    }
}
