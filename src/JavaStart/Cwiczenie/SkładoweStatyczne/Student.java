package JavaStart.Cwiczenie.SkładoweStatyczne;

public class Student {

    private static int studentsNumber = 0;

    private String firstName;
    private String lastName;
    private int index;

    public Student(String firstName, String lastName, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.index = index;
        studentsNumber++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getIndex() {
        return index;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static int getStudentsNumber() {
        return studentsNumber;
    }
}
