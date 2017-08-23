package com.patterns.abstractfactory;

/**
 * Created by AbhishekH on 7/27/17.
 */
public class WinGUIFactory implements GUIFactory{


    @Override
    public Button createButton() {
        Button button = new WinButton();
        return button;
    }
}
