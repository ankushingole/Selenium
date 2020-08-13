package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {

	@Test()
	public void verifyTest() {

		String s1 = "SSP";
		String s2 = "SSP";
		Assert.assertEquals(s1, s2);

	}

}
