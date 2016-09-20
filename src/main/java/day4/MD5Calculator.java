package day4;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5Calculator {

    private MessageDigest md;

    public MD5Calculator() {
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Couldn't get instance MD5 algorithm");
        }
    }

    public String calculateMD5(String privateKey) {
        md.update(privateKey.getBytes());
        byte[] bytes = md.digest();

        return DatatypeConverter.printHexBinary(bytes);
    }
}
