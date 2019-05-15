package com.exer.pattern.strategy;

import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Administrator on 2019/5/13.
 */
@SpringBootApplication
public class ShareContextTest {

    public static void main(String[] args) {
        WxShare wxShare = new WxShare();
        wxShare.getImg();
        wxShare.getUrl();
        wxShare.show();
    }

    /**
     * 微信 分享测试
     */
    public void testWx() {
        WxShare wxShare = new WxShare();
        wxShare.getImg();
        wxShare.getUrl();
        wxShare.show();
    }

    /**
     * 支付宝测试，其实和微信的异曲同工之妙
     */
    public void testAli() {
        AliShare aliShare = new AliShare();
        aliShare.getImg();
        aliShare.getUrl();
        aliShare.show();
    }
}