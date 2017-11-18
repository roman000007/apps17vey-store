import java.util.ArrayList;

public abstract class CartDecorator {
    Cart cart;
    public CartDecorator(Cart cart){
        this.cart = cart;
    }

    public ArrayList<ComputerGame> getInventory(){
        return cart.getInventory();
    }

    public ArrayList<ComputerGame> search(ComputerGameSpec filter) {
        return cart.search(filter);
    }

    public boolean ship() {
        return cart.ship();
    }

    public double computeTotalPrice() {
        return computeTotalPrice();
    }
}
