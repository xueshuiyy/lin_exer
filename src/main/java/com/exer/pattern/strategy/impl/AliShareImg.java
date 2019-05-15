package com.exer.pattern.strategy.impl;

import com.exer.pattern.strategy.ShareImg;

/**
 * Created by Administrator on 2019/5/13.
 */
public class AliShareImg implements ShareImg {
    @Override
    public void share() {
        System.out.println("ali sharing img");
    }
}
