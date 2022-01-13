package Udemy.Pętle;

public class PętlaWhile {

    public static void main(String[] args) {

        String[] kursProgramowania = {"Java",
                                    "Java Aplikacje",
                                    "Java Strumienie",
                                    "Java Aspekty Zaawansowane",
                                    "C#",
                                    "Jakieś",
                                    "losowe",
                                    "głupoty"};

        int i = 0;
        while (i < kursProgramowania.length) {
            System.out.println(kursProgramowania[i]);
            i++;
        }
        i = 0;

        do {
            System.out.println(kursProgramowania[i]);
            i++;

        } while (i < kursProgramowania.length);

        //tablica 10 melementowa, int, zapisać wielokrotność 10, 0 - 10, 1- 20, 2 - 30;

        int[] tab = {10, 20, 30, 40, 50, 60, 70,80, 90, 100};

        int j = 0;

        do {
            System.out.println("tab" + "[" + j + "]" + " = " + tab[j]);
            j++;
        } while (j < tab.length);

        for (int k = 0; k < kursProgramowania.length; k++) {
            System.out.println(kursProgramowania[k]);
        }

        for (String myValue : kursProgramowania) {
            System.out.println(myValue);

        }


    }
}
