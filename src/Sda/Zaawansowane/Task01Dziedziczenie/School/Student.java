package Sda.Zaawansowane.Task01Dziedziczenie.School;

import java.util.Arrays;

public class Student extends Person {
    private int[] grades;

    public Student(String firstName, String lastName, int[] grades) {
        super(firstName, lastName);
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grades=" + Arrays.toString(grades) +
                "} " + super.toString();
    }
}
