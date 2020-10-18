package com.sparta.svilen;

import com.sparta.svilen.SortingAlgorithms.MergeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * MergeSortTester.java - Testing the MergeSort implementation.
 * @author  Svilen Petrov
 * @version 1.0
 * @see MergeSort
 */

public class MergeSortTester {
    static MergeSort mergeSort;
    static int[] arrayTest1;
    static int[] sortedArrayTest1;
    @BeforeAll
    static void setup() {
        mergeSort = new MergeSort();
        arrayTest1 = InputCollector.getThousandNumbers();
        sortedArrayTest1 = InputCollector.getThousandNumbers();
        Arrays.sort(sortedArrayTest1);
    }

    @Test
    @DisplayName("Comparing sorted array to the result of MergeSort-ed unordered array with the same values.")
    public static void mergeSortTest() {
        mergeSort.start(arrayTest1);
        Assertions.assertEquals(Arrays.toString(sortedArrayTest1), Arrays.toString(arrayTest1));
    }
}
