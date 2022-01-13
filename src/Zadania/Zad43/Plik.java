package Zadania.Zad43;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Plik {

    String dane, dane1;

    public void czytajDane() throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię i nazwisko.");
        dane = scanner.nextLine();

    }

    public void zapiszDaneDoPliku() throws IOException {

        System.out.println("Zapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter("dane.txt");
        fw.write(dane);
        fw.close(); // zamknięcie pliku
    }

    public void czytajDaneZPliku() throws IOException {

        System.out.println("Odczytujemy dane z pliku dane.txt.");
        System.out.println(" ");

        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);

        while ((dane1 = br.readLine()) != null); {          //pętla odczytuje dane z pliku

            System.out.println(dane1);

        }fr.close(); //zamknięcie pliku

    }
}
