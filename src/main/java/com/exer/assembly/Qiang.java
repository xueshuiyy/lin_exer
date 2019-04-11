package com.exer.assembly;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/9.
 */
@Component("Qiang")
public class Qiang {
    private String name;
    private String xinghao;
    private String zidankongjing;

    public Qiang() {
    }

    public Qiang(String name, String xinghao, String zidankongjing) {
        this.name = name;
        this.xinghao = xinghao;
        this.zidankongjing = zidankongjing;
    }

    @Override
    public String toString() {
        return "Qiang{" +
                "name='" + name + '\'' +
                ", xinghao='" + xinghao + '\'' +
                ", zidankongjing='" + zidankongjing + '\'' +
                '}';
    }
}
