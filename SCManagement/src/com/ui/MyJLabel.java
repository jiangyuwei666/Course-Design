package com.ui;

import javax.swing.*;
import java.awt.*;

public class MyJLabel extends JLabel {

    public MyJLabel(){
        super();
    }

    public MyJLabel(int x , int y , int width , int height){
        setBounds(x,y,width,height);
    }

    public MyJLabel(int x , int y , int width , int height , Font font){
        setBounds(x,y,width,height);
        setFont(font);
    }

    public MyJLabel(int x , int y , int width , int height , Font font, String s){
        setBounds(x,y,width,height);
        setFont(font);
        setText(s);
    }
}
