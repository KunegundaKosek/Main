package JAVAPODSTAWY;

import java.awt.*;

public class ŁańcuchZnaków {
    public static void main(String[] args) {

        String text = "Hello World!";

        String firstName = "Roman";
        String fullName1 = "Ryszard" + " " + "Wójcik";
        String fullName2 = firstName + " Nowak";

        int age = 100;
        double weight = 99.4;

        String s = "Tadeusz ma " + age + " lat oraz waży " + weight + " kilogramy.";

        System.out.println(fullName1);
        System.out.println(fullName2);
        System.out.println(s);

        //sprawdzanie czy dwa łańcuchy znaków są takie same, używamy equals zamiast operatora ==

        String a = "test";
        String b = "test";
        a.equals(b);
        System.out.println(b);
    }
}
