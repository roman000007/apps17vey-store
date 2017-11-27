import org.junit.Test;

import java.util.ArrayList;

public class ObserverTest {
    @Test
    public void ObserverTest() {
        Cart cart = new Cart(new Privat24Payment(), new DeliveryNovaPoshta());
        ArrayList<ComputerGame> items = cart.getItems();

        items.add(new ComputerGame(100, new ComputerGameSpec("CS: Go",
                "Cool", Genre.ACTION, 18, Platform.WINDOWS)));
        items.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator",
                "Cool", Genre.SIMULATION, 14, Platform.WINDOWS)));
        items.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018",
                "Cool", Genre.ACTION, 18, Platform.LINUX)));

        Customer c1 = new Customer("Roma");
        Seller c2 = new Seller("Vasya");
        User c3 = new User("Anton");
        c3.update();
        cart.addObserver(c1);
        cart.addObserver(c2);
        cart.removeObserver(c2);
        c2.update();
        cart.ship();
    }
}
