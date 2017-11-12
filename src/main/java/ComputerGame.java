public class ComputerGame {
    private static int generalId = 0;
    private final int id;
    private int price;
    private ComputerGameSpec specs;


    public int getId() {
        return id;
    }

    public ComputerGameSpec getSpecs() {
        return specs;
    }

    public ComputerGame(int price, ComputerGameSpec specs) {
        id = ComputerGame.generalId++;
        this.specs = specs;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game " + specs + " - " + price + "$";
    }
}
