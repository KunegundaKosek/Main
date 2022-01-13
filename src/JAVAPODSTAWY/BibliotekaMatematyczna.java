package JAVAPODSTAWY;

public class BibliotekaMatematyczna {
    public static void main(String[] args) {

        /*
Math.sqrt - ta funkcja wyznacza pierwiastek kwadatowy z podanej liczby zmiennoprzecinkowej.
Math.pow - oblicza pierwszy parametr podniesiony do potęgi liczby podanej jako drugi parametr.
Math.abs - wyznacza moduł (wartość bezwzględną) z podanej liczby.
Math.sin, Math.cos i Math.tan obliczają sinus, cosinus oraz tangens z podanej liczby.
Math.􀁺oor - zwraca liczbę zmiennoprzecinkową zaaokrąglona w dół do całości.
Math.ceil - zwraca liczbę zmiennoprzecinkową zaaokrąglona w górę do całości.
Math.round - zwraca liczbę zmiennoprzecinkową zaaokrąglona do najbliższej całości.
         */

        double p = Math.pow(2.0, 2.0);
        double s = Math.sqrt(16.0);
        int a = Math.abs(-100);
        int b = Math.abs(100);
        double f = Math.floor(3.6);
        double c = Math.ceil(3.6);
        long r = Math.round(3.6);

        System.out.println(p);
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(f);
        System.out.println(c);
        System.out.println(r);
    }
}
