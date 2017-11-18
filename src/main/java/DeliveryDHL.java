import java.util.ArrayList;

public class DeliveryDHL implements DeliveryStrategy {

    @Override
    public boolean deliver(ArrayList<ComputerGame> games) {
        System.out.println("Delivered by DHL:");
        for(ComputerGame g: games){
            System.out.println(g);
        }
        return true;
    }
}