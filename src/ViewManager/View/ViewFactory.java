package ViewManager.View;

/**
 * Created by kevin on 2016-03-24.
 */
public class ViewFactory {

    ViewFactory instance;
    /**
     *
     */
    private ViewFactory(){

    }

    /**
     *
     * @return
     */
    public ViewFactory getViewFactory(){
        if (instance == null)
            instance = new ViewFactory();
        return instance;
    }
}
