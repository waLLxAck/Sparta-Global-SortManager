package com.sparta.svilen.exceptions;

import com.sparta.svilen.utility.Log;
import com.sparta.svilen.sorting_algorithms.BinaryTreeImpl;

/**
 * ChildNotFoundException.java - a custom exception, thrown when a child node of the binary tree is non-existent.
 * @author  Svilen Petrov
 * @version 1.0
 * @see BinaryTreeImpl
 */

public class ChildNotFoundException extends Exception{
    public ChildNotFoundException(String s) {
        super(s);
        Log.logError(ChildNotFoundException.this);
    }
}
