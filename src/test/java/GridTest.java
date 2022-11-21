import org.oopBlueprints.MinesweeperGrid;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GridTest {
    @Test
    public void testConstructor() {
        MinesweeperGrid testGrid = new MinesweeperGrid(24, 30, 99) ;
        Assertions.assertEquals(24, testGrid.getRows(),"Grid has wrong number of rows");
        Assertions.assertEquals(30, testGrid.getCols(),"Grid has wrong number of columns");
        Assertions.assertEquals(99, testGrid.getMines(),"Grid has wrong number of mines");
    } ;
    @Test
    public void testPopulateMinesExcluding() {
        for (int i = 0 ; i < 10000 ; ++i) {
            MinesweeperGrid testGrid = new MinesweeperGrid(24, 30, 99);
            testGrid.populateMinesExcluding(8, 10);
            Assertions.assertEquals(99, testGrid.getMines(), "Wrong number of mines on loop #" + i) ;
            Assertions.assertFalse(testGrid.getGrid()[8][10].isMine(), "Mine placed in wrong location on loop #" + i);
        }
    }
}
