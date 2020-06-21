package com.utils;

public class ExcelUtilsDemo {
	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projectpath + "/excelfiles/TestData.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getCellDataNumeric(1, 1);
		excel.getCellDataString(0, 0);

	}
}