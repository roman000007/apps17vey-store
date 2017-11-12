import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ComputerGameSpecTest {
    @Test
    public void toStringTest() {
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals("CS: Go", gameSpec.toString());
    }

    @Test
    public void matchesTest() {
        ComputerGameSpec gameSpec1 = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        ComputerGameSpec gameSpec2 = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertTrue(gameSpec1.matches(gameSpec2));
    }

    @Test
    public void getNameTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals("CS: Go", gameSpec.getName());
    }

    @Test
    public void getDescriptionTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals("Cool", gameSpec.getDescription());
    }

    @Test
    public void getGenreTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(Genre.ACTION, gameSpec.getGenre());
    }

    @Test
    public void getAgeRestrictionTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(18, gameSpec.getAgeRestriction());
    }

    @Test
    public void getPlatformTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(Platform.WINDOWS, gameSpec.getPlatform());
    }
}
