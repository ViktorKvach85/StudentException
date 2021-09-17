package com.epam.TA2021.student.util;

import com.epam.TA2021.student.bean.Student;
import com.epam.TA2021.student.bean.humanitarianStudent.HumanitarianElementaryGroupStudent;
import com.epam.TA2021.student.bean.humanitarianStudent.HumanitarianIntermediateGroupStudent;
import com.epam.TA2021.student.bean.javaStudent.JavaElementaryGroupStudent;
import com.epam.TA2021.student.bean.javaStudent.JavaIntermediateGroupStudent;

import java.util.ArrayList;
import java.util.List;

public class DatabaseUtil {


    public static final List<Student> allStudents = new ArrayList<>();
    private DatabaseUtil() {
    }
    public static final List<Student> getAllStudents() {
        return allStudents;
    }


    public static void initDataBase() {
        allStudents.add(new JavaElementaryGroupStudent("A",10,10));
        allStudents.add(new JavaElementaryGroupStudent("B",9,9));
        allStudents.add(new JavaElementaryGroupStudent("C",7,8));

        allStudents.add(new JavaIntermediateGroupStudent("AA",10,10));
        allStudents.add(new JavaIntermediateGroupStudent("BB",9,9));
        allStudents.add(new JavaIntermediateGroupStudent("CC",8,8));

        allStudents.add(new HumanitarianElementaryGroupStudent("AAa",10,10));
        allStudents.add(new HumanitarianElementaryGroupStudent("BBb",9,9));
        allStudents.add(new HumanitarianElementaryGroupStudent("CCc",8,8));

        allStudents.add(new HumanitarianIntermediateGroupStudent("AAaa",10,10));
        allStudents.add(new HumanitarianIntermediateGroupStudent("BBbb",8,9));
        allStudents.add(new HumanitarianIntermediateGroupStudent("CCcc",7,8));

        for(Object st : allStudents) {
            System.out.println(st.toString());
        }
    }


}
