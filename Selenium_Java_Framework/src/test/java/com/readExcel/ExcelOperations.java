package com.readExcel;

import com.excelUtility.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("./excelfiles/TestData.xlsx");

		//add new sheet
		if (!reader.isSheetExist("LoginData")) {

			reader.addSheet("LoginData");
		}

		// 1.add new column to sheet
//		reader.addColumn("LoginData", "username");
//		reader.addColumn("LoginData", "password");

		// 2.add new data to column
//		reader.setCellData("LoginData", "username", 2, "admin");
//		reader.setCellData("LoginData", "username", 3, "Admin123");
//		reader.setCellData("LoginData", "username", 4, "Admin");
//		reader.setCellData("LoginData", "password", 2, "admin");
//		reader.setCellData("LoginData", "password", 3, "admin11");
//		reader.setCellData("LoginData", "password", 4, "admin123");
		
		//reader.addColumn("LoginData", "status");
		reader.removeColumn("LoginData", 2);
	}
}
