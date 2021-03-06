package com.hjzgg.common.util.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 邮箱校验
 *
 */
public class EmailValidator {

	/**
	 * 验证输入的邮箱格式是否符合
	 * 
	 * @param email
	 * @return 是否合法
	 */
	public static boolean isValidEmail(String email) {
		boolean tag = true;
		final String pattern1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
		final Pattern pattern = Pattern.compile(pattern1);
		final Matcher mat = pattern.matcher(email);
		if (!mat.find()) {
			tag = false;
		}
		return tag;
	}

	public static boolean getEmail(String line) {
		Pattern p = Pattern.compile("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*");
		Matcher m = p.matcher(line);
		return m.find();
	}

	public static void main(String[] args) {
		System.out.println(EmailValidator.isValidEmail("ranbaobaosheng@sankai.com"));
		// System.out.println(EmailValidator.getEmail("ranbaosheng@ca.aaaa"));

	}
}
