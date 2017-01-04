package com.designpattern.factory;

/**
 * Created by 90 on 2017/1/4.
 */
public class HumanFactory {
    public static Human createHuman(Class c){
        Human human = null;
        try {
           human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("必须指定颜色");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("定义的类没有找到");
            e.printStackTrace();
        }
        return human;
    }

}
