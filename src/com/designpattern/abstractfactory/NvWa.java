package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/20.
 */
public class NvWa {
    public static void main(String[] args) {
        HumanFactory femaleHumamFactroy = new FemaleHumanFactory();
        Human yellowHuman =femaleHumamFactroy.createYellowHuman();
        yellowHuman.sex();
        yellowHuman.cry();
        yellowHuman.talk();
        yellowHuman.laugh();
        System.out.println("华丽分割线--------------------");

        HumanFactory maleHumanFactory = new MaleHumanFactory();
        Human yellowMaleHuman  = maleHumanFactory.createYellowHuman();
        yellowMaleHuman.laugh();
        yellowMaleHuman.talk();
        yellowMaleHuman.cry();
        yellowMaleHuman.sex();
    }
}
