package Zadania.Zad1do35;

import java.util.Scanner;

public class Zad {

    public static void main(String[] args) {
/*
        Napisz program, który oblicza pole prostokąta. Wartości boków a i b wprowadzamy z klawiatury. W programie należy przyjąć, że zmienne a, b oraz
        pole są typu double (rzeczywistego).*/

        System.out.println("Podaj bok a: ");

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        System.out.println("Podaj bok b: ");

        double b = scanner.nextDouble();

        double pole = a * b;

        System.out.println("Pole prostkąta wynosi: " + pole);



    }
}
