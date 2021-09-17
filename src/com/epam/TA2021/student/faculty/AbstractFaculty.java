package com.epam.TA2021.student.faculty;

public class AbstractFaculty {
    String facultyName;
    String facultySubject;

    public AbstractFaculty() {
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getFacultySubject() {
        return facultySubject;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setFacultySubject(String facultySubject) {
        this.facultySubject = facultySubject;
    }
}
