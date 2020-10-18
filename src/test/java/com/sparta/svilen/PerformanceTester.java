package com.sparta.svilen;

import com.sparta.svilen.Interfaces.Sorter;
import com.sparta.svilen.SortingAlgorithms.BinaryTreeImpl;
import com.sparta.svilen.SortingAlgorithms.BubbleSort;
import com.sparta.svilen.SortingAlgorithms.MergeSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * PerformanceTester.java - Testing the performance of each sorting algorithm.
 * @author  Svilen Petrov
 * @version 1.0
 * @see Sorter
 */

public class PerformanceTester {
    static int[] aThousandNumberArray;

    @BeforeAll
    static void setup() {
        aThousandNumberArray = InputCollector.getThousandNumbers();
    }

    @Test
    @DisplayName("Testing BubbleSort performance.")
    public void BubbleSortPerformance() {
        checkPerformance(new BubbleSort());
    }

    @Test
    @DisplayName("Testing MergeSort performance.")
    public void MergeSortPerformance() {
        checkPerformance(new MergeSort());
    }

    @Test
    @DisplayName("Testing BinaryTree sorting performance.")
    public void BinaryTreeSortPerformance() {
        checkPerformance(new BinaryTreeImpl(500));
    }

    @Test
    @DisplayName("Testing inbuilt sorting performance.")
    public void inbuiltSort() {
        float start = System.nanoTime();
        Arrays.sort(aThousandNumberArray);
        float end = System.nanoTime();

        Printer.printTimeElapsed("Inbuilt sorter",end-start);
    }


    public void checkPerformance(Sorter sorter) {
        float start = System.nanoTime();
        sorter.start(aThousandNumberArray);
        float end = System.nanoTime();

        Printer.printTimeElapsed(sorter.getClass().getName(),end-start);
    }
}
