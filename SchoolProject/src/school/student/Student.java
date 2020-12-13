package school.student;

import java.util.Arrays;

public class Student {

    private String name;
    private int id;
    private int[] grades;
    private static int countName = 0;
    private static int countID = 0;

    public Student() {
        this.name = "Student " + countName++;
        this.id = countID++;
    }

    public Student(int[] grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
