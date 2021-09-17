package com.epam.TA2021.student.util;

import com.epam.TA2021.student.service.StudentService;
import com.epam.TA2021.student.service.exception.IncorreсtMarkServiceException;

public class Main {


    public static void main(String[] args)  {
        DatabaseUtil.initDataBase();
        StudentService service = new StudentService();
        service.calculateAverageMarkOfStudent("CCcc");
       // service.checkException();
        service.calculateAverageMarkOfSubject("Java algorithms");
        service.calculateAverageMarkOfSubjectInConcreticGroupandFaculty("Java algorithms", "1-Java", "Java");

    }

}
