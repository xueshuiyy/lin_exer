package com.exer.pattern.observer.girlboy.pull;


import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2019/5/15.
 */
public class BoyC implements Observer, ChaseGirls {
    private Observable girl;

    public BoyC(Observable observable) {

        observable.addObserver(this);
    }
    @Override
    public void careSomeone(Observable observable) {
        Girl girl = (Girl) observable;
        System.out.println("BoyC gives some food,girls say: " + girl.getName());
    }

    @Override
    public void update(Observable o, Object arg) {
        careSomeone(o);
    }

}
