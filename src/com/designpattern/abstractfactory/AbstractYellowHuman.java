package com.designpattern.abstractfactory;

import com.designpattern.factory.*;

/**
 * Created by 90 on 2017/1/8.
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人说话");
    }

}
