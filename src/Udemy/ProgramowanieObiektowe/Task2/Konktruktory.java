package Udemy.ProgramowanieObiektowe.Task2;

public class Konktruktory {

    public static void main(String[] args) {

        Punkt p = new Punkt(10, 155);
        p.x = 5;
        p.y = 20;


        System.out.println("p.x " + p.x);
        System.out.println("p.y " + p.y);

        Punkt p2 = new Punkt(10, 45);
        System.out.println("p2.x " + p2.x);
        System.out.println("p2.y " + p2.y);
    }
}
