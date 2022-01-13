package Sda.Zaawansowane.Task01Dziedziczenie.School;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------Zadanie 9 --------------");
        Person person1 = new Person("Adam", "Nowak");
        System.out.println(person1);

        Student student1 = new Student("Jan", "Kowalski", new int[] {3, 2, 5, 4});
        System.out.println(student1);

        Teacher teacher1 = new Teacher("Anna", "Kowalska", "Biologia");
        System.out.println(teacher1);

        System.out.println("-------------- Zadanie 10 -------------------");
        Teacher[] teachers = {
                teacher1,
                new Teacher("Tomasz", "Jasina", "Geografia")
        };
        Student[] students = {
                student1,
                new Student("Marzena", "Nowak", new int[] {5, 1, 3, 4})
        };
        School school1 = new School(teachers, students);
        Person[] studentsAndTeachers = school1.getStudentsAndTeachers();
        for (Person person : studentsAndTeachers) {
            System.out.println(person);
        }
    }
}
