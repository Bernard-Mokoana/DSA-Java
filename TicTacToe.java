import java.util.Arrays;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }

        char[][] boardTwo = new char[][] {
            new char[]{'O', '-', '-'},
            new char[]{'O', '-', '-'},
            new char[]{'O', '-', '-'},
        };

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        System.out.println (Arrays.deepToString(board));
    }
}
