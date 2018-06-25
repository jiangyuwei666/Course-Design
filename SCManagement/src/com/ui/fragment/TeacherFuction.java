package com.ui.fragment;

import com.ui.MyButton;
import com.ui.activity.TeacherCourse;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TeacherFuction extends JTabbedPane implements ActionListener {

    MyBaseTablePanel minePanl;
    ArrayList<MyButton> buttons = new ArrayList<>();

    public TeacherFuction(int style){
        super(style);
        init();
    }

    private void init(){
        String[] titles = {"课程名称","上课时间","上课地点","开课时间"};
        String[] buttonId = {"刷新","查看课程"};
        minePanl = new MyBaseTablePanel(titles,buttonId);
        buttons = minePanl.getMyButtons();
        this.setFont(new Font("宋体",Font.PLAIN,30));
        this.addTab("<html>我<br>执<br>教<br>的<br>课<br>程</html",minePanl);
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("刷新")){
            MyLog.d("教师fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("查看课程")){
            MyLog.d("教师fuction界面",e.getActionCommand());
            if (MyBaseTablePanel.info != null){
                String s = MyBaseTablePanel.info.get(0);
                new TeacherCourse(1000,600,"某某课程",s);
                System.out.println(s);
            }
        }
    }
}
