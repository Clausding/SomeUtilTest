package codec;

import org.apache.commons.codec.binary.Hex;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CodecTest {
    public static void main(String[] args) {
        String str = "are you ok";

        for (int i = 0; i < 1000; i++) {
            str = str + 1;
            String codecStr = getSHA256Str(str);
            System.out.println(codecStr);
        }
    }

    /**
     * 对字符串进行SHA-256计算
     * @param str 输入字符串
     * @return 计算结果
     */
    public static String getSHA256Str(String str) {
        MessageDigest messageDigest;
        String encdeStr = "";
        try {
            messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] hash = messageDigest.digest(str.getBytes("UTF-8"));
            encdeStr = Hex.encodeHexString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return encdeStr;
    }

}
