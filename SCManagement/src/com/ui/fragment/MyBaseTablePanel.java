package com.ui.fragment;

import com.Uitest;
import com.ui.MyButton;
import com.ui.MyJLabel;
import com.ui.activity.LoginUI;
import com.ui.activity.TeacherCourse;
import sun.rmi.runtime.Log;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;

public class MyBaseTablePanel extends JPanel {

    JTable table;
    JLabel btnJlabel;
    MyButton button;
    ArrayList<MyButton> myButtons = new ArrayList<>();
    public static ArrayList<String> info = new ArrayList<>();

    public MyBaseTablePanel(String[] titles ,String[] buttonID){
        this.setLayout(new BorderLayout());
        DefaultTableModel model = new DefaultTableModel(null , titles);
        table = new JTable();
        table.setFont(new Font( "宋体",Font.PLAIN,20));
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font( "宋体",Font.PLAIN,25));
        table.setRowHeight(25);
        table.setModel(model);

        table.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                info.clear();
                for ( int i = 0 ; i < model.getColumnCount() ; i ++){
                    if (model.getValueAt(table.getSelectedRow(),i) != null){
                        info.add(model.getValueAt(table.getSelectedRow(),i).toString());
                    }
                }
                System.out.println(info);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        for ( int i = 0 ; i < 50 ; i++){
            model.addRow(new String[]{i+"蒋昱葳",i+",1607094156", i+","+new Date().toString(),i+"数据库"});
        }
        btnJlabel = new MyJLabel();
        btnJlabel.setPreferredSize(new Dimension(200,600));
        ImageIcon img = new ImageIcon(Uitest.class.getResource("resource//fuction_back.jpg"));
        img.setImage(
                img.getImage().getScaledInstance(200,600,Image.SCALE_DEFAULT)
        );
        btnJlabel.setIcon(img);
        int y = 0;
        for ( String s : buttonID ){
            button = new MyButton(0,y,200,70,new Font("宋体",Font.PLAIN,30),s);
            btnJlabel.add(button);
            myButtons.add(button);
            y = y + 75 ;
        }
        this.add(new JScrollPane(table));
        this.add(BorderLayout.EAST,btnJlabel);

    }

    public ArrayList<MyButton> getMyButtons() {
        return myButtons;
    }
}
