package com.exer.pattern.observer.girlboy.pull;

import java.util.Observable;

/**
 * Created by Administrator on 2019/5/14.
 */
public class Girl extends Observable {

    private String name = "Lucy";

    public String getName() {
        return name;
    }


    public void hungry() {
        System.out.println("OMG, i'm hungry!");
        setChanged();
        notifyObservers(this);
    }
}
