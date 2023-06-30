package com.akanksha.Adapter;

public class SchoolStudentAdapter implements Student{

    private SchoolStudent schoolStudent;
    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastName();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent=schoolStudent;
    }
}
