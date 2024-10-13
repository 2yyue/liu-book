package com.fatey.liu.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Liu Fatey
 * @description 用户密码加密类
 * @created 2024/10/13 下午9:09
 */
public class PasswordEncrypt {
	private static final Logger LOGGER = LoggerFactory.getLogger(PasswordEncrypt.class);
	// 采用MD5加盐的方式进行密码加密
	private static final String SALT = "LiuFatey";
	
	public static void main(String[] args) {
		String password = "123456";
		String cipher = encrypt(password);
		System.out.println(cipher);
		System.out.println(cipher.length());
		System.out.println(decrypt(password, encrypt(password)));
	}
	
	// 加密 密文长度为32个字符
	public static String encrypt(String password) {
		StringBuilder cipher = new StringBuilder();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update((password + SALT).getBytes());
			byte[] bs = md.digest();
			for(byte b : bs) {
				cipher.append(String.format("%02x", b));
			}
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		return cipher.substring(8, 16);
	}
	
	// 解密
	public static Boolean decrypt(String password, String cipher) {
		try {
			String translation = encrypt(password);
			return cipher.equals(translation);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return false;
	}
}
