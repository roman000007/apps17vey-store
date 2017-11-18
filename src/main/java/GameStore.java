import java.util.ArrayList;

public class GameStore {
    private ArrayList<ComputerGame> inventory;

    public GameStore() {
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


}
