package com.exer.pattern.strategy;

import lombok.Data;
import lombok.Setter;

/**
 * Created by Administrator on 2019/5/13.
 */
@Setter
public class ShareContext {

    protected ShareImg shareImg;
    protected ShareUrl shareUrl;

    public void getImg() {
        shareImg.share();
    }

    public void getUrl() {
        shareUrl.share();
    }
}
