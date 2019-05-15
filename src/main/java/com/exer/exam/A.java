package com.exer.exam;

/**
 * @Title: resourceDemo
 * @Auth: lenovo
 * @Date: 2019/2/16
 */
public class A {
    private static final String v2 = new A().initV2();
//    private static final String v2 = initV2();
    private String v1 = initV1();
    private final String v3 = initV3();

    static {
        System.out.println("2");
    }
    {
        System.out.println("1");
    }


    public String initV1() {
        System.out.println("3");
        return null;
    }

    public String initV2() {
        System.out.println("4");
        return null;
    }

    public String initV3() {
        System.out.println("5");
        return null;
    }

    public static void main(String[] args) {

        /*String fileName = "F:\\file.dat";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileName));
            String msg = "";
            while ((msg = bf.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        String A = "WOWO";
        String a = "WOWO";
        String aa = "WOWO";
        System.out.println(A==a);
        System.out.println(A==new String("WOWO"));
        System.out.println(new Integer(128) == new Integer(128));

        long b = 1;
        short c = 1;
        System.out.println(b==c);


        String m = "taobao";
        String n = "tao";
        String o = "bao";
        System.out.println(m == (n+o));

    }
}
