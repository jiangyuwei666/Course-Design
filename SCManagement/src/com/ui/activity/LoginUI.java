package com.ui.activity;

import com.Uitest;
import com.ui.*;
import com.utils.MyLog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginUI extends MyJFrame implements ActionListener{
    MyJLabel myJLabel;
    MyJLabel user;
    MyJLabel password;
    MyJTextField jtUsername;
    MyPassword jtPassword;
    MyJLabel jlTitle ;
    MyButton btnLogin;
    MyButton btnRegister;
    MyJCombBox comBox ;
    MyCheckBox checkBox;
    MyJLabel jLfoget;

    public static String operator = "学生";

    public LoginUI(){
        super( 700 , 500,"选修课系统");
        this.setExit(JFrame.EXIT_ON_CLOSE);
        initView();
        this.validate();//以防combox的下拉箭头消失
        this.repaint();
    }

    public void initView(){
        Font font = new Font("宋体",Font.PLAIN,30);
        Font font1 = new Font("宋体",Font.PLAIN,25);

        myJLabel = new MyJLabel(0,0,700,500);
        jlTitle = new MyJLabel(0,0,700,150,new Font("楷体",Font.BOLD,60),"      选修课系统");
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//login.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(700,500,Image.SCALE_DEFAULT)
        );
        myJLabel.setIcon(img);
        jtUsername = new MyJTextField(165,160,330,50,font1);
        jtUsername.doc.addDocumentListener(jtUsername);
        jtPassword = new MyPassword(165,235,330,50,font1);
        jtPassword.doc.addDocumentListener(jtPassword);


        password = new MyJLabel(55,225,155,70,font,"密码：");
        user = new MyJLabel(55,150,155,70,font, "用户名：");

        btnLogin = new MyButton(215,315,230,50,font1,"登陆");
        btnRegister = new MyButton(215,370,230,50,font1,"注册");
        btnRegister.addActionListener(this);
        btnLogin.addActionListener(this);

        comBox = new MyJCombBox(540,162,95,45,new Font("宋体",Font.PLAIN,20));
        comBox.addItems("学生","教师","管理员");
        comBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                operator = comBox.getSelectedItem().toString();
                System.out.println(operator);
            }
        });

        checkBox = new MyCheckBox(535,240,110,30,"显示密码" ,new Font("宋体",Font.PLAIN,20));
//        checkBox.setBackground(Color.CYAN);
        checkBox.setOpaque(true);

        jLfoget = new MyJLabel(550,265,100,30,new Font("楷体",Font.ITALIC,16),"忘记密码？");
        jLfoget.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                MyLog.d("忘记密码");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
               jLfoget.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jLfoget.setForeground(Color.darkGray);
            }
        });

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    jtPassword.setEchoChar((char)0);
                }
                else {
                    jtPassword.setEchoChar('*');
                }
            }
        });

        myJLabel.add(jlTitle);
        myJLabel.add(checkBox);
        myJLabel.add(comBox);
        myJLabel.add(btnRegister);
        myJLabel.add(btnLogin);
        myJLabel.add(jtPassword);
        myJLabel.add(jtUsername);
        myJLabel.add(user);
        myJLabel.add(password);
        myJLabel.add(jLfoget);

        this.add(myJLabel);
//        this.getContentPane().setBackground(Color.cyan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();
        if (btnName == "注册"){
            MyLog.d("点击了注册");
            new RegisterUI();
        }
        if (btnName == "登陆"){
            MyLog.d("点击了登陆");
            doLogin();
        }
    }

    public void doLogin(){
        if (jtUsername.coment.equals("123")&&jtPassword.pass.equals("123")){
            new FuctionUI(jtUsername.coment , this);
            this.setVisible(false);
        }
        else {
            System.out.println(jtUsername.getText());
            System.out.println(jtPassword.getPassword());
        }
    }

}
