package ViewManager.Model;

/**
 * Contains zoom parameters for an object
 * @author Steve Gagne
 */
public class ZoomParametre {
    float zoom;
    /**
     * Constructor
     */
    public ZoomParametre(){
        zoom = 1;
    }
    
    /**
     * Sets the zoom parameter
     * @param z Zoom parameter
     */
    public void setParam(float z){
        zoom = z;
    }
    
    /**
     * Gets the zoom parameter
     * @return z Zoom parameter
     */
    public float getParam(){
        return zoom;
    }
}
