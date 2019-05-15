package com.exer.pattern.strategy.impl;

import com.exer.pattern.strategy.ShareImg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/5/13.
 */
@Component
@PropertySource("classpath:application.yml")
public class WxShareImg implements ShareImg {

    public WxShareImg() {
    }


    @Override
    public void share() {
        System.out.println("wx sharing img");
    }
}
