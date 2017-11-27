public class Seller extends User {
    public Seller(String name) {
        super(name);
    }

    @Override
    public boolean update() {
        System.out.println("Seller " + name + " notified!");
        return true;
    }
}