package org.demo.calendar;

public class InvalidFiscalDateFormatException extends Exception {

    public InvalidFiscalDateFormatException() {
        super();
    }

    public InvalidFiscalDateFormatException(String message) {
        super(message);
    }

    public InvalidFiscalDateFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidFiscalDateFormatException(Throwable cause) {
        super(cause);
    }

    protected InvalidFiscalDateFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
