class MyJavaProgram {
    static void visit(int[][] maze, int n, int row, int col) {
        if (row < 0 || row >= n || col < 0 || col >= n || maze[row][col] == 1) {
            return; // outside the maze
        }

        if (row == n - 1 && col == n - 1) {
            System.out.println("Destination aa gaya ");
            return;
        }
        // System.out.println("Maze[" + row + "][" + col + "]");
        maze[row][col] = 1;
        visit(maze, maze.length, row, col - 1); // go left
        visit(maze, maze.length, row - 1, col); // go top
        visit(maze, maze.length, row, col + 1); // go right
        visit(maze, maze.length, row + 1, col); // go bottom
        maze[row][col] = 0;

    }

    public static void main(String[] args) {
        int[][] maze = new int[][] {
                { 0, 0, 1, 0, 0, 1, 0 },
                { 1, 0, 1, 1, 0, 0, 0 },
                { 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0 },
                { 1, 0, 1, 1, 0, 1, 0 },
                { 1, 0, 0, 0, 0, 1, 0 },
                { 1, 1, 1, 1, 0, 0, 0 }
        };
        visit(maze, maze.length, 0, 0);
    }
}
