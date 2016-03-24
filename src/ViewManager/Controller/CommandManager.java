package ViewManager.Controller;

/**
 * Created by kevin on 2016-03-24.
 */
public class CommandManager {
    CommandManager instance;

    /**
     *
     */
    private CommandManager(){

    }

    /**
     *
     * @return
     */
    public CommandManager getCommandManager(){
        if (instance == null)
            instance = new CommandManager();

        return instance;
    }
}
