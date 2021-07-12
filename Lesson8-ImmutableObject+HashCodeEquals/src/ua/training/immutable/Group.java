package ua.training.immutable;

import ua.training.hashcode_equals.Student;

import java.util.ArrayList;

public final class Group {
    private final String name;
    private final String id;
    private final ArrayList<Student> studentsList;

    public Group(String name, String id, ArrayList<Student> studentsList) {
        this.name = name;
        this.id = id;
        this.studentsList = new ArrayList<Student>(studentsList);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Student> getStudentsList() {
        return new ArrayList<Student>(studentsList);
    }
}
