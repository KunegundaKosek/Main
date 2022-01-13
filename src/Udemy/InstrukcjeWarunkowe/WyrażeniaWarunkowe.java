package Udemy.InstrukcjeWarunkowe;

public class WyrażeniaWarunkowe {

    public static void main(String[] args) {

        int x = 5;

        if (x % 2 == 0) {
            System.out.println("liczba parzysta");
        } else {
            System.out.println("liczba nieparzysta");
        }

        String czyParzysta = x % 2 == 0 ? "parzysta" : "nieparzysta";
        System.out.println(czyParzysta);
    }
}
