package com.exer.pattern.strategy;

/**
 * Created by Administrator on 2019/5/13.
 */
public class ShareContext {

    protected ShareImg shareImg;
    protected ShareUrl shareUrl;

    public void setShareImg(ShareImg shareImg) {
        this.shareImg = shareImg;
    }

    public void setShareUrl(ShareUrl shareUrl) {
        this.shareUrl = shareUrl;
    }

    public void getImg() {
        shareImg.share();
    }

    public void getUrl() {
        shareUrl.share();
    }
}
