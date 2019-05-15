package com.exer.pattern.strategy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2019/5/13.
 */
@TestPropertySource("classpath:application.yml")  //你的配置文件
public class ShareContextTest {


    /**
     * 微信 分享测试
     */
    @Test
    public void testWx() {
        WxShare wxShare = new WxShare();
        wxShare.getImg();
        wxShare.getUrl();
        wxShare.show();
    }

    /**
     * 支付宝测试，其实和微信的异曲同工之妙
     */
    @Test
    public void testAli() {
        AliShare aliShare = new AliShare();
        aliShare.getImg();
        aliShare.getUrl();
        aliShare.show();
    }
}