import java.util.ArrayList;

public class Cart {
    private ArrayList<ComputerGame> inventory;

    public Cart() {
        inventory = new ArrayList<>();
    }

    public ArrayList<ComputerGame> getInventory() {
        return inventory;
    }

    public ArrayList<ComputerGame> search(ComputerGameSpec filter) {
        ArrayList<ComputerGame> result = new ArrayList<>();
        for (ComputerGame game: inventory) {
            if (game.getSpecs().matches(filter)) {
                result.add(game);
            }
        }
        return result;
    }

    public boolean ship(){
        System.out.println("Shipping!");
        return true;
    }

    public double computeTotalPrice() {
        double total = 0;
        for (ComputerGame game: inventory) {
            total += game.getPrice();
        }
        return total;
    }
}
