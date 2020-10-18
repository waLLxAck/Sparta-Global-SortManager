package com.sparta.svilen.Exceptions;

import com.sparta.svilen.Logs.Log;

/**
 * EmptyArrayException.java - a custom exception, thrown when an array is left empty during initialisation.
 * @author  Svilen Petrov
 * @version 1.0
 * @see com.sparta.svilen.InputCollector
 */

public class EmptyArrayException extends Exception {
    public EmptyArrayException(String s) {
        super(s);
        Log.logError(EmptyArrayException.this);
    }
}
