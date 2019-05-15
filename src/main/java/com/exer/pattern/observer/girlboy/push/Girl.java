package com.exer.pattern.observer.girlboy.push;

import java.util.Observable;

/**
 * Created by Administrator on 2019/5/14.
 */
public class Girl extends Observable {

    public void hungry() {
        System.out.println("OMG, i'm hungry!");
        setChanged();
        notifyObservers("i want hamburgers");
    }
}
