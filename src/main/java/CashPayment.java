public class CashPayment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.println("You pay " + price + " by cash!");
        return true;
    }
}
