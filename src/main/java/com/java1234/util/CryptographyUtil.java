package com.java1234.util;

import javax.xml.bind.annotation.XmlElement;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * ���ܹ���
 * @author Administrator
 *
 */
public class CryptographyUtil {
	private static final long serialVersionUID = 1L;
	/**
	 * MD5��ֵ
	 */
	@XmlElement(name = "MD5��ֵ")
	public static final String SALT_VALUE = "iamsalt_*()&*^%!@#^2F_k4$DFGIYU:[])_";

	/**
	 * Md5����
	 * @param str
	 * @param salt
	 * @return
	 */
	public static String md5(String str,String salt){
		return new Md5Hash(str,salt).toString();
	}
	
	public static void main(String[] args) {
		String password="";
		System.out.println("Md5���ܣ�"+CryptographyUtil.md5(password, SALT_VALUE));
	}
}
