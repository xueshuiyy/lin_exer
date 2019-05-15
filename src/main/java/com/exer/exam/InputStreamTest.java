package com.exer.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/15
 */
public class InputStreamTest {
    public static void main(String[] args) {
        /*FileInputStream in = new FileInputStream("F:\\file.dat");
        in.skip(1);
        int c = in.read();*/
//            RandomAccessFile in = new RandomAccessFile("F:\\file.dat", "r");
           /* RandomAccessFile in = new RandomAccessFile(new FileReader("F:\\file.dat"));
            in.skipBytes(9);
            int c = in.readByte();
            System.out.println("c:" + c);*/

        String fileName = "G:\\1.txt";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String msg = "";
            while ((msg = bf.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
