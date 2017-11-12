import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ComputerGameTest {
    @Test
    public void getIdTest() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS));
        assertTrue(game.getId() == (int)game.getId());
    }

    @Test
    public void getPriceTest() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS));
        assertEquals(100, game.getPrice());
    }

    @Test
    public void getSpecsTest() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS));
        assertTrue(game.getSpecs().matches(
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS)
        ));
    }

    @Test
    public void toStringTest() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS));
        assertEquals("Game CS: Go - 100$", game.toString());
    }
}
