package com.ui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;

public class MyPassword extends JPasswordField implements DocumentListener {

    public String pass;
    public MyJLabel strengh;
    public MyJLabel info;
    public Document doc;

    public static String PS = "密码强度：";


    public MyPassword(int x, int y, int width ,int height ,Font font){
        this.setBounds(x,y,width,height);
        this.setFont(font);
        this.setEchoChar('*');
        doc = this.getDocument();
    }

    @Override
    public void insertUpdate(DocumentEvent e) {
//        MyLog.d("password测试");
        pass = new String (this.getPassword());
//        System.out.println(pass);
//        System.out.println("length:"+pass.length());
        if ( strengh != null ){
            if (pass.length()<6){
                strengh.setText(PS + "弱");
            }
            else if (pass.length()<12){
                strengh.setText(PS + "中");
            }
            else if (pass.length()<20){
                strengh.setText(PS + "强");
            }
        }
        if ( info != null ){
            info.setForeground(Color.red);
            if (pass.length()>20){
                info.setText("已超过20个字符");
            }
            else {
                info.setText("请输入1-20个字符作为密码");
            }
        }
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        pass = new String (this.getPassword());
        if ( strengh != null ){
            if (pass.length()<6){
                strengh.setText(PS + "弱");
            }
            else if (pass.length()<12){
                strengh.setText(PS + "中");
            }
            else if (pass.length()<20){
                strengh.setText(PS + "强");
            }
        }
        if ( info != null ){
            info.setForeground(Color.red);
            if (pass.length()>20){
                info.setText("已超过20个字符");
            }
            else {
                info.setText("请输入1-20个字符作为密码");
            }
        }
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
        pass = new String (this.getPassword());
        if ( strengh != null ){
            if (pass.length()<6){
                strengh.setText(PS + "弱");
            }
            else if (pass.length()<12){
                strengh.setText(PS + "中");
            }
            else if (pass.length()<20){
                strengh.setText(PS + "强");
            }
        }
        if ( info != null ){
            info.setForeground(Color.red);
            if (pass.length()>20){
                info.setText("已超过20个字符");
            }
            else {
                info.setText("请输入1-20个字符作为密码");
            }
        }
    }
}
