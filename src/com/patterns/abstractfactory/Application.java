package com.patterns.abstractfactory;

/**
 * Created by AbhishekH on 7/27/17.
 */
public class Application {

    static String osType = "win";

    static GUIFactory guiFactory;

//    Application(GUIFactory guiFactory) {
//        this. guiFactory = guiFactory;
//    }

    public static void main(String[] args) {

    	//Application application = new Application();
        OSType osType = OSType.iOS;

        switch(osType) {
            case Windows:
                guiFactory = new WinGUIFactory();
                break;

            case iOS:
                guiFactory = new iOSGUIFactory();
                break;
                
                

        }

        Button button = guiFactory.createButton();
        button.paint();

    }
}
