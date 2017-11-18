public class Privat24Payment implements PaymentStrategy {
    @Override
    public boolean pay(double price) {
        System.out.println("You pay " + price + " by Privat24!");
        return true;
    }
}
