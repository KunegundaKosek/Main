package Zadania.Zad40;

public class Trójkątne {

    public static int triangle(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + triangle(n - 1));
        }
    }
}
