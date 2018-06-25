package com.utils;

import java.util.Date;

public class MyLog {

    public static void d(String s){
        System.out.println(new Date()+":"+"————————————————"+s+"————————————————");
    }
    public static void d(String s ,String l){
        System.out.println(new Date()+":"+"————————————————"+s+"————————————————"+"     "+l);
    }
}
