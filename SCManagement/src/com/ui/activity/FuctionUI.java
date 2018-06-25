package com.ui.activity;

import com.ui.MyJFrame;
import com.ui.MyJLabel;
import com.ui.fragment.AdminFuction;
import com.ui.fragment.StudentFuction;
import com.ui.fragment.TeacherFuction;
import com.utils.MyLog;
import com.utils.SetFont;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FuctionUI extends MyJFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu menu;
    JMenuItem itemMe;
    JMenuItem itemLogout;
    MyJFrame login;
    JTabbedPane studentFuction;
    JTabbedPane teacherFuction;
    JTabbedPane adminFuction;

    FuctionUI(String title , MyJFrame login){
        super(1000,600,"你好"+title);
        this.login = login;
        setExit(EXIT_ON_CLOSE);
        initBar( LoginUI.operator );
    }

    public void initBar( String operator ){
        Font font30 = new  Font( "宋体",Font.PLAIN,30);
        Font font20 = new Font( "宋体",Font.PLAIN,20);

        menuBar = new JMenuBar();
        menu = new JMenu(" 菜 单 ");
        menu.setFont(font20);
        itemMe = new JMenuItem("个人中心");
        itemLogout = new JMenuItem("退出登陆");
        SetFont.setFont(font20,itemMe,itemLogout);
        itemLogout.addActionListener(this);
        itemMe.addActionListener(this);
        menu.add(itemMe);
        menu.add(itemLogout);
        menu.addSeparator();
        menuBar.add(menu);

        if ( operator == "学生" ){
            MyLog.d("功能界面登陆测试",operator);
            studentFuction = new StudentFuction(JTabbedPane.LEFT);
            this.add(studentFuction);
        }
        else if ( operator == "教师" ){
            MyLog.d("功能界面登陆测试",operator);
            teacherFuction = new TeacherFuction(JTabbedPane.LEFT);
            this.add(teacherFuction);
        }
        else if ( operator == "管理员"){
            MyLog.d("功能界面登陆测试",operator);
            adminFuction = new AdminFuction(JTabbedPane.LEFT);
            this.add(adminFuction);
        }

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("个人中心")){
            MyLog.d("功能界面个人中心测试");
            new PersonalCentre(500,700,"个人中心",LoginUI.operator);
        }
        if (e.getActionCommand().equals("退出登陆")){
            login.setVisible(true);
            this.dispose();
        }
    }
}
