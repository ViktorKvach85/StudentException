package com.epam.TA2021.student.service.exception;

public final class IncorreсtMarkServiceException extends Exception {

    public IncorreсtMarkServiceException() {
        super();
    }

    public IncorreсtMarkServiceException(String message) {
        super(message);
    }

    public IncorreсtMarkServiceException(Exception e) {
        super(e);
    }

    public IncorreсtMarkServiceException(String message, Exception e) {
        super(message, e);
    }
}