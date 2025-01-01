package com.easyobj.loader;

/**
 * Represents Exceptions thrown as a result of the OBJ loading process.
 */
public final class OBJLoadException extends Exception {

    /**
     * Initializes the Exception with a given error message, just as any other Exception.
     *
     * @param message The error message to display with the Exception.
     */
    OBJLoadException(final String message) {
        super(message);
    }
}
