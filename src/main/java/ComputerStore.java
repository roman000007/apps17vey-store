import java.util.ArrayList;

public class ComputerStore {
    ArrayList<ComputerGame> inventory;

    public ArrayList<ComputerGame> getInventory() {
        return inventory;
    }

    public ComputerStore(){
        inventory = new ArrayList<>();
    }

    public ArrayList<ComputerGame> search(ComputerGameSpec filter){
        ArrayList<ComputerGame> result = new ArrayList<>();
        for (ComputerGame game: inventory){
            if(game.getSpecs().matches(filter)){
                result.add(game);
            }
        }
        return result;
    }
}
