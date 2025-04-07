package org.example.LR_3.Controller;

import org.example.LR_3.model.Sex;
import org.example.LR_3.model.Student;

public class StudentCreator implements Creator<Student> {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;
    private String groupName;

    public StudentCreator(String firstName, String lastName, String patronymic, Sex sex, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
        this.groupName = groupName;
    }

    @Override
    public Student create() {
        return new Student(firstName, lastName, patronymic, sex, groupName);
    }
}

