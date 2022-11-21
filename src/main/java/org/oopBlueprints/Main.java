package org.oopBlueprints ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        MinesweeperGrid minesweeperGrid = new MinesweeperGrid(0, 0, 0) ;
        boolean stillPlaying = true ;
        boolean setupComplete = false;
        while (stillPlaying) {
            while (setupComplete == false) {
                int colsSetup = 1000000 ;
                int rowsSetup = 1000000 ;
                int minesSetup = 1000000 ;
                try {
                    System.out.println("How many rows, columns and mines?\n(Input three whole numbers, rows and columns 40 or lower, mines must all fit)");
                    colsSetup = input.nextInt();
                    rowsSetup = input.nextInt();
                    minesSetup = input.nextInt();
                } catch (Exception e) {
                    System.out.println("I can do this all day. Please enter a valid setup.");
                    input.nextLine() ;
                }
                if (rowsSetup < 1 || colsSetup < 1 || rowsSetup > 40 || colsSetup > 40 || minesSetup >= rowsSetup * colsSetup) {
                    System.out.println("Your input wasn't quite correct. Please try again.");
                }
                else {
                    setupComplete = true ;
                    minesweeperGrid = new MinesweeperGrid(rowsSetup, colsSetup, minesSetup) ;
                }
            }
            minesweeperGrid.printGrid();

            boolean noValidCommand = true ;
            while (noValidCommand) {
                int clickRow = 1000000 ;
                int clickCol = 1000000 ;
                char plantFlag = 0 ;

                try {
                    clickRow = input.nextInt();
                    clickCol = input.nextInt();
                    plantFlag = input.next().charAt(0) ;
                }
                catch (Exception e) {
                    String line = input.nextLine();
                }

                if (clickRow != 1000000 && clickCol != 1000000
                        && clickRow < minesweeperGrid.rows && clickCol < minesweeperGrid.cols
                        && (plantFlag == 'r' || plantFlag == 'f')) {
                    noValidCommand = false;
                }
                else {
                    System.out.println("Please enter a valid choice. Use \"row col r\" to reveal, use \"row col f\" to plant a flag.");
                }

                // If the user has given a valid command execute it
                if (noValidCommand == false) {
                    boolean pf = false ;
                    if (plantFlag == 'f') { pf = true; }
                    minesweeperGrid.click(clickRow, clickCol, pf);
                }
                if (minesweeperGrid.gameLost == true) {
                    System.out.println("Congratulations! You Lose!");
                    minesweeperGrid.printSolution();
                    stillPlaying = false ;
                }
            }

            // Check win condition
            if (minesweeperGrid.checkWinCondition()) {
                minesweeperGrid.printGrid();
                System.out.println("Congratulations! you win!");
                stillPlaying = false ;
            }
        }
    }
}