package com.ui.fragment;

import com.ui.MyButton;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminFuction extends JTabbedPane implements ActionListener {

    JPanel coursePanel;

    ArrayList<MyButton> buttons = new ArrayList<>();
    public AdminFuction(int style){
        super(style);
        init();
    }

    private void init(){
        String[] titles = {"课程名称","上课时间","上课地点","开课时间"};
        String[] buttonId = {"刷新","修改","添加课程","删除课程"};
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }
        coursePanel = new MyBaseTablePanel(titles,buttonId);
        this.setFont(new Font("宋体",Font.PLAIN,30));
        this.addTab("<html>课<br>程<br>信<br>息</html",coursePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("刷新")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("修改")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("添加课程")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("删除课程")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
    }
}
