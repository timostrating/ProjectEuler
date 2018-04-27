/**
 * Created by Sneeuwpopsneeuw on 02-Mar-18.
 */

public class Problem096 {
    static int[][] sudoku = {
            {0, 0, 3, 0, 2, 0, 6, 0, 0},
            {9, 0, 0, 3, 0, 5, 0, 0, 1},
            {0, 0, 1, 8, 0, 6, 4, 0, 0},
            {0, 0, 8, 1, 0, 2, 9, 0, 0},
            {7, 0, 0, 0, 0, 0, 0, 0, 8},
            {0, 0, 6, 7, 0, 8, 2, 0, 0},
            {0, 0, 2, 6, 0, 9, 5, 0, 0},
            {8, 0, 0, 2, 0, 3, 0, 0, 9},
            {0, 0, 5, 0, 1, 0, 3, 0, 0}
    };

    public static void main(String[] args) {
        new Problem096();
    }

    private Problem096() {
        if (solveSudoku()) printSudoku();

        printSudoku();
    }

    private void printSudoku() {
        for (int y = 0; y < 9; y++)
            for (int x = 0; x < 9; x++)
                System.out.print(sudoku[y][x] + ((x==8)? "\n" : ""));

    }

    private boolean solveSudoku() {
        IntVector pos = getNextCell();
        if (pos == null)
            return true;

        for (int v = 1; v <= 9; v++) {
            if (rowCheck(pos.y, v) && colCheck(pos.x, v) && gridCheck(pos.x, pos.y, v)) {
                System.out.println("JHEE");
                sudoku[pos.y][pos.x] = v;

                if (solveSudoku())
                    return true;

                sudoku[pos.y][pos.x] = 0;
            }
        }

        return false;  // this triggers backtracking
    }

    private IntVector getNextCell() {
        for (int y = 0; y < 9; y++)
            for (int x = 0; x < 9; x++)
                if (sudoku[y][x] == 0)
                    return new IntVector(x, y);

        return null;
    }


    private boolean rowCheck(int y, int v) {
        for(int i=0; i<9; i++)
            if (sudoku[y][i] == v)
                return false;

        return true;
    }
    private boolean colCheck(int x, int v) {
        for(int i=0; i<9; i++)
            if (sudoku[i][x] == v)
                return false;

        return true;
    }
    private boolean gridCheck(int cell_x, int cell_y, int v) {
        int Y = (cell_x / 3) * 3;
        int X = (cell_y / 3) * 3;

        for(int y=Y; y<Y+3; y++)
            for(int x=X; x<X+3; x++)
                if (sudoku[y][x] == v)
                    return false;

        return true;
    }


    private class IntVector {
        private int x;
        private int y;

        private IntVector(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
