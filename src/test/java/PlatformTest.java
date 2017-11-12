import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlatformTest {
    @Test
    public void toStringTest() {
        assertEquals(Platform.LINUX.toString(), "Linux");
    }
}