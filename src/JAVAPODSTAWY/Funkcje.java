package JAVAPODSTAWY;

public class Funkcje {

    public static void main(String[] args) {

        times(5, 0);
        times(5, 1);
        times(5, 3);
    }

    static int times(int i, int n) {
        int product = 1;
        for (int j = 0; j < n; j++) {
            product *= i;
            System.out.println(product);
        }
        return product;
    }

    int age = 5;

    String getDescription(int age) {
        if (age <= 1) {
            return "niemowlę";
        } else if (age < 10) {
            return "dziecko";
        } else if (age < 18) {
            return "młodzież";
        } else {
            return "dorosły";
        }
    }

    //wywołamnie rekurencyjne - funkcje wywołują same siebie

    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }
    //procedury - funkcje nie zwracające żadnych wartości

    void printTemperaturesUntilPositive(double[] temperatures) {
        for (double temperature : temperatures) {
            if (temperature <= 0) {
                return;
            }
            System.out.println("Temperatura wynosi " + temperature + ".");
        }
    }
}




