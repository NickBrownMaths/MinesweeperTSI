package org.oopBlueprints ;

public class Main {
    public static void main(String[] args) {
        /*
        Create your own playable version of minesweeper using an object-oriented approach. Your game should be able to
        take input from the user, and show a visual game grid (achieving this with the console is fine)
         */

        MinesweeperGrid minesweeperGrid = new MinesweeperGrid(10, 10, 15) ;
        minesweeperGrid.populateMines();
        //minesweeperGrid.printGrid();




    }
}