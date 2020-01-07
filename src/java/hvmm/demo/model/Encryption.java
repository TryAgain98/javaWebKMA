/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Huy Toan
 */
public class Encryption {

    private SecretKeySpec secretKey;//khóa của aes
    private byte[] key;

    public void setKey(String myKey)//Đưa Khóa nhập chuyển sang dạng khóa của aes
    {
        MessageDigest sha = null;
        try {
            key = myKey.getBytes("UTF-8");
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public String encrypt(String strToEncrypt, String khoa)//mã hóa 
    {
        try {
            setKey(khoa);//chuyển sang khóa aes
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");//đối tượng để giải mã và mã hóa
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);//
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
        } catch (Exception e) {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    public String decrypt(String strToDecrypt, String khoa)//giải mã
    {
        try {
            setKey(khoa);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        } catch (Exception e) {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    private static final String alpha = "abcdefghijklmnopqrstuvwxyz"; // a-z
    private static final String alphaUpperCase = alpha.toUpperCase(); // A-Z
    private static final String digits = "0123456789"; // 0-9
    private static final String specials = "~=+%^*/()[]{}/!@#$?|";
    private static final String ALPHA_NUMERIC = alpha + alphaUpperCase + digits;
    private static final String ALL = alpha + alphaUpperCase + digits + specials;

    private static Random generator = new Random();

    public String random(int numberOfCharactor) {
        List<String> result = new ArrayList<>();
        Consumer<String> appendChar = s -> {
            int number = randomNumber(0, s.length() - 1);
            result.add("" + s.charAt(number));
        };
        appendChar.accept(digits);
        appendChar.accept(specials);
        while (result.size() < numberOfCharactor) {
            appendChar.accept(ALL);
        }
        Collections.shuffle(result, generator);
        return String.join("", result);
    }

    public  int randomNumber(int min, int max) {
        return generator.nextInt((max - min) + 1) + min;
    }

    public int ranomKey(){
        Random r=new Random();
        int random;
        random=r.nextInt(3);
        List<Integer> l = new ArrayList<>();
        l.add(16);
        l.add(24);
        l.add(32);
        for(int i=0;i<=2;i++){
            if(random==i){
                random=l.get(i);
            }
        }
        return random;
    }

}
