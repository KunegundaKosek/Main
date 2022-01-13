package JAVAPODSTAWY;

import java.util.Arrays;

public class Tablice {

    public static void main(String[] args) {

        int[] ints = new int[8];
        String[] strings = new String[20];
        long[] longs = new long[100];

        int[] array = new int[10];
        array[5] = 7;
        int sum = 4 + array[5];

        System.out.println(sum);

        System.out.println(" ");

        int[] numbers = new int[6];
        numbers[0] = 66;
        numbers[1] = 33;
        numbers[2] = 44;
        numbers[3] = 22;
        numbers[4] = 11;
        numbers[5] = 88;

        String[] texts = new String[] {"ala", "ma", "kota"};
        System.out.println(texts[2]);

        System.out.println(Arrays.toString(texts));







    }
}
