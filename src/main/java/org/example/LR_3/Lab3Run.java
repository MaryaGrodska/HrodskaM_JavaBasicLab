package org.example.LR_3;

import org.example.LR_3.Controller.*;
import org.example.LR_3.model.*;

import java.util.ArrayList;
import java.util.List;

public class Lab3Run {
    public static void main(String[] args) {
        University university = createTypicalUniversity();
        printUniversityInfo(university);
    }

    public static University createTypicalUniversity() {
        // Створення 15 студентів
        List<Student> students = new ArrayList<>();
        students.add(new StudentCreator("Конопелька", "Лев", "Анастасійович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Гродська", "Марія", "Євгенівна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Шевченко", "Олександр", "Ігорович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Іванова", "Олена", "Андріївна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Петренко", "Артем", "Володимирович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Коваль", "Наталія", "Миколаївна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Мельник", "Денис", "Петрович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Бондар", "Ірина", "Сергіївна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Кузьменко", "Віктор", "Іванович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Сидоренко", "Анна", "Олексіївна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Ткаченко", "Юрій", "Васильович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Захарова", "Катерина", "Борисівна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Романенко", "Максим", "Дмитрович", Sex.MALE, "122м-24-2").create());
        students.add(new StudentCreator("Литвин", "Дарина", "Євгенівна", Sex.FEMALE, "122м-24-2").create());
        students.add(new StudentCreator("Гончар", "Богдан", "Сергійович", Sex.MALE, "122м-24-2").create());

        // Створення групи
        Group group = new Group("122м-24-2", students);

        // Створення кафедри
        Department department = new Department("Кафедра комп’ютерних наук", new Human("Іваненко", "Іван", "Іванович", Sex.MALE), List.of(group));

        // Створення факультету
        Faculty faculty = new Faculty("Факультет інформаційних наук", new Human("Петренко", "Олена", "Сергіївна", Sex.FEMALE), List.of(department));

        // Створення університету
        return new UniversityCreator("Технічний університет", new Human("проф.Ля", "Ля", "Ля", Sex.MALE), List.of(faculty)).create();
    }

    public static void printUniversityInfo(University university) {
        System.out.println("Університет: " + university.getName());
        System.out.println("Керівник університету: " + university.getHead().getFullName());
        System.out.println();

        for (Faculty f : university.getFaculties()) {
            System.out.println("  Факультет: " + f.getName());
            System.out.println("  Декан: " + f.getHead().getFullName());

            for (Department d : f.getDepartments()) {
                System.out.println("    Кафедра: " + d.getName());
                System.out.println("    Завідувач кафедри: " + d.getHead().getFullName());

                for (Group g : d.getGroups()) {
                    System.out.println("      Група: " + g.getName());

                    for (Student s : g.getStudents()) {
                        String role = s.getSex() == Sex.MALE ? "Студент" : "Студентка";
                        System.out.println("        " + role + ": " + s.getFullName() + " (" + s.getSex() + ")");
                    }
                }
            }
        }
    }
}
