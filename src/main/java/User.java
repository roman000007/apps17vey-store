public class User implements Observer {
    @Override
    public boolean update() {
        System.out.println("User " + name + " notified!");
        return true;
    }
    String name;
    public User(String name){
        this.name = name;
    }
}
