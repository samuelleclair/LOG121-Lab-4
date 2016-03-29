package ViewManager.Controller;

import ViewManager.Controller.Command;
import ViewManager.Model.ImageComplexe;

/**
 * Created by kevin on 2016-03-24.
 */
public abstract class ImageCommand implements Command {
    
    protected ImageComplexe image;
    
    public ImageCommand(ImageComplexe image) {
        this.image = image;
    }
    
    public abstract void execute();
    
    public abstract void undo();
}
