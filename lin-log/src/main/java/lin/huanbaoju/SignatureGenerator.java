package lin.huanbaoju;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 加密
 */
public class SignatureGenerator {

    public static String generate(String appId, String appSecurityKey, String nonce, long timestamp) {
        final List<String> sortData = new ArrayList<>();
        sortData.add(appId);
        sortData.add(appSecurityKey);
        sortData.add(nonce);
        sortData.add(String.valueOf(timestamp));
        Collections.sort(sortData);
        final StringBuilder builder = new StringBuilder();
        for (final String value : sortData) {
            builder.append(value);
        }
        return DigestUtils.sha1Hex(builder.toString());
    }
}
