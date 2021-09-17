package com.epam.TA2021.student.group.javagroup;

import com.epam.TA2021.student.faculty.JavaFaculty;

public class JavaElementaryGroup extends JavaFaculty {
   public  String groupName="1-Java";
   public String groupSubject ="Java Elementary";

    public JavaElementaryGroup() {
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupSubject() {
        return groupSubject;
    }

//    public JavaElementaryGroup(String facultyName, String facultySubject, String groupName, String groupSubject) {
//        super(facultyName, facultySubject);
//        this.groupName = groupName;
//        this.groupSubject= groupSubject;
//    }

}
