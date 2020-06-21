package com.utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static String projectpath;

	// Constructor
	public ExcelUtils(String excelPath, String sheetName) {

		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet("Sheet1");

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	// Main Method
	public static void main(String[] args) {
		// getRowCount();
		getCellDataString(0, 0);
		getCellDataNumeric(1, 1);
	}

	// 1. getRowCount Method
	public static int getRowCount() {
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of rows is:" + rowCount);
		return rowCount;

	}

	// 4. getColummCount Method

	public static int getColCount() {

		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No. of columms is:"+colCount);
		return colCount;
	}

	// 2. getCellDataString Method
	public static String getCellDataString(int rowNum, int colNum) {

		String cellDataString = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println(cellDataString);
		return cellDataString;

	}

	// 3. getCellDataNumeric Method
	public static void getCellDataNumeric(int rowNum, int colNum) {

		double cellValueNum = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(cellValueNum);

	}

}
