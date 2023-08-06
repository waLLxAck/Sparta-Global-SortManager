package com.sparta.svilen.factory;

import com.sparta.svilen.interfaces.Sorter;

import java.lang.reflect.InvocationTargetException;

/**
 * SortManager.java - a managing class for all sorting algorithms.
 * @author  Svilen Petrov
 * @version 2.0
 */

public class SortManager {

    public Sorter getAlgorithm(String choice) {
        try {
            return (Sorter) Thread
                    .currentThread()
                    .getContextClassLoader()
                    .loadClass("com.sparta.svilen.sorting_algorithms."+choice)
                    .getDeclaredConstructor()
                    .newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
