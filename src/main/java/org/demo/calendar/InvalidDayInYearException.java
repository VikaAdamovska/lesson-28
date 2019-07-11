package org.demo.calendar;

public class InvalidDayInYearException extends Exception {

    public InvalidDayInYearException() {
        super();
    }

    public InvalidDayInYearException(String message) {
        super(message);
    }

    public InvalidDayInYearException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidDayInYearException(Throwable cause) {
        super(cause);
    }

    protected InvalidDayInYearException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
