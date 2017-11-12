import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ComputerStore store = new ComputerStore();
        ArrayList<ComputerGame> inventory = store.getInventory();
        inventory.add(new ComputerGame(100, new ComputerGameSpec("CS: Go", "Cool",
                Genre.ACTION, 18, Platform.WINDOWS)));
        inventory.add(new ComputerGame(200, new ComputerGameSpec("Dog Simulator", "Cool",
                Genre.SIMULATION, 14, Platform.WINDOWS)));
        inventory.add(new ComputerGame(215, new ComputerGameSpec("NFS 2018", "Cool",
                Genre.ACTION, 18, Platform.LINUX)));

        ArrayList<ComputerGame> wanted = store.search(new ComputerGameSpec("NFS 2018", "Cool",
                Genre.ACTION, 18, Platform.LINUX));
        for(ComputerGame game: wanted){
            System.out.println(game);
        }
    }
}
