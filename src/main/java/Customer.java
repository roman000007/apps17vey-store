public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    @Override
    public boolean update() {
        System.out.println("Customer " + name + " notified!");
        return true;
    }
}
