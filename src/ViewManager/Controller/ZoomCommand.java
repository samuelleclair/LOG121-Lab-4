package ViewManager.Controller;

import ViewManager.Controller.ImageCommand;
import ViewManager.Model.ImageComplexe;

/**
 * Created by kevin on 2016-03-24.
 */
public class ZoomCommand extends ImageCommand {
    
    /**
     * Indice de zoom qui vient modifier le paramètre de zoom
     */
    private float zoom;
    
    /**
     * Constructeur de ZoomCommand
     * @param image Image que la commande modifie
     * @param zoom Paramètre de zoom
     */
    public ZoomCommand(ImageComplexe image, float zoom) {
        super(image);
        this.zoom = zoom;
    }

    @Override
    public void execute() {
        float newZoom = image.getZoom()+zoom;
        image.setZoom(newZoom);
    }

    @Override
    public void undo() {
        float newZoom = image.getZoom()+zoom;
        image.setZoom(newZoom);
    }
}
