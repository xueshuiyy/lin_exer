package com.exer.statictest.extend;

/**
 * Created by Administrator on 2019/4/11.
 */
public class Child extends Parent{

    static{
        new Print("a");
    }

    public static Print obj1 = new Print("b");

    {
        new Print("anaymous");
    }
    public Print obj2 = new Print("c");
    {
        new Print("anaymous2");
    }
    public Child (){
        new Print("d");
    }

    public static Print obj3 = new Print("e");

    public Print obj4 = new Print("f");

    public static void main(String [] args){
        Parent obj1 = new Child ();
        Parent obj2 = new Child ();
    }
}
