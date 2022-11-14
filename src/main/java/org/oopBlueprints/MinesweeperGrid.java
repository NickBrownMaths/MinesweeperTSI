package org.oopBlueprints ;
import static java.lang.Math.random;

public class MinesweeperGrid {

    int rows = 1;
    int cols = 1;
    int mines = 0;

    MinesweeperSquare[][] grid;

    // Constructor
    public MinesweeperGrid (int r, int c, int m) {
        this.rows = r;
        this.cols = c;
        this.mines = m;
        grid = new MinesweeperSquare[this.rows][this.cols] ;
        // Iterate over all rows
        for (int row = 0 ; row < rows ; ++row) {
            // Iterate over all columns
            for (int col = 0 ; col < cols ; ++col) {
                grid[row][col] = new MinesweeperSquare() ;
            }
        }
    }

    // Methods
    public void populateMines() {
        int minesAdded = 0 ;
        while (minesAdded < this.mines) {
            int newMineRow = (int) Math.round(Math.random() * (this.rows - 1));
            int newMineCol = (int) Math.round(Math.random() * (this.cols - 1));
            if (grid[newMineRow][newMineCol].isMine == false) {
                grid[newMineRow][newMineCol].isMine = true;
                ++minesAdded;
            }
        }
    }
    public void printGrid () {
        // Print Header
        System.out.println("Mines: " + this.mines);

        // Print horizontal co-ord
        System.out.print("  ");
        for (int col = 0 ; col < cols ; ++col) {
            System.out.print(" " + col + " ") ;
        }
        System.out.println();


        // Iterate over all rows
        for (int row = 0 ; row < rows ; ++row) {
            // Print vertical co-ord
            System.out.print(row + " ");

            // Iterate over all columns
            for (int col = 0 ; col < cols ; ++col) {
                System.out.print(" " + grid[row][col].flag + " ");
            }
            System.out.println();
        }
        // Print footer
        System.out.println("Use \"row col t\" to test, use \"row col f\" to plant a flag.");

    }
    public void printSolution () {

    }
}














