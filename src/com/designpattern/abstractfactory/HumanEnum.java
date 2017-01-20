package com.designpattern.abstractfactory;

/**
 * Created by 90 on 2017/1/19.
 */
public enum HumanEnum {
    YelloMaleHuman("com.designpattern.abstractfactory.YellowMaleHuman"),
    YelloFemaleHuman("com.designpattern.abstractfactory.YellowFemaleHuman"),;
    private String value;

    private HumanEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
