package JAVAPODSTAWY;

public class PętlaWhile {

    public static void main(String[] args) {

        String line = "*";

        while (line.length() < 10) {
            System.out.println(line);
            line += "*";
        }
        System.out.println(line);

        //nieskończona pętla

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i--;
        }
    }
}
