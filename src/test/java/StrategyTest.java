import org.junit.Test;

import java.util.ArrayList;
import static junit.framework.TestCase.assertTrue;

public class StrategyTest {
    @Test
    public void StrategyTest1() {
        Cart cart = new Cart(new Privat24Payment(), new DeliveryNovaPoshta());
        ArrayList<ComputerGame> items = cart.getItems();

        items.add(new ComputerGame(100, new ComputerGameSpec("CS: Go",
                "Cool", Genre.ACTION, 18, Platform.WINDOWS)));
        items.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator",
                "Cool", Genre.SIMULATION, 14, Platform.WINDOWS)));
        items.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018",
                "Cool", Genre.ACTION, 18, Platform.LINUX)));
        assertTrue(cart.getDeliveryStrategy().deliver(items));
        assertTrue(cart.getPaymentStrategy().pay(400));
    }
    @Test


    public void StrategyTest2() {
        Cart cart = new Cart(new CashPayment(), new DeliveryDHL());
        ArrayList<ComputerGame> items = cart.getItems();

        items.add(new ComputerGame(100, new ComputerGameSpec("CS: Go",
                "Cool", Genre.ACTION, 18, Platform.WINDOWS)));
        items.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator",
                "Cool", Genre.SIMULATION, 14, Platform.WINDOWS)));
        items.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018",
                "Cool", Genre.ACTION, 18, Platform.LINUX)));
        assertTrue(cart.getDeliveryStrategy().deliver(items));
        assertTrue(cart.getPaymentStrategy().pay(400));
    }
}
