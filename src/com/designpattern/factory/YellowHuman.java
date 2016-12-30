package com.designpattern.factory;

/**
 * Created by 90 on 2016/12/30.
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人哭");

    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");

    }
}
