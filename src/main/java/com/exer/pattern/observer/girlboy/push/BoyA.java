package com.exer.pattern.observer.girlboy.push;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/5/14.
 */
public class BoyA implements Observer, ChaseGirls {

    private Observable girl;

    public BoyA(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void careSomeone(String args) {
        System.out.println("BoyA gives money,girls say: " + args);
    }

    @Override
    public void update(Observable o, Object arg) {
        careSomeone((String) arg);
    }
}
