package com.epam.TA2021.student.bean.humanitarianStudent;

import com.epam.TA2021.student.bean.Student;
import com.epam.TA2021.student.group.humanitriangroup.HumanitarianIntermediateGroup;

public class HumanitarianIntermediateGroupStudent extends HumanitarianIntermediateGroup implements Student {
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

    public HumanitarianIntermediateGroupStudent(String name, double ratingFacultySubject, double ratingGroupSubject) {
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
