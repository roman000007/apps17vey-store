public class DiscountDecorator extends CartDecorator {
    final double DISCOUNT = 0.1;
    public DiscountDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public double computeTotalPrice() {
        return super.computeTotalPrice() * (1 - DISCOUNT);
    }
}
