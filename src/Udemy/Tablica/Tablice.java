package Udemy.Tablica;

public class Tablice {

    public static void main(String[] args) {

        int[] tab = new int[5];

        tab[0] = 20;
        tab[1] = 7;
        tab[2] = 87;
        tab[3] = 15;
        tab[4] = 1;

        System.out.println(tab[0]);
        System.out.println(tab[1]);
        System.out.println(tab[2]);
        System.out.println(tab[3]);
        System.out.println(tab[4]);

        int[] tab2 = {4, 5, 7, 9, 12, 15};
        System.out.println(tab2[tab2.length - 1]);
    }
}
