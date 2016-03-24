package ViewManager.View;

import ViewManager.Util.Observer.IObserver;

import javax.swing.*;

/**
 * Created by kevin on 2016-03-24.
 */
public abstract class View extends JPanel implements IObserver {

    /**
     * paint
     */
    protected void paint(){}

    /**
     * update
     */
    protected void update(){}




}
