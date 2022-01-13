package Sda.Zaawansowane.Task01Dziedziczenie.Toy;

public class Main {

    public static void main(String[] args) {

        System.out.println("---------- Zadanie 1 ------------------");

        Toy toy1 = new Toy(11, 4);
        System.out.println(toy1.getMinAge());
        System.out.println(toy1.getPrice());

        System.out.println("---------- Zadanie 2 ------------------");

        TeddyBear teddyBear1 = new TeddyBear(123, 3, "Misia");
        System.out.println(teddyBear1.getName());
        System.out.println(teddyBear1.getPrice());
        System.out.println(teddyBear1.getMinAge());

        Toy toy2 = teddyBear1;
        System.out.println(toy2.getPrice());
        System.out.println(toy2.getMinAge());
    }
}
