package JavaStart.Cwiczenie;

import java.util.Random;

public class Main2 {

    public static void main(String[] args) {

        Random rnd = new Random();

        int x = rnd.nextInt(100);
        int y = rnd.nextInt(100);

        System.out.println(x);
        System.out.println(y);

        System.out.println("Czy x jest większe od y?");
        System.out.println(x > y);

        System.out.println("Czy x pomnożone przez 2 jest większe od y?");
        System.out.println(x * 2 > y);

        System.out.println("Czy y jest mniejsze od sumy x+3 i jednocześnie większe od x pomniejszonego o 2?");
        System.out.println((y < x + 3) && (y > x - 2));

        System.out.println("Czy iloczyn liczb x i y jest parzysty? (Wykorzystaj do sprawdzenia operację modulo)");
        System.out.println((x * y) % 2 == 0);


    }
}
