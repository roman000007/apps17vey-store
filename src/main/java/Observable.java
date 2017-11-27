import java.util.ArrayList;

public abstract class Observable {

    ArrayList<Observer>observers;
    public Observable(){
        observers = new ArrayList<>();
    }

    boolean addObserver(Observer observer){
          observers.add(observer);
          return true;
    }

    boolean removeObserver(Observer observer){
        observers.remove(observer);
        return true;
    }
    boolean notifyObservers(){
        for(Observer observer: observers){
            System.out.println("Notify sent!");
            observer.update();
        }
        return true;
    }
}
