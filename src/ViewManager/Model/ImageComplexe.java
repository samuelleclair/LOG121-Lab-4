package ViewManager.Model;

import ViewManager.Util.Observer.Observable;

/**
 * Represents a Data Model of an image, with it's display parameters
 * @author Steve Gagne
 */
public class ImageComplexe extends Observable {
    TransParametre paramTranslation;
    ZoomParametre paramZoom;
    ImageConcrete image;
    /**
     * Creates a new complex image
     * @param imagePath 
     */
    public ImageComplexe(String imagePath){
        image = new ImageConcrete(imagePath);
        this.notifyObservers();
    }
    
    /**
     * Sets the direction of this image's parameters
     * @param x Translation in X
     * @param y Translation in Y
     */
    public void setDirection(float x,float y){
        paramZoom.setParamX(x);
        paramZoom.setParamY(y);
        this.notifyObservers();
    }
    
     /**
     * Sets the zoom of this image's parameters
     * @param z Zoom magnification coefficient
     */
    public void setZoom(float z){
        paramTranslation.setParam(z);
        this.notifyObservers();
    }
    
    /**
     * Sets a new photo for this image
     * @param imagePath The file path on disk
     */
    public void setImage(String imagePath){
        image = new ImageConcrete(imagePath);
        this.notifyObservers();
    }
    
    /**
     * Obtain the X translation factor
     * @return X Translation Factor
     */
    public float getTranslationX(){
        return this.paramTranslation.getParamX();
    }
    
    /**
     * Obtain the Y translation factor
     * @return Y Translation Factor
     */
    public float getTranslationY(){
        return this.paramTranslation.getParamY();
    }
    
    /**
     * Obtain the zoom factor
     * @return Zoom Factor
     */
    public float getZoom(){
        return this.paramZoom.getParam();
    }
}
