package lin.huanbaoju;

import java.util.Date;

public class SignatureTest {

    private String tentNo = "T20180130";
    private String server = "http://192.168.3.35:8000";
    private static String appid = "SA33M3Z345D9AH";
    private static String appSecurityKey = "wasn9r84gk7t4budtfkzvxupj6kbkrny";
    private static String nonce = String.valueOf(Math.random());
    private static long timestamp = new Date().getTime();

    public static void main(String[] args) {
        System.out.println("时间戳：" + timestamp);
        System.out.println("随机数：" + nonce);
        String sign = SignatureGenerator.generate(appid, appSecurityKey, nonce, timestamp);
        System.out.println("签名：" + sign);

//        System.out.println("随机数：" + Math.random()* 100);

    }
}
