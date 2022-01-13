package Sda.Zaawansowane.Task12Wyjątki.Omówienie;

public class Main {

    public static void main(String[] args) {

        int x = 1;
        int y = 0;

        try {
            System.out.println(x / y);
            System.out.println("To nie będzie wypisane w konsoli");
        } catch (ArithmeticException e) {
            System.out.println("Obsługa wyjątku typu AritmeticException");
        }
        System.out.println("Aplikacja działa dalej");

        String text = null;

        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Obsługa wyjątku typu NullPointException");
        }

        int[] shortArray = {1, 0};
        int index1 = 0;
        int index2 = 1;

        try {
            System.out.println(shortArray[index1] / shortArray[index2]);
        } catch (ArithmeticException e ) {
            System.out.println("Obsługa wyjątku typu ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Obsługa wyjątku typu ArrayIndexOutOfBoundsException");
        } catch (NullPointerException e) {
            System.out.println("Obsługa wyjątku typu NullPointerException");
        }
        System.out.println("\nPrzykład obsługi wyjątków różnego typu w ten sam sposób");

        try {
            System.out.println(shortArray[index1] / shortArray[index2]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Obsługa wyjątków typu ArithmeticException " + "lub ArrayIndexOutOfBoundsException lub NullPointerException");
        }
    }
}
