package ViewManager.Controller;
import java.util.Stack;

/**
 * Created by kevin on 2016-03-24.
 */
public class CommandManager {
    
    /**
     * Instance unique du CommandManager
     */
    private CommandManager instance;
    
    /**
     * Commandes déjà executés
     */
    private Stack<Command> commands;

    /**
     * Instance unique du CommandManager
     */
    private CommandManager(){
        commands = new Stack<Command>();
    }

    /**
     * 
     * @return Instance unique du CommandManager
     */
    public CommandManager getCommandManager(){
        if (instance == null)
            instance = new CommandManager();

        return instance;
    }
    
    /**
     * Ajout d'une commande et execution
     * @param command Commande à ajouter
     */
    public void addCommand(Command command) {
        commands.addElement(command);
        command.execute();
    }
    
    /**
     * Undo de la dernière commande et suppression
     */
    public void undo() {
        commands.lastElement().undo();
        commands.remove(commands.lastElement());
    }
    
    /**
     * Remettre le CommandManager à neuf
     */
    public void clearCommand() {
        commands.removeAllElements();
    }
}
