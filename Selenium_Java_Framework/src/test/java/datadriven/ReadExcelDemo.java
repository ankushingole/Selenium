package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelDemo {

	public static void main(String[] args) throws BiffException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Anki\\Desktop\\LoginDetails.xls");
		Workbook wb = Workbook.getWorkbook(fis);
		Sheet sh = wb.getSheet("Credentials");
		int rows = sh.getRows();

		// System.out.println("No. of rows: " + rows);
		int cols = sh.getColumns();
		// System.out.println("No. of cols: " + cols);
		// String cells = sh.getCell(1, 2).getContents();
		// System.out.println(cells);

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				String data = sh.getCell(j, i).getContents();
				System.out.println(data);
			}
		}
	}

}
