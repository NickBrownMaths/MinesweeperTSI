package org.oopBlueprints ;
public class MinesweeperSquare {
    // [SPACE] empty with no adjacent mines
    // Q mine
    // P flag
    // 12345678 neighbour mines
    // . unknown
    char flag;
    boolean isMine;

    public MinesweeperSquare() {
        flag = '.';
        isMine = false ;
    }

    public char getFlag() {
        return flag;
    }
    public boolean isMine() {
        return isMine;
    }
}
