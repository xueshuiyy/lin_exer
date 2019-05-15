package com.exer.pattern.strategy.impl;

import com.exer.pattern.strategy.ShareUrl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/5/13.
 */
@Component
public class WxShareUrl implements ShareUrl {

    @Value("${share.url}")
    public String url;

    @Override
    public void share() {
        System.out.println("wx sharing url");
    }
}
