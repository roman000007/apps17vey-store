import java.util.ArrayList;

public class DeliveryNovaPoshta implements DeliveryStrategy {

    @Override
    public boolean deliver(ArrayList<ComputerGame> games) {
        System.out.println("Delivered by Nova Poshta:");
        for(ComputerGame g: games){
            System.out.println(g);
        }
        return true;
    }
}
