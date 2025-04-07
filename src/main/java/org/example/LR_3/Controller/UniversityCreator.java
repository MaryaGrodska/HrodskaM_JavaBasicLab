package org.example.LR_3.Controller;
import org.example.LR_3.model.Faculty;
import org.example.LR_3.model.Human;
import org.example.LR_3.model.University;

import java.util.List;

public class UniversityCreator implements Creator<University> {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public UniversityCreator(String name, Human head, List<Faculty> faculties) {
        this.name = name;
        this.head = head;
        this.faculties = faculties;
    }

    @Override
    public University create() {
        return new University(name, head, faculties);
    }
}
