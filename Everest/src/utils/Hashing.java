package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JOptionPane;

public final class Hashing {

    private Hashing() {
    }

    public static String toMD5(String plaintext) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException ex) {
            JOptionPane.showMessageDialog(null, "MD5 Hashing Exception !");
        }
        byte[] messageDigest = md.digest(plaintext.getBytes());
        BigInteger number = new BigInteger(1, messageDigest);
        String hashtext = number.toString(16);
        return hashtext;
    }
}
