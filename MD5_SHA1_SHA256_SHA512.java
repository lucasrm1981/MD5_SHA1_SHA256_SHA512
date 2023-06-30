package com.passwords;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author Asus-Netbook
 */
public class MD5_SHA1_SHA256_SHA512 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String pass = "123456";
        
     // With the java libraries
    	String md5 = getMD5(pass);

    	System.out.println("Hash MD-5 of \"" + pass + "\" is:");
    	System.out.println(md5);
    	System.out.println(md5.length()+" Caracteres\n");

        
     // With the java libraries
    	String sha1 = getSHA1(pass);

    	System.out.println("Hash SHA-1 of \"" + pass + "\" is:");
    	System.out.println(sha1);
    	System.out.println(sha1.length()+" Caracteres\n");

	// With the java libraries
	String sha256 = getSHA256(pass);

	System.out.println("Hash SHA-256 of \"" + pass + "\" is:");
	System.out.println(sha256);
	System.out.println(sha256.length()+" Caracteres\n");
        
        // With the java libraries
	String sha512 = getSHA512( pass );

	System.out.println("Hash SHA-512 of \"" + pass + "\" is:");
	System.out.println(sha512);
	System.out.println(sha512.length()+" Caracteres");
    }
    
    public static String getMD5(String input){

    	String toReturn = null;
    	try {
    	    MessageDigest digest = MessageDigest.getInstance("MD5");
    	    digest.reset();
    	    digest.update(input.getBytes("utf8"));
    	    toReturn = String.format("%032x", new BigInteger(1, digest.digest()));
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    	
    	return toReturn;
        }
    
    public static String getSHA1(String input){

    	String toReturn = null;
    	try {
    	    MessageDigest digest = MessageDigest.getInstance("SHA-1");
    	    digest.reset();
    	    digest.update(input.getBytes("utf8"));
    	    toReturn = String.format("%040x", new BigInteger(1, digest.digest()));
    	} catch (Exception e) {
    	    e.printStackTrace();
    	}
    	
    	return toReturn;
        }
    
    public static String getSHA256(String input){

	String toReturn = null;
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-256");
	    digest.reset();
	    digest.update(input.getBytes("utf8"));
	    toReturn = String.format("%064x", new BigInteger(1, digest.digest()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	return toReturn;
    }
    
    public static String getSHA512(String input){

	String toReturn = null;
	try {
	    MessageDigest digest = MessageDigest.getInstance("SHA-512");
	    digest.reset();
	    digest.update(input.getBytes("utf8"));
	    toReturn = String.format("%0128x", new BigInteger(1, digest.digest()));
	} catch (Exception e) {
	    e.printStackTrace();
	}
	
	return toReturn;
    }
    
}
