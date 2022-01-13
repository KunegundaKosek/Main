package Sda.Zaawansowane.Task01Dziedziczenie.School;

public class School {
    private Teacher[] teachers;
    private Student[] students;

    public School(Teacher[] teachers, Student[] students) {
        this.teachers = teachers;
        this.students = students;
    }

    public Person[] getStudentsAndTeachers() {
        Person[] result = new Person[teachers.length + students.length];
        int index = 0;
        for (Teacher teacher : teachers) {
            result[index] = teacher;
            index++;
        }
        for (Student student : students) {
            result[index] = student;
            index++;
        }
        return result;
    }

}
