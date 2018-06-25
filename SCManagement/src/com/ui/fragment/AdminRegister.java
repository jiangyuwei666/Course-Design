package com.ui.fragment;

import com.ui.*;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AdminRegister extends MyJLabel implements ActionListener {

    public MyButton btnFinish;
    public MyButton btnCheck;
    MyJLabel jlUser;
    MyJLabel jlName;
    MyJLabel jlPassword;
    MyJLabel jlPassword2;
    public MyJTextField jtName;
    public MyJTextField jtUser;
    public MyPassword password;
    public MyPassword password2;
    public MyCheckBox checkBox;
    public MyRadioButton rbSexB;
    public MyRadioButton rbSexG;
    public ButtonGroup buttonGroup;

    boolean userNameOK = false;

    public  String sex = "男";

    public AdminRegister(int x, int y, int width, int height){
        super(x,y,width,height);
        Font font20 = new Font( "宋体",Font.PLAIN,20);
        Font font25 = new Font("宋体",Font.PLAIN,25);
        Font font16 = new Font("宋体",Font.PLAIN,16);

        jlUser = new MyJLabel( 25,20,90,80,font20,"用户名:");
        jlName = new MyJLabel( 25,95,90,80,font20,"姓名:");
        jlPassword = new MyJLabel( 25,170,90,80,font20,"密码:");
        jlPassword2 = new MyJLabel( 25,245,90,80,font20,"确认密码:");

        jtUser = new MyJTextField(120,40,180,40 ,font25);
        jtUser.doc.addDocumentListener(jtUser);
        jtName = new MyJTextField( 120,115,180,40,font25);
        jtName.doc.addDocumentListener(jtName);
        password = new MyPassword(120,190,180,40,font25);
        password.doc.addDocumentListener(password);
        password2 = new MyPassword(120,265,180,40,font25);
        password2.doc.addDocumentListener(password2);

        rbSexB = new MyRadioButton(310,115,60,40,font16,"男");
        rbSexG = new MyRadioButton(380,115,60,40,font16,"女");
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbSexB);
        buttonGroup.add(rbSexG);

        checkBox = new MyCheckBox(310,190,100,37,"显示密码",font16);
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    password.setEchoChar((char)0);
                    password2.setEchoChar((char)0);
                }
                else {
                    password.setEchoChar('*');
                    password2.setEchoChar('*');
                }
            }
        });

        password.strengh = new MyJLabel(310,265,180,40,font16);
        password.info = new MyJLabel( 120,235,300,20,new Font( "宋体",Font.PLAIN,15));

        btnCheck = new MyButton(405,40,60,37,new Font("宋体",Font.PLAIN,13),"检查");
        btnFinish = new MyButton(180,550,110,50,new Font("宋体",Font.PLAIN,20),"注册");
        btnCheck.addActionListener(this);
        btnFinish.addActionListener(this);

        this.add(password);
        this.add(password2);
        this.add(jtUser);
        this.add(jtName);
        this.add(jlName);
        this.add(jlPassword);
        this.add(jlPassword2);
        this.add(jlUser);
        this.add(btnCheck);
        this.add(btnFinish);
        this.add(checkBox);
        this.add(password.strengh);
        this.add(password.info);
        this.add(rbSexB);
        this.add(rbSexG);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String name = e.getActionCommand();
        if (name == "检查"){
            //获取性别
            if (rbSexG.isSelected()){
                MyLog.d("RadioButtonTest");
                sex = rbSexG.getText();
                System.out.println(sex);
            }
            if (rbSexB.isSelected()){
                MyLog.d("RadioButtonTest");
                sex = rbSexB.getText();
                System.out.println(sex);
            }
            if(jtUser.getText().equals("1607094156")){
                JOptionPane.showMessageDialog(null,"该用户已被注册","检查",JOptionPane.WARNING_MESSAGE);
                userNameOK = false;
            }
            else {
                JOptionPane.showMessageDialog(null,"可以使用","检查",JOptionPane.INFORMATION_MESSAGE);
                userNameOK = true;
            }
        }
        if (name == "注册"){
            if (userNameOK == false && jtUser.coment != null){
                System.out.println(jtUser.coment);
                JOptionPane.showMessageDialog(null,"请输入正确的编号","注册失败",JOptionPane.ERROR_MESSAGE);
            }
            else if (!password.pass.equals(password2.pass)){
                System.out.println(password.pass);
                JOptionPane.showMessageDialog(null,"两次密码不一致！","注册失败",JOptionPane.ERROR_MESSAGE);
            }
            else if ( password.pass.length() > 0 && password.pass.length()<=20 ){
                System.out.println(password.pass);
                JOptionPane.showMessageDialog(null,"注册成功！","注册成功",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

}
