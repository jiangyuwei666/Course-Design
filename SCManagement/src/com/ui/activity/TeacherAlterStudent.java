package com.ui.activity;

import com.Uitest;
import com.ui.MyButton;
import com.ui.MyJFrame;
import com.ui.MyJLabel;
import com.ui.MyJTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherAlterStudent extends MyJFrame implements ActionListener {

    MyJLabel jlGrade;
    MyJLabel context;
    MyJTextField jtGrade;
    MyButton btnConfirm;

    public TeacherAlterStudent(int width, int height, String s){
        super(width,height,s);
        Font font20 = new Font("宋体",Font.PLAIN,20);
        context = new MyJLabel(0,0,width,height);
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//alter.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(width,height, Image.SCALE_DEFAULT)
        );
        context.setIcon(img);
        jlGrade = new MyJLabel(50,60,100,40,font20,"填写分数:");
        jtGrade = new MyJTextField(150,60,100,40,font20);
        btnConfirm = new MyButton(150,130,100,40,font20,"确定");
        btnConfirm.addActionListener(this);
        context.add(jlGrade);
        context.add(jtGrade);
        context.add(btnConfirm);
        this.add(context);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int grade = Integer.parseInt(jtGrade.getText());
        if (grade>100 || grade<0){
            JOptionPane.showMessageDialog(null,"请输入正确的成绩","打分失败",JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.dispose();
        }
    }

}
