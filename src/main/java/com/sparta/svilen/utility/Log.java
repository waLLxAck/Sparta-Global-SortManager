package com.sparta.svilen.utility;

import com.sparta.svilen.start.Starter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Log.java - a class for logging system activities.
 * @author  Svilen Petrov
 * @version 1.0
 * @see com.sparta.svilen.exceptions.ChildNotFoundException
 */

public class Log {
    private static final Logger logger = LogManager.getLogger(Starter.class);

    public static void logError(Exception e) {
        StringBuilder error = new StringBuilder();
        error.append("\nMessage: ").append(e.getMessage()).append("\nStack:\n");
        for (StackTraceElement stackTraceElement : (e.getStackTrace())) {
            error.append(stackTraceElement).append("\n");
        }
        logger.error(error);
    }
}
