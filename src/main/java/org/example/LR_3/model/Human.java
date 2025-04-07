package org.example.LR_3.model;

public class Human {
    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    public String getFullName() {
        return firstName + " " + lastName + " " + patronymic;
    }

    public Sex getSex() {
        return sex;
    }
}
