import java.util.ArrayList;

public class GameOfLife {
    public static void main(String[] args) {

    }

    public static void gameOfLife(int[][] board) {
        ArrayList<ArrayList<Integer>> memo = new ArrayList<>();
        ;
        for (int i = 0; i < board.length; i++) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < board[0].length; j++) {
                tmp.add(board[i][j]);
            }
            memo.add(tmp);
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0 || board[i][j] == 1) {
                    board[i][j] = findLife(memo, i, j, board[i][j]);
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == 2) {
                    board[i][j] = 1;
                }
            }
        }
    }

    public static int findLife(ArrayList<ArrayList<Integer>> board, int i, int j, int num) {
        int count = 0;
        int r = board.size();
        int c = board.get(0).size();
        if (i > 0 && j > 0 && board.get(i - 1).get(j - 1) == 1)
            count++;
        if (i > 0 && j < c - 1 && board.get(i - 1).get(j + 1) == 1)
            count++;
        if (i > 0 && board.get(i - 1).get(j) == 1)
            count++;
        if (j > 0 && board.get(i).get(j - 1) == 1)
            count++;
        if (j < c - 1 && board.get(i).get(j + 1) == 1)
            count++;
        if (i < r - 1 && j < c - 1 && board.get(i + 1).get(j + 1) == 1)
            count++;
        if (i < r - 1 && j > 0 && board.get(i + 1).get(j - 1) == 1)
            count++;
        if (i < r - 1 && board.get(i + 1).get(j) == 1)
            count++;

        if (num == 0 && count == 3)
            return 2;
        if (num == 0 && count < 3)
            return -1;
        if (count >= 2 && count <= 3)
            return 2;
        if (count > 3)
            return -1;
        return -1;
    }
}
