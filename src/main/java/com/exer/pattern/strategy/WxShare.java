package com.exer.pattern.strategy;

import com.exer.pattern.strategy.impl.WxShareImg;
import com.exer.pattern.strategy.impl.WxShareUrl;

/**
 * 微信分享的实体类
 */
public class WxShare extends ShareContext {
    public WxShare() {
        shareImg = new WxShareImg();
        shareUrl = new WxShareUrl();
    }

    public void show() {
        System.out.println("wx show");
    }
}
