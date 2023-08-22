import java.util.Scanner;

class MyJavaProgram {

    // places a Queen in the specific row
    static void place(int[][] board, int row) {
        if (row >= board.length) {
            System.out.println("Solution mil gaya");
            printBoard(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            // System.out.print("board[" + row + "][" + col + "] : ");
            if (isSafe(board, row, col)) {

                // place the queen
                // System.out.println("safe");
                board[row][col] = 1;
                place(board, row + 1);
                // remove the same queen
                board[row][col] = 0;

            } else {
                // do nothing
                // System.out.println("unsafe");

            }
        }
    }

    static void printBoard(int[][] board) {
        for (int[] a : board) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] board, int row, int col) {
        int tempRow = row;
        int tempCol = col;
        // ! Vertical Top
        while (tempRow >= 0) {
            if (board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
        }
        // ! Vertical Top-left
        tempCol = col;
        tempRow = row;
        while (tempRow >= 0 && tempCol >= 0) {
            if (board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
            tempCol--;
        }
        // ! Vertical Top-right
        tempCol = col;
        tempRow = row;
        while (tempRow >= 0 && tempCol <= board.length - 1) {
            if (board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
            tempCol++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        place(board, 0);
    }
}
