package com.exer.pattern.observer.girlboy.push;

/**
 * Created by Administrator on 2019/5/15.
 */
public class ObserverPushTest {
    public static void main(String[] args) {
        Girl girl = new Girl();
        BoyA boyA = new BoyA(girl);
        BoyB boyB = new BoyB(girl);
        BoyC boyC = new BoyC(girl);

        girl.hungry();
    }
}
