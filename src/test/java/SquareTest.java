import org.oopBlueprints.MinesweeperSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testConstructor() {
        MinesweeperSquare testSquare = new MinesweeperSquare() ;
        Assertions.assertEquals(false, testSquare.isMine());
        Assertions.assertEquals('.', testSquare.getFlag());
    }
}
