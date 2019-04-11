package com.exer.arr;

/**
 * Created by Administrator on 2019/4/4.
 */
public class ArrTest {
    public static void main(String[] args) {
        int b[][] = {{1,2,3}, {4,5}, {6,7}};
        System.out.println(b[1].length); // 2
        System.out.println(b.length); // 3
        System.out.println(b[1][1]); // 5

//        int[][] a = {{1,1}, {2,1}};
//        int c[][] = {{1,1}, {2,1}};
        int[][] a = new int[10][10];
        int c[][] = new int[10][10];
//        int d[10][10] = new int[][];
        int d[][] = new int[][]{};
    }
}
