package com.epam.TA2021.student.service;


import com.epam.TA2021.student.bean.Student;
import com.epam.TA2021.student.service.exception.FacultyAbsentServiceException;
import com.epam.TA2021.student.service.exception.IncorreсtMarkServiceException;
import com.epam.TA2021.student.service.exception.SubjectsAbsentServiceException;
import com.epam.TA2021.student.util.DatabaseUtil;

import java.util.List;

public class StudentService {

    List<Student> allStudents = DatabaseUtil.getAllStudents();

//    public void checkException() {
//
//        for (Student student : allStudents) {
//            if (student.getRatingFacultySubject() > 10 ||
//                    student.getRatingFacultySubject() < 0 ||
//                    student.getRatingGroupSubject() > 10 ||
//                    student.getRatingGroupSubject() < 0) {
//                throw new IncorreсtMarkServiceException("Incorrect mark");
//            }
//            if (student.getFacultySubject().isEmpty() &&
//                    student.getFacultySubject().isEmpty()) {
//                throw new SubjectsAbsentServiceException("Subjects absent");
//            }
//            if (student.getFacultyName().isEmpty()) {
//                throw new FacultyAbsentServiceException("faculty absent");
//            }
//        }
//    }

    public double calculateAverageMarkOfStudent(String name) {
        double sum = 0;
        int counter = 0;
        double averageMark = 0;
        for (Student student : allStudents) {
            if (String.valueOf(student.getName()).equals(name)) {
                sum = sum + student.getRatingFacultySubject() + student.getRatingGroupSubject();
                counter = counter + 2;
            }
        }
        averageMark = sum / counter;
        System.out.println(averageMark);
        return averageMark;
    }
    public double calculateAverageMarkOfSubject(String facultySubject) {
        double sum = 0;
        int counter = 0;
        double averageMarkOfSubject = 0;

        for (Student student : allStudents) {
            if (String.valueOf(student.getFacultySubject()).equals(facultySubject)) {
               sum = sum + student.getRatingFacultySubject();
                counter = counter +1 ;
            }
        }
        averageMarkOfSubject = sum / counter;
        System.out.println(averageMarkOfSubject);
        return averageMarkOfSubject;
    }

    public double  calculateAverageMarkOfSubjectInConcreticGroupandFaculty(String facultySubject, String groupName, String facultyName){
        double sum = 0;
        int counter = 0;
        double averageMark = 0;
//       sum= allStudents.stream().filter(student -> String.valueOf(student.getFacultySubject()).
//                        equals(facultySubject)).mapToDouble(Student::getRatingFacultySubject).sum();
        for (Student student : allStudents) {
            if (String.valueOf(student.getFacultySubject()).equals(facultySubject) &&
                String.valueOf(student.getFacultyName()).equals(facultyName) &&
                String.valueOf(student.getGroupName()).equals(groupName)) {
                sum = sum + student.getRatingFacultySubject();
                counter = counter +1 ;
            }
        }
        averageMark = sum / counter;
        System.out.println(averageMark);
        return averageMark;
    }
}
//
//    @Override
//    public List<AbstractElectricalDevice> sortDevicesByParameter(DeviceOperationParameter parameterName) {
//        List<AbstractElectricalDevice> allDevices = DatabaseUtil.getAllStudents();
//        switch (parameterName) {
//            case COLOR:
//                allDevices.sort(new ColorComparator());
//                return allDevices;
//            case PRICE:
//                return allDevices.stream().sorted(Comparator.comparing(AbstractElectricalDevice::getPrice))
//                        .collect(Collectors.toList());
//            case POWER:
//                return allDevices.stream().sorted(Comparator.comparingInt(AbstractElectricalDevice::getPower))
//                        .collect(Collectors.toList());
//            case NAME:
//                return allDevices.stream().sorted(Comparator.comparing(AbstractElectricalDevice::getName))
//                        .collect(Collectors.toList());
//            default:
//                throw new IllegalArgumentException(String.format("Unsupported parameter %s", parameterName.name()));
//        }
//    }
//
//
//    @Override
//    public List<AbstractElectricalDevice> findDevicesByParameter(DeviceOperationParameter parameterName, String parameterValue) throws IncorreсtMarkServiceException {
//        List<AbstractElectricalDevice> allDevices = DatabaseUtil.getAllStudents();
//        List<AbstractElectricalDevice> resultDevices = new ArrayList<>();
//        switch (parameterName) {
//            case POWER:
//                for (AbstractElectricalDevice a : allDevices) {
//                    if (String.valueOf(a.getPower()).equals(parameterValue)) {
//                        resultDevices.add(a);
//                    }
//                }
//                break;
//            case COLOR:
//                resultDevices = allDevices.stream().filter(device -> String.valueOf(device.getColor()).
//                        equals(parameterValue)).collect(Collectors.toList());
//                break;
//            case PRICE:
//                resultDevices = allDevices.stream().filter(device -> String.valueOf(device.getPrice()).
//                        equals(parameterValue)).collect(Collectors.toList());
//                break;
//            case NAME:
//                resultDevices = allDevices.stream().filter(device -> String.valueOf(device.getName()).
//                        equals(parameterValue)).collect(Collectors.toList());
//                break;
//            default:
//                throw new IllegalArgumentException(String.format("Unsupported parameter %s", parameterName.name()));
//        }
//        if (resultDevices.size() == 0) {
//            throw new IncorreсtMarkServiceException(String.format("There no devices that correspond %s=%s",
//                    parameterName.name(), parameterValue));
//        }
//        return resultDevices;
//    }
//}