package org.example.LR_3.Controller;

import org.example.LR_3.model.Department;
import org.example.LR_3.model.Faculty;
import org.example.LR_3.model.Human;

import java.util.List;

public class FacultyCreator implements Creator<Faculty> {
    private String name;
    private Human head;
    private List<Department> departments;

    public FacultyCreator(String name, Human head, List<Department> departments) {
        this.name = name;
        this.head = head;
        this.departments = departments;
    }

    @Override
    public Faculty create() {
        return new Faculty(name, head, departments);
    }
}
