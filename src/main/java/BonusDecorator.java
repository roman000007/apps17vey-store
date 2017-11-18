public class BonusDecorator extends CartDecorator {
    public BonusDecorator(Cart cart) {
        super(cart);
    }

    @Override
    public boolean ship() {
        System.out.println("We give you some gifts!");
        return super.ship();
    }
}
