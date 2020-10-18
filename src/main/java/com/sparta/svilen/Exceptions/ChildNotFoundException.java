package com.sparta.svilen.Exceptions;

import com.sparta.svilen.Logs.Log;
import com.sparta.svilen.SortingAlgorithms.BinaryTreeImpl;

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
