import java.util.ArrayList;

public class Cart implements ICart {
    private ArrayList<ComputerGame> items;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public Cart(PaymentStrategy paymentStrategy, DeliveryStrategy deliveryStrategy) {
        this.paymentStrategy = paymentStrategy;
        this.deliveryStrategy = deliveryStrategy;
        items = new ArrayList<>();
    }

    public ArrayList<ComputerGame> getItems() {
        return items;
    }

    public boolean ship(){
        System.out.println("Shipping!");
        return true;
    }

    public double computeTotalPrice() {
        double total = 0;
        for (ComputerGame game: items) {
            total += game.getPrice();
        }
        return total;
    }

    public DeliveryStrategy getDeliveryStrategy() {
        return deliveryStrategy;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
}
