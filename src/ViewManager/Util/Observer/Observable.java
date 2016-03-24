package ViewManager.Util.Observer;

import java.util.ArrayList;

/**
 * Extendable class used to add listeners and notify them in a 
 * GOF observer pattern.
 * @author Steve Gagné
 */
public abstract class Observable {
    ArrayList<IObserver> Listeners;
    /**
     * Basic constructor, instanciates the list of listeners
     */
    public Observable(){
        Listeners = new ArrayList<>();
    }
    
    /**
     * Add an observer to the list of observers to notify
     * @param observer Observer to add to the list
     */
    public void AddObserver(IObserver observer){
        Listeners.add(observer);
    }
    
    /**
     * Notifies all listeners
     */
    public void notifyObservers(){
        for(IObserver observer:Listeners){
            observer.update();
        }
    }
}
