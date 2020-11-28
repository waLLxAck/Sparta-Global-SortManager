package com.sparta.svilen.exceptions;

import com.sparta.svilen.utility.Log;
import com.sparta.svilen.utility.InputCollector;

/**
 * EmptyArrayException.java - a custom exception, thrown when an array is left empty during initialisation.
 * @author  Svilen Petrov
 * @version 1.0
 * @see InputCollector
 */

public class EmptyArrayException extends Exception {
    public EmptyArrayException(String s) {
        super(s);
        Log.logError(EmptyArrayException.this);
    }
}
