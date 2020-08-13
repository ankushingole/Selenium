package datadriven;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GMAnyExcelDemo {

	public static void main(String[] args) throws Exception, IOException {

		Workbook wb = WorkbookFactory.create(new File("C:\\Users\\Anki\\Desktop\\LoginDetails.xls"));
		Sheet sh = wb.getSheetAt(0);

		DataFormatter df = new DataFormatter();

		// sheet has rows
		for (Row row : sh)

			// row has cells
			for (Cell cell : row) {
				String ss = df.formatCellValue(cell);
				System.out.println(ss);
			}
   }

}
