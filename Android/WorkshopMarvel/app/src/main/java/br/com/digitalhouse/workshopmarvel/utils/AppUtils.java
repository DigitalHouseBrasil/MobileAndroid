package br.com.digitalhouse.workshopmarvel.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AppUtils {


    public static final String URL_MARVEL = "http://www.marvel.com";

    public static final String PUBLIC_KEY = "6eb7e8896ec5850c52515a8a23ee97f0";
    public static final String PRIVATE_KEY = "0dd0c16fedb8a02985977eafca66b49f5e6a526f";

    public static final String TIMESTAMP = "ts";
    public static final String API_KEY = "apikey";
    public static final String HASH = "hash";


    public static String genKeyUser() {
        String ts = Long.toString(System.currentTimeMillis() / 1000);
        String hash = md5(ts + PRIVATE_KEY + PUBLIC_KEY);
        return "?" + TIMESTAMP + "=" + ts + "&" + API_KEY + "=" + PUBLIC_KEY + "&" +
                HASH + "=" + hash;
    }

    public static String md5(String s) {
        try {
            // Create MD5 Hash
            MessageDigest digest = java.security.MessageDigest.getInstance("MD5");
            digest.update(s.getBytes());

            //byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuilder hexString = new StringBuilder();
            for (int i=0; i<digest.digest().length; i++)
                hexString.append(Integer.toHexString(0xFF & digest.digest()[i]));
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return "";
    }
}
