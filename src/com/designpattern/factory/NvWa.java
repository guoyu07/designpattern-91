package com.designpattern.factory;

/**
 * Created by 90 on 2017/1/4.
 */
public class NvWa {
    public static void main(String[] args){
       WhiteHuman whiteHuman = (WhiteHuman) HumanFactory.createHuman(WhiteHuman.class);
       whiteHuman.talk();
       whiteHuman.cry();
       whiteHuman.laugh();

       BlackHuman blackHuman = (BlackHuman) HumanFactory.createHuman(BlackHuman.class);
       blackHuman.laugh();
       blackHuman.cry();
       blackHuman.talk();

       YellowHuman yellowHuman = (YellowHuman) HumanFactory.createHuman(YellowHuman.class);
       yellowHuman.talk();
       yellowHuman.cry();
       yellowHuman.talk();


    }
}
