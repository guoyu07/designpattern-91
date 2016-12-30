package com.designpattern.factory;

/**
 * Created by 90 on 2016/12/30.
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人说话");
    }
}
