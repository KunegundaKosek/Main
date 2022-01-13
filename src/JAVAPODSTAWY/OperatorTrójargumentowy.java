package JAVAPODSTAWY;

public class OperatorTrójargumentowy {

    public static void main(String[] args) {

        int age = 18;

        String isMajor = age >= 18 ? "yes" : "no";
        //to wyrażenie jest równoznaczne z zapisem:

        String isMajor2;
        if (age >= 18) {
            isMajor2 = "yes";
        } else {
            isMajor2 = "no";
        }

        System.out.println(isMajor);
        System.out.println(isMajor2);
    }
}
