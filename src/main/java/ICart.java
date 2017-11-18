import java.util.ArrayList;

public interface ICart {
    public ArrayList<ComputerGame> getItems();
    public boolean ship();
    public double computeTotalPrice();
    public DeliveryStrategy getDeliveryStrategy();
    public PaymentStrategy getPaymentStrategy();
}
