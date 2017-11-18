import java.util.ArrayList;

public abstract class CartDecorator implements ICart {
    ICart cart;
    public CartDecorator(ICart cart){
        this.cart = cart;
    }

    public ArrayList<ComputerGame> getItems(){
        return cart.getItems();
    }

    public boolean ship() {
        return cart.ship();
    }

    public double computeTotalPrice() {
        return cart.computeTotalPrice();
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return cart.getDeliveryStrategy();
    }
    public PaymentStrategy getPaymentStrategy() {
        return cart.getPaymentStrategy();
    }
}
