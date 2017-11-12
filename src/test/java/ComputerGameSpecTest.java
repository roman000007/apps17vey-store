import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ComputerGameSpecTest {
    @Test
    public void toStringTest() {
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(gameSpec.toString(), "CS: Go");
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
        assertEquals(gameSpec.getName(), "CS: Go");
    }

    @Test
    public void getDescriptionTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(gameSpec.getDescription(), "Cool");
    }

    @Test
    public void getGenreTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(gameSpec.getGenre(), Genre.ACTION);
    }

    @Test
    public void getAgeRestrictionTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(gameSpec.getAgeRestriction(), 18);
    }

    @Test
    public void getPlatformTest(){
        ComputerGameSpec gameSpec = new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS);
        assertEquals(gameSpec.getPlatform(), Platform.WINDOWS);
    }
}
