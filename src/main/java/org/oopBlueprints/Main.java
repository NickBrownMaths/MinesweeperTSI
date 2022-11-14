package org.oopBlueprints ;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Create your own playable version of minesweeper using an object-oriented approach. Your game should be able to
        take input from the user, and show a visual game grid (achieving this with the console is fine)
         */

        Scanner input = new Scanner(System.in) ;

        MinesweeperGrid minesweeperGrid = new MinesweeperGrid(10, 10, 15) ;
        minesweeperGrid.populateMines();

        boolean stillPlaying = true ;
        while (stillPlaying) {

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
                        && (plantFlag == 't' || plantFlag == 'f')) {
                    noValidCommand = false;
                    System.out.println("valid");
                }
                else {
                    System.out.println("Please enter a valid choice. Use \"row col t\" to test, use \"row col f\" to plant a flag.");
                }

            }

        }



    }
}