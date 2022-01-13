package Task.Task01;
/*
Napisz program, który na podstawie szybkości w milach na godzinę (mph - z ang. miles per hour)
(wartość podana przez użytkownika, typ - float) będzie obliczał szybkość w kilometrach na godzinę (km/h) i wypisywał ją na ekran.
Do przeliczenia użyj wzoru: szybkość w km/h = 1.6 * szybkość w mph
Szybkość pobierz od użytkownika w konsoli za pomocą klasy Scanner.
* */

import java.util.Scanner;

public class MphToKmhConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float input = scanner.nextFloat();

        System.out.println("MP/H " + input);

        float result = input * 1.6f;

        System.out.println("KM/H = " + result);
    }
}
