package com.ui;

import javax.swing.*;
import java.awt.*;

public class MyRadioButton extends JRadioButton{


    public MyRadioButton(int x, int y, int width, int height, Font font, String s){
        super(s);
        setBounds( x,y,width,height );
        setFont(font);
    }

}
