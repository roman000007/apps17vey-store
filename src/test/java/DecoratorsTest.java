import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;

public class DecoratorsTest {
    @Test
    public void DecoratorsTest(){
        Cart cart = new Cart(new Privat24Payment(), new DeliveryNovaPoshta());
        ArrayList<ComputerGame> items = cart.getItems();

        items.add(new ComputerGame(100, new ComputerGameSpec("CS: Go",
                "Cool", Genre.ACTION, 18, Platform.WINDOWS)));
        items.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator",
                "Cool", Genre.SIMULATION, 14, Platform.WINDOWS)));
        items.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018",
                "Cool", Genre.ACTION, 18, Platform.LINUX)));

        DiscountDecorator discountedItems = new DiscountDecorator(cart);
        BonusDecorator itemsWithBonus = new BonusDecorator(cart);
        assertEquals(463.5, discountedItems.computeTotalPrice());
        assertEquals(515.0, cart.computeTotalPrice());
        assertTrue(itemsWithBonus.ship());
        assertEquals(3, discountedItems.getItems().size());

        BonusDecorator mixed = new BonusDecorator
                (new DiscountDecorator(cart));

        mixed.getDeliveryStrategy();
        mixed.getPaymentStrategy();
    }
}
