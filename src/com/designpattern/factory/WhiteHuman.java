package com.designpattern.factory;

/**
 * Created by 90 on 2016/12/30.
 * 定义一个白种人
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人哭");

    }

    @Override
    public void talk() {
        System.out.println("白种人说话");
    }
}
