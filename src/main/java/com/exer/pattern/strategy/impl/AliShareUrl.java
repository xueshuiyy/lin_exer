package com.exer.pattern.strategy.impl;

import com.exer.pattern.strategy.ShareImg;
import com.exer.pattern.strategy.ShareUrl;

/**
 * Created by Administrator on 2019/5/13.
 */
public class AliShareUrl implements ShareUrl {
    @Override
    public void share() {
        System.out.println("ali sharing url");
    }
}
