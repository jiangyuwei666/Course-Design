package com.ui;

import com.utils.MyLog;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class MyJTextField extends JTextField implements DocumentListener{

    public String coment;
    public Document doc;

    public MyJTextField( int x ,int y , int width , int height ,Font font){
        this.setFont(font);
        this.setBounds(x,y,width,height);
        doc = this.getDocument();
        coment = "";
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
        MyLog.d("username测试");
        this.coment = this.getText();
        System.out.println(coment);
        System.out.println("length:"+coment.length());
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        this.coment = this.getText();
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        this.coment = this.getText();
    }
}
