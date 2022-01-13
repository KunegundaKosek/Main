package JAVAPODSTAWY.ModyficatorStatic;

public class Main {

    public static void main(String[] args) {

        int counter = Apple.counter;
        new Apple();
        new Apple();
        int counter1 = Apple.counter;

        System.out.println(counter);
        System.out.println(counter1);
    }
}
