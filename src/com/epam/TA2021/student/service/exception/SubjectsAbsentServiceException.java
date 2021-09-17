package com.epam.TA2021.student.service.exception;

public final class SubjectsAbsentServiceException extends Exception {

    public SubjectsAbsentServiceException() {
        super();
    }

    public SubjectsAbsentServiceException(String message) {
        super(message);
    }

    public SubjectsAbsentServiceException(Exception e) {
        super(e);
    }

    public SubjectsAbsentServiceException(String message, Exception e) {
        super(message, e);
    }
}