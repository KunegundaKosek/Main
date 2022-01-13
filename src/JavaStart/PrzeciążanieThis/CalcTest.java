package JavaStart.PrzeciążanieThis;

public class CalcTest {

    public static void main(String[] args) {

        int a = 15;
        int b = 10;
        int c = 5;

        Calculator calculator = new Calculator();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("a + b + c = " + calculator.add(a, b, c));
        System.out.println("a + b = " + calculator.add(a, b));
        System.out.println("a - b - c = " + calculator.substract(a, b, c));
        System.out.println("a - b = " + calculator.substract(a, b));

    }
}
