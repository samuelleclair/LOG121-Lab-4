package ViewManager.View;

import java.awt.*;

/**
 * Created by kevin on 2016-03-24.
 */
public class ViewFactory {

    ViewFactory instance;

    /**
     * Constructeur
     */
    private ViewFactory(){

    }

    /**
     * Singleton de la factory
     * @return La factory
     */
    public ViewFactory getViewFactory(){
        if (instance == null)
            instance = new ViewFactory();
        return instance;
    }

    /**
     * Creer la vue de base
     * @param img Image de la vue
     */
    public View createBaseView(Image img){
        return new BaseView(img);
    }

    /**
     * Creer la vue de translation
     * @param img Image de la vue
     */
    public View createTransView(Image img){
        return new LeftView(img);
    }

    /**
     * Creer la vue de zoom
     * @param img Image de la vue
     */
    public View createZoomView(Image img){
        return new RightView(img);
    }
}
