package com.ui.activity;

import com.ui.MyButton;
import com.ui.MyJFrame;
import com.ui.fragment.MyBaseTablePanel;
import com.utils.MyLog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherCourse extends MyJFrame implements ActionListener {

    MyBaseTablePanel courseInfo;

    public TeacherCourse( int width, int height, String s , String course){
        super(width,height,s);
        String[] titles = {"课程名称","姓名","学号","签到次数","成绩"};
        String[] buttonID = {"刷新","打分","返回"};
        courseInfo = new MyBaseTablePanel(titles,buttonID);
        for (MyButton b : courseInfo.getMyButtons()){
            b.addActionListener(this);
        }
        this.add(courseInfo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("刷新")){
            MyLog.d("老师的课程详情界面",e.getActionCommand());
        }
        if (e.getActionCommand().equals("打分")){
            MyLog.d("老师的课程详情界面",e.getActionCommand());
            if (MyBaseTablePanel.info != null){
                new TeacherAlterStudent( 400,250, MyBaseTablePanel.info.get(1));
            }
        }
        if (e.getActionCommand().equals("返回")){
            MyLog.d("老师的课程详情界面",e.getActionCommand());
            this.dispose();
        }
    }
}
