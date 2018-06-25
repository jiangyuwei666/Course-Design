package com.ui.activity;

import com.Uitest;
import com.ui.MyJFrame;
import com.ui.fragment.AdminRegister;
import com.ui.fragment.StudentRegister;
import com.ui.fragment.TeacherRegister;

import javax.swing.*;
import java.awt.*;

public class PersonalCentre extends MyJFrame {

    StudentRegister studentInfo;
    TeacherRegister teacherRegister;
    AdminRegister adminRegister;

    public PersonalCentre(  int width, int height ,String s ,String operator){
        super(width,height,s);
        if (operator.equals("学生")){
            initStudent(width,height);
        }
        if (operator.equals("教师")){
            initTeacher(width,height);
        }
        if (operator.equals("管理员")){
            initAdmin(width,height);
        }
    }

    private void initStudent(int width, int height){
        studentInfo = new StudentRegister(0,0,width,height);
        studentInfo.jtUser.setText("1607094156");
        studentInfo.btnCheck.setVisible(false);
        studentInfo.btnFinish.setText("保存");
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//fuction_backgroud.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_DEFAULT)
        );
        studentInfo.setIcon(img);
        this.add(studentInfo);
    }
    private void initTeacher(int width, int height){
        teacherRegister = new TeacherRegister(0,0,width,height);
        teacherRegister.jtUser.setText("1607094156");
        teacherRegister.btnCheck.setVisible(false);
        teacherRegister.btnFinish.setText("保存");
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//fuction_backgroud.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_DEFAULT)
        );
        teacherRegister.setIcon(img);
        this.add(teacherRegister);
    }

    private void initAdmin(int width, int height){
        adminRegister = new AdminRegister(0,0,width,height);
        adminRegister.jtUser.setText("1607094156");
        adminRegister.btnCheck.setVisible(false);
        adminRegister.btnFinish.setText("保存");
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//fuction_backgroud.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(this.getWidth(),this.getHeight(), Image.SCALE_DEFAULT)
        );
        adminRegister.setIcon(img);
        this.add(adminRegister);
    }

}
