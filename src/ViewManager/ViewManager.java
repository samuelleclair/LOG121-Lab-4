package ViewManager;

import ViewManager.View.BaseView;
import ViewManager.View.LeftView;
import ViewManager.View.RightView;
import ViewManager.View.View;
import javafx.scene.control.SplitPane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by kevin on 2016-03-24.
 */
public class ViewManager {

    /**
     * Constructeur
     */
    public ViewManager(){
        initView();
    }

    /**
     * Initialiser la fenêtre principale
     */
    private void initView(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight() - 100;

        Image defaultImage = null;

        LeftView LeftView = new LeftView(defaultImage);
        RightView rightView = new RightView(defaultImage);
        BaseView baseView = new BaseView(defaultImage);

        JFrame mainWindow = new JFrame("View manager");
        JSplitPane leftRightView = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,LeftView, rightView);
        JSplitPane topBottomView = new JSplitPane(JSplitPane.VERTICAL_SPLIT,leftRightView, baseView);

        // set the jframe size. in a more complicated application you will
        // probably call frame.pack() before displaying it.
        mainWindow.setSize(new Dimension((int) width, (int) height));
        leftRightView.setSize(new Dimension((int) width, (int) height));
        topBottomView.setSize(new Dimension((int) width, (int) height));

        leftRightView.setDividerLocation(0.5);
        topBottomView.setDividerLocation(0.7);

        //leftRightView.setEnabled(false);
        //topBottomView.setEnabled(false);

        mainWindow.add(topBottomView);

        // center the frame
        mainWindow.setLocationRelativeTo(null);

        // set this so your application can easily be stopped/killed
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // display the frame
        mainWindow.setVisible(true);
    }

    /**
     * Charger un image
     */
    private void loadImaqe(){

    }
}
