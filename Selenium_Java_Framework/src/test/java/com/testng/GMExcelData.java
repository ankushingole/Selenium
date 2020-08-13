package com.testng;

import java.io.FileInputStream;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;

public class GMExcelData {
	
	public static String[][] getExcel() throws IOException, Exception{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Anki\\Desktop\\LoginDetails.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Credentials");
		int rows = sh.getRows();
		int cols = sh.getColumns();
		String[][] data = new String[rows][cols];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				data[i][j] = sh.getCell(j, i).getContents();
			}
		}
		return data;
	}

}
