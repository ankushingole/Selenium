package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchDataScript {

	@Test(dataProvider = "data")
	public void displayData(String un, String ps) {
		System.out.println(un);
		System.out.println(ps);

	}

	@DataProvider(name="data")
	public String[][] fetchData() throws Exception{
		
		return GMExcelData.getExcel();
	}

}
