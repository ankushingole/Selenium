package datadriven;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class GMReadExcel {
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sh;

	public static String[][] getExcel() throws Exception {
		fis = new FileInputStream("./Excel TestData/LoginDetails.xls");
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet("Credentials");
		int rows = sh.getRows();
		int cols = sh.getColumns();
		String[][] data = new String[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				data[i][j] = sh.getCell(j, i).getContents();
			}
		}
		return data;
	}
}
