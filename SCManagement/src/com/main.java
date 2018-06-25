package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class main {

    public static void main(String[] args) {


        String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";//SQL数据库引擎
        String uri="jdbc:sqlserver://localhost:1433;DatabaseName=选修课管理系统";
        String userName="sa";
        String password="aptx4869++";
        try{
            Class.forName(driverName);
            Connection connection= DriverManager.getConnection(uri,userName,password);
            String sql = "select *from Student";
            PreparedStatement statement =connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("连接数据库成功");
            while (resultSet.next()){
                String t = resultSet.getString("Sno");
                System.out.println(t);
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("连接失败");
        }
    }

}
