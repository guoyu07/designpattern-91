package com.designpattern.multion;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by 90 on 2016/12/30.
 */
public class Emperor {
    private static int maxNumOfEmperor = 2;//定义皇帝个数
    private static ArrayList emperorList = new ArrayList(maxNumOfEmperor);//装皇帝的列表
    private static ArrayList emperorInfoList = new ArrayList(maxNumOfEmperor);//装皇帝名字的列表
    private static int countNumOfEmperor = 0;//当前第几个皇帝
    static {
        for (int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("第"+i+"个皇帝"));
        }
    }

    public Emperor() {
    }
    public Emperor(String info) {
        emperorInfoList.add(info);
    }
    public static Emperor getInstance(){
        Random random = new Random();
       countNumOfEmperor =  random.nextInt(maxNumOfEmperor);
       return (Emperor) emperorList.get(countNumOfEmperor);
    }
    public static void emperorInfo(){
        System.out.println(emperorInfoList.get(countNumOfEmperor));
    }

}
