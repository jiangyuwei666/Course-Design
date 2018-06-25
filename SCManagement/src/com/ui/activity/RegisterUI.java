package com.ui.activity;

import com.Uitest;
import com.ui.*;
import com.ui.fragment.AdminRegister;
import com.ui.fragment.StudentRegister;
import com.ui.fragment.TeacherRegister;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RegisterUI extends MyJFrame implements ItemListener{

    MyJCombBox combox;
    MyJLabel studentRegister;
    MyJLabel teacherRegister;
    MyJLabel adminRegister;


    public RegisterUI(){
        super(500,700,"注册");
        this.setExit(JFrame.DISPOSE_ON_CLOSE);
        combox = new MyJCombBox(310,41,85,37,new Font("宋体",Font.PLAIN,16));
        combox.addItems("学生","教师","管理员");
        combox.addItemListener(this);
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//register.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(this.getWidth(),this.getHeight(),Image.SCALE_DEFAULT)
        );

        studentRegister = new StudentRegister( this.getX(),this.getY(),this.getWidth(),this.getHeight());
        teacherRegister = new TeacherRegister( this.getX(),this.getY(),this.getWidth(),this.getHeight());
        adminRegister = new AdminRegister( this.getX(),this.getY(),this.getWidth(),this.getHeight());
        studentRegister.setIcon(img);
        teacherRegister.setIcon(img);
        adminRegister.setIcon(img);
        this.add(combox);

        this.add(studentRegister);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if ( combox.getSelectedItem().toString().equals("学生") ){
            MyLog.d("切换测试","学生");
            teacherRegister.setVisible(false);
            adminRegister.setVisible(false);
            this.add(studentRegister);
            studentRegister.setVisible(true);
        }
        if( combox.getSelectedItem().toString().equals("教师")){
            MyLog.d("切换测试","教师");
            studentRegister.setVisible(false);
            adminRegister.setVisible(false);
            this.add(teacherRegister);
            teacherRegister.setVisible(true);
        }
        if( combox.getSelectedItem().toString().equals("管理员")){
            MyLog.d("切换测试","管理员");
            teacherRegister.setVisible(false);
            studentRegister.setVisible(false);
            this.add(adminRegister);
            adminRegister.setVisible(true);
        }
    }
}
