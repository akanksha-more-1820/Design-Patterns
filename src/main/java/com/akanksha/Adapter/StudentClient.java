package com.akanksha.Adapter;

import java.util.ArrayList;
import java.util.List;

public class StudentClient {

    public List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        CollegeStudent collegeStudent = new CollegeStudent("akanksha","more","asd");
        SchoolStudent schoolStudent = new SchoolStudent("aditya","more","uiouo");
        students.add(new SchoolStudentAdapter(schoolStudent));
        students.add(collegeStudent);
        return students;
    }
}
