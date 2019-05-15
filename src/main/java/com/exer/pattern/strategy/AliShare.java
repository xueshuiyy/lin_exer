package com.exer.pattern.strategy;

import com.exer.pattern.strategy.impl.AliShareImg;
import com.exer.pattern.strategy.impl.AliShareUrl;
import com.exer.pattern.strategy.impl.WxShareImg;
import com.exer.pattern.strategy.impl.WxShareUrl;

/**
 * Created by Administrator on 2019/5/13.
 */
public class AliShare extends ShareContext {
    public AliShare() {
        shareImg = new AliShareImg();
        shareUrl = new AliShareUrl();
    }

    public void show() {
        System.out.println("ali show");
    }
}
