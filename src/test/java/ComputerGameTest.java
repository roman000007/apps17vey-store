import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ComputerGameTest {
    @Test
    public void getId() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS));
        assertEquals(game.getId(), 0);

    }

    @Test
    public void getSpecs() {
        ComputerGame game = new ComputerGame(100,
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS));
        assertTrue(game.getSpecs().matches(
                new ComputerGameSpec("CS: Go", "Cool",
                        Genre.ACTION, 18, Platform.WINDOWS)
        ));
    }
}
