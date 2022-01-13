package JAVAPODSTAWY;

public class TabliceWielowymiarowe {

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];
        matrix[4][5] = 10;

        char[][] tictactoe = {
                {'X', 'O', 'O'},
                {'O', 'X', 'O'},
                {' ', 'X', ' '},
        };

        for (int i = 0; i < tictactoe.length; ++i) {
            for (int j = 0; j < tictactoe[i].length; ++j) {
                System.out.print(tictactoe[i][j]);
            }
            System.out.println("\n");
        }

        String[][][][] deeplyNested = new String[2][2][2][2];

    }
}

