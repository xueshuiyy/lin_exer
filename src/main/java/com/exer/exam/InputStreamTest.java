package com.exer.exam;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            /*FileInputStream in = new FileInputStream("F:\\file.dat");
            in.skip(1);
            int c = in.read();*/
            RandomAccessFile in = new RandomAccessFile("F:\\file.dat", "r");
            in.skipBytes(9);
            int c = in.readByte();
            System.out.println("c:" + c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
