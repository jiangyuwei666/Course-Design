package com.ui.fragment;

import com.ui.MyButton;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class StudentFuction extends JTabbedPane implements ActionListener {

    MyBaseTablePanel signInPanel;
    MyBaseTablePanel electivePanel;//选课板块
    MyBaseTablePanel minePanel;
    MyBaseTablePanel myGradePanel;

    ArrayList<MyButton> buttons = new ArrayList<>();

    public StudentFuction( int style ){
        super(style);
        init();
    }
    private void init(){

        String[] titles = {"姓名","学号","时间","课程"};
        String[] buttonId = {"刷新","签到"};
        signInPanel = new MyBaseTablePanel(titles,buttonId);

        titles = new String[]{"课程名称","上课时间","上课地点"};
        buttonId = new String[]{"刷新","确认选课"};
        electivePanel = new MyBaseTablePanel(titles , buttonId);

        buttonId = new String[]{"刷新","取消选课"};
        minePanel = new MyBaseTablePanel(titles,buttonId);

        titles = new String[]{"课程名称","课程成绩"};
        buttonId = new String[]{"刷新",};
        myGradePanel = new MyBaseTablePanel(titles , buttonId);

        buttons = signInPanel.getMyButtons();
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }
        buttons = electivePanel.getMyButtons();
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }
        buttons = minePanel.getMyButtons();
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }
        buttons = myGradePanel.getMyButtons();
        for ( MyButton b : buttons ){
            b.addActionListener(this);
        }

        this.setFont(new Font("宋体",Font.PLAIN,30));
        this.addTab("<html>签<br>到</html>",signInPanel);
        this.addTab("<html>选<br>课</html",electivePanel);
        this.addTab("<html>我<br>的<br>选<br>修<br>课</html",minePanel);
        this.addTab("<html>我<br>的<br>成<br>绩</html",myGradePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("刷新")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("签到")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("确认选课")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("取消选课")){
            MyLog.d("管理fuction界面",e.getActionCommand());
        }
    }
}
