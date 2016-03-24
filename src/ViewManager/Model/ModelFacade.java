package ViewManager.Model;

/**
 * Created by kevin on 2016-03-24.
 */
public class ModelFacade {

    ModelFacade instance;
    /**
     *
     */
    private ModelFacade(){

    }

    /**
     *
     * @return
     */
    public ModelFacade getViewFactory(){
        if (instance == null)
            instance = new ModelFacade();
        return instance;
    }
}
