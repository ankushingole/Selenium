package com.xpathPractice;

public class XpathGen {

	public static String createXpath(String xpathExp, Object... args) {

		for (int i = 0; i < args.length; i++) {
			xpathExp = xpathExp.replace("{" + i + "}", (CharSequence) args[i]);

		}
		return xpathExp;
	}

	public static void main(String[] args) {
		String xpath1 = createXpath("//input[@id='{0}']", "test");
		System.out.println(xpath1);

		String xpath2 = createXpath("//input[@id='{0}' and @name='{1}']", "email", "username");
		System.out.println(xpath2);

	}

}
