package JavaStart.Cwiczenie;

import java.util.Arrays;

public class Tablica {

    public static void main(String[] args) {

        int[] tab1 = {2, 2, 2};
        int[] tab2 = {1, 1, 1};

        int result;

        result = tab1[0] + tab1[1] + tab1[2];
        System.out.println("Suma elementów pierwszej tablicy: " + result);

        result = tab2[0] + tab2[1] + tab2[2];
        System.out.println("Suma elementów drugiej tablicy: " + result);

        ArrayUtils utils = new ArrayUtils();
        int sum = utils.sumArrays(tab1, tab2);
        System.out.println("Suma liczb w tablicach wynosi: " + sum);


    }
        }
