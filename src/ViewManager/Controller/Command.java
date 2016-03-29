package ViewManager.Controller;

/**
 * Created by kevin on 2016-03-24.
 */
public interface Command {
    /**
     * Appel l'exécution de la commande
     */
    public void execute();
    
    /**
     * Action inverse de à la commande
     */
    public void undo();
}
