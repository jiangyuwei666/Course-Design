package com.ui;

import javax.swing.*;
import java.awt.*;

public class MyJCombBox extends JComboBox<String> {

    public MyJCombBox(int x, int y, int width , int height , Font font){
        super.setBounds(x,y,width,height);
        super.setFont(font);
    }

    /**
     * 添加选项
     * @param items
     */
    public void addItems(String... items){

        for( String s : items){
            addItem(s);
        }

    }
}
