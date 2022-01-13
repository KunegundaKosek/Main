package Udemy.Operatory;

public class Operatory {

    public static void main(String[] args) {
//operatory arytmetyczne
        int a = 5;
        a += 2;
        int b = 4 % 3;
        a++;

        System.out.println(a);
        System.out.println(b);

        //operatory relacyjne

        boolean isTrue = 4 == 4;

        System.out.println(isTrue);

        System.out.println(5 != 8);

        System.out.println(5 > 8);

        System.out.println(7 < 1);

        System.out.println(4 <= 7);

        System.out.println(100 <= 1);

        //operatory logiczne

        int i = 6;
        int j = 10;

        if (i == j) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }

        if (i == 6 || a > 5) {
            System.out.println("tak");
        }

        //operatory bitowe


    }
}
