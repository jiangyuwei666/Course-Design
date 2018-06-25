package com.ui;

import javax.swing.*;
import java.awt.*;

public class MyCheckBox extends JCheckBox {

    public MyCheckBox(int x, int y, int width, int height , String s, Font font){
        super(s);
        setBounds(x,y,width,height);
        setFont(font);
    }

}
