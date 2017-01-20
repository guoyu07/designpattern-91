package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/19.
 */
public abstract class AbstractBlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑人会交谈");
    }
}
