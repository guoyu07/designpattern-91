package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/19.
 */
public class YellowMaleHuman extends AbstractYellowHuman {
    @Override
    public void sex() {
        System.out.println("该黄种人为男");
    }
}
