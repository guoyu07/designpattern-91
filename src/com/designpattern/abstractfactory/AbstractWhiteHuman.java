package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/8.
 */
public abstract class AbstractWhiteHuman implements Human {

    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人会交谈");
    }
}
