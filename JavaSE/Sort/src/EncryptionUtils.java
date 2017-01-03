import des.DESUtil;

/**
 * Created by gavin on 2017/1/3.
 * 加密算法
 */
public class EncryptionUtils {

    public static void main(String[] args) {

        String encrypt = DESUtil.encrypt("ddddddddddddd");

        System.out.printf(encrypt+"");
    }
}
