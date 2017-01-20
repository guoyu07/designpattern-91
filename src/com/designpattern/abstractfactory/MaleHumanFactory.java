package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/20.
 */
public class MaleHumanFactory extends AbstractHumanFactory {

    @Override
    public Human createYellowHuman() {
        return super.createHuman(HumanEnum.YelloMaleHuman);
    }
}
