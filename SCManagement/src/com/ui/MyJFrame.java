package com.ui;

import javax.swing.*;


public class MyJFrame extends JFrame {


    public MyJFrame(int width ,int height ,String s ){
        setVisible(true);//可见
        setSize(width,height);
        setTitle(s);
        setLocationRelativeTo(null);//居中
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//退出
    }

    /**
     * 修改退出方式
     * @param x
     */
    public void setExit(int x){
        setDefaultCloseOperation(x);
    }

}
