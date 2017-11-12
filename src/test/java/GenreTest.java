import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GenreTest {
    @Test
    public void toStringTest() {
        assertEquals("action", Genre.ACTION.toString());
    }
}
