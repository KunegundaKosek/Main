package JavaStart.Cwiczenie.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.println("Podaj pierwszą liczbę");

        double a = input.nextDouble();

        System.out.println("Podaj operator: + - * /");
        input.nextLine();
        String operator = input.nextLine();

        System.out.println("Podaj druga liczbę: ");
        double b = input.nextDouble();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operator);
        System.out.println(a + operator + b + " = " + result);

        input.close();
        }
    }

