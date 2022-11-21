import org.oopBlueprints.MinesweeperSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testConstructor() {
        MinesweeperSquare testSquare = new MinesweeperSquare() ;
        Assertions.assertEquals(false, testSquare.isMine(), "The square is not constructed with the expected isMine value, which should be false.");
        Assertions.assertEquals('.', testSquare.getFlag(), "The square is not constructed with the expected flag value, which should be \'.\'.");
    }
}
