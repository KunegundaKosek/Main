package Udemy.ProgramowanieObiektowe.Task2;

public class Punkt {

    int x;
    int y;

    Punkt() {
        System.out.println("Wywołano konstruktor domyślny.");
        x = 20;
        y = 20;
    }

    Punkt(int x, int y) {
        System.out.println("Wywołano konstruktor z dwoma parametrami.");

        this.x = x;
        this.y = y;
    }

}
