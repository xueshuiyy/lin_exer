package com.exer.assembly;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2019/4/9.
 */
public class RenTest {
    @Autowired
    private Ren ren;

    @Test
    public void test() {
        ren.toString();
    }

}