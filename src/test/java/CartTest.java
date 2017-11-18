import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class CartTest {
    @Test
    public void ComputerStoreTest() {
        Cart store = new Cart();
        ArrayList<ComputerGame> inventory = store.getInventory();

        inventory.add(new ComputerGame(100, new ComputerGameSpec("CS: Go",
                "Cool", Genre.ACTION, 18, Platform.WINDOWS)));
        inventory.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator",
                "Cool", Genre.SIMULATION, 14, Platform.WINDOWS)));
        inventory.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018",
                "Cool", Genre.ACTION, 18, Platform.LINUX)));

        assertTrue(store.getInventory().size() == 3);

        ArrayList<ComputerGame> wanted = store.search(new ComputerGameSpec(
                "NFS 2018", "Cool",
                Genre.ACTION, 18, Platform.LINUX));
        assertTrue(wanted.size() == 1 &&
                wanted.get(0).toString().equals("Game NFS 2018 - 215$"));
    }
}
