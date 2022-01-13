package JAVAPODSTAWY;

import java.util.Scanner;

public class WczytywanieDanychZWejścia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        boolean myBool = scanner.nextBoolean();

        System.out.println(myString);
        System.out.println(myInt);
        System.out.println(myBool);
        scanner.close(); //jeśli nie chcemy już korzystać ze scannera
    }
}
