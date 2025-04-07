package org.example.LR_3.Controller;
import org.example.LR_3.model.Department;
import org.example.LR_3.model.Group;
import org.example.LR_3.model.Human;

import java.util.List;

public class DepartmentCreator implements Creator<Department> {
    private String name;
    private Human head;
    private List<Group> groups;

    public DepartmentCreator(String name, Human head, List<Group> groups) {
        this.name = name;
        this.head = head;
        this.groups = groups;
    }

    @Override
    public Department create() {
        return new Department(name, head, groups);
    }
}
