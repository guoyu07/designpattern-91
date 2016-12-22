package com.designpattern.startegy;

/**
 * Created by 90 on 2016/12/22.
 */
public class GivenGreenLight implements IStrategy{
    @Override
    public void operate() {
        System.out.print("nihaoGivenGreenLight");
    }
}
