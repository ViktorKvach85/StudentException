package com.epam.TA2021.student.service.exception;

public final class FacultyAbsentServiceException extends Exception {

    public FacultyAbsentServiceException() {
        super();
    }

    public FacultyAbsentServiceException(String message) {
        super(message);
    }

    public FacultyAbsentServiceException(Exception e) {
        super(e);
    }

    public FacultyAbsentServiceException(String message, Exception e) {
        super(message, e);
    }
}