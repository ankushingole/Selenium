package com.testCases;

public class TC_29_RuntimeXpathGen {
	public static String createXpath(String xpathExp, Object... args) {

		for (int i = 0; i < args.length; i++) {

			xpathExp = xpathExp.replace("{" + i + "}", (CharSequence) args[i]);
		}
		return xpathExp;

	}

	public static void main(String[] args) {
		String xpath1 = createXpath("//input[@id='{0}']", "test");
		System.out.println(xpath1);

		String xpath2 = createXpath("//input[@id='{0}' and @class='{1}']", "username", "uid");
		System.out.println(xpath2);

		String xpath3 = createXpath("//input[@id='{0}' and @class='{1}' and @type='{2}']", "pass", "test", "password");
		System.out.println(xpath3);

	}

}
