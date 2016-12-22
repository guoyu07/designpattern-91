package com.designpattern.startegy;

import com.sun.javaws.Main;

/**
 * Created by 90 on 2016/12/22.
 */
public class ZhaoXun {
    public static void main(String[] args){
        Context context;
        System.out.println("进入了");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("第二个");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("第三个");
        context = new Context(new BlockEnemy());
        context.operate();

    }

}
