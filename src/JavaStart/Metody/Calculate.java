package JavaStart.Metody;

public class Calculate {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(4, 2.5);
        calc.substract(3.98, 2.56787);
        calc.multiply(10.45, 6.32);
        calc.divide(10.2, 3.33);

        System.out.println("Winik dodawania: " + calc.add(4, 2.5));
        System.out.println("Wynik odejmowania: " + calc.substract(3.98, 2.56787));
        System.out.println("Wynik mnożenia: " + calc.multiply(10.45, 6.32));
        System.out.println("Wynik dzielenia: " + calc.divide(10.2, 3.33));

    }
}
