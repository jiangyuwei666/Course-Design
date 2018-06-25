package com.ui;

import javax.swing.*;
import java.awt.*;

public class MyButton extends JButton {

    public MyButton(int width, int height , Font font ,String s ){
        setText(s);
        setSize(width,height);
        setFont(font);
    }


    public MyButton(int x, int y, int width, int height , Font font ,String s ){
        setText(s);
        setBounds(x,y,width,height);
        setFont(font);
    }

}
