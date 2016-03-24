package ViewManager.Model;

/**
 * Contains Translation parameters for an object
 * @author Steve Gagne
 */
public class TransParametre {
    private float directionX;
    private float directionY;
    /**
     * Constructor
     */
    public TransParametre(){
        directionX = 0;
        directionY = 0;
    }
    
    /**
     * Sets the x Direction
     * @param x X Direction
     */
    public void setParamX(float x){
        directionX = x;
    }
    
    /**
     * Sets the y Direction
     * @param y Y Direction
     */
    public void setParamY(float y){
        directionY = y;
    }
    
    /**
     * Obtain the x Direction
     * @return X Direction
     */
    public float getParamX(){
        return directionX;
    }
    
    /**
     * Obtain the y Direction
     * @return Y Direction
     */
    public float getParamY(){
        return directionY;
    }
}
