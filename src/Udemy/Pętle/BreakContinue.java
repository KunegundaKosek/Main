package Udemy.Pętle;

public class BreakContinue {

    public static void main(String[] args) {

        for (int j = 1; j <= 10; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

/*        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/

    }
}
