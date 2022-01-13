package JavaStart.Cwiczenie.SkładoweStatyczne;

public class University {

    public static void main(String[] args) {

        System.out.println("Liczba studentów przed zapisami: " + Student.getStudentsNumber());
        Student s1 = new Student("Jan", "Kowalski", 123454);
        Student s2 = new Student("Marek", "Jarosz", 54432323);
        System.out.println("Liczba studentów po zapisach: " + Student.getStudentsNumber());

    }
}
