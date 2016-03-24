package ViewManager.Util.Observer;

/**
 * Interface that allows implementation of the GOF observer pattern. Represents
 * an observer object, which is notified by an Observable when it changes. 
 * @author Steve Gagné
 */
public interface IObserver {
    /**
     * Function called by the Observable when it's notified
     */
    public void update();
}
