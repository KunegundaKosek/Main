package JAVAPODSTAWY;

public class OperatoryPorównania {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 15;

        boolean isLess1 = c < 20;
        boolean isLess2 = c + a < b;
        boolean isLessOrEqual = a + a <= b;
        boolean isEqual = a + b == c * 2;
        boolean isGreater = b > c + a;

        System.out.println(isLess1);
        System.out.println(isLess2);
        System.out.println(isLessOrEqual);
        System.out.println(isEqual);
        System.out.println(isGreater);
    }
}
