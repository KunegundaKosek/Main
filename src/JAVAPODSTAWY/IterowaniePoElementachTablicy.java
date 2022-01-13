package JAVAPODSTAWY;

public class IterowaniePoElementachTablicy {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        int product = 1;

        for (int i = 0; i < numbers.length; i++) {
            product = numbers[1];
        }
        System.out.println(product);

        String result = "wynik mnożenia to " + product;

        System.out.println(result);
    }
}
