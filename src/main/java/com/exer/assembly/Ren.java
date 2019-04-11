package com.exer.assembly;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/9.
 */
@Component("Qiang")
public class Ren {
    private Qiang qiang;

    public Ren() {
    }

    public Ren(Qiang qiang) {
        this.qiang = qiang;
    }

    @Override
    public String toString() {
        return "Ren{" +
                "qiang=" + qiang +
                '}';
    }
}
