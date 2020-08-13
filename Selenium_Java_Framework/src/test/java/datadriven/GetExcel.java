package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcel {

	public static String getSheet(String path) throws Exception {

		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Credentials");
		String rows = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(rows);
		String co = sheet.getRow(1).getCell(0).getStringCellValue();


		wb.close();

		return path;

	}
} 
