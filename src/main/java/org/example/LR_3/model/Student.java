package org.example.LR_3.model;

public class Student extends Human {
    private String groupName;

    public Student(String firstName, String lastName, String patronymic, Sex sex, String groupName) {
        super(firstName, lastName, patronymic, sex);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }
}
