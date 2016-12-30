package com.designpattern.multion;

/**
 * Created by 90 on 2016/12/30.
 */
public class Minster {
    public static void main(String[] args) {
        int minMinserNum = 10;
        for (int i=0;i<minMinserNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.println("第"+i+"个大臣参拜的皇帝是");
            emperor.emperorInfo();
        }


    }
}
