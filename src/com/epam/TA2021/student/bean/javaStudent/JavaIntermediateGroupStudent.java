package com.epam.TA2021.student.bean.javaStudent;

import com.epam.TA2021.student.bean.Student;
import com.epam.TA2021.student.group.javagroup.JavaIntermediateGroup;

public class JavaIntermediateGroupStudent extends JavaIntermediateGroup implements Student {
    String name;
    double ratingFacultySubject;
    double ratingGroupSubject;

    public String getName() {
        return name;
    }

    public double getRatingFacultySubject() {
        return ratingFacultySubject;
    }

    public double getRatingGroupSubject() {
        return ratingGroupSubject;
    }

    @Override
    public String getFacultyName() {
        return facultyName;
    }
    public String getGroupName(){
        return groupName;
    }

    @Override
    public String getFacultySubject() {
        return facultySubject;
    }

    public JavaIntermediateGroupStudent(String name, double ratingFacultySubject, double ratingGroupSubject) {
        this.name = name;
        this.ratingFacultySubject = ratingFacultySubject;
        this.ratingGroupSubject = ratingGroupSubject;
    }

    @Override
    public String toString() {
        return "Student " + name +
                " study on " +
                "faculty " + facultyName +
                " in group " + groupName +
                ", facultySubject='" + facultySubject + '\'' +
                ", ratingFacultySubject=" + ratingFacultySubject +
                ", groupSubject='" + groupSubject + '\'' +
                ", ratingGroupSubject=" + ratingGroupSubject;
    }
}
