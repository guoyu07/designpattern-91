package com.designpattern.startegy;

/**
 * Created by 90 on 2016/12/22.
 */
public class Context {
    private IStrategy iStrategy;
    public Context(IStrategy iStrategy){
        this.iStrategy=iStrategy;
    }
    public void operate(){
        this.iStrategy.operate();
    }
}
