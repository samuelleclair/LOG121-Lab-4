package ViewManager.Controller;

import ViewManager.Controller.ImageCommand;
import ViewManager.Model.ImageComplexe;

/**
 * Created by kevin on 2016-03-24.
 */
public class TransCommand extends ImageCommand {

    /**
     * Deplacement de l'image effectué par la commande en X
     */
    private float deplacementX;
    /**
     * Déplacement de l'image effectué par la commande en Y
     */
    private float deplacementY;
    
    /**
     * 
     * @param image Image à déplacer
     * @param deplacementX Déplacement en X
     * @param deplacementY Déplacement en Y
     */
    public TransCommand(ImageComplexe image, int deplacementX, int deplacementY) {
        super(image);
        this.deplacementX = deplacementX;
        this.deplacementY = deplacementY;
    }
    
    @Override    
    public void execute() {
        float directionX = image.getTranslationX()+deplacementX;
        float directionY = image.getTranslationY()+deplacementY;
        image.setDirection(directionX,directionY);
    }

    @Override
    public void undo() {
        float directionX = image.getTranslationX()-deplacementX;
        float directionY = image.getTranslationY()-deplacementY;
        image.setDirection(directionX,directionY);
    }
}
