package datadriven;

import org.testng.annotations.Test;

public class TC_01_ReadExcelData {
@Test
	public void readData() throws Exception {

		GetExcel.getSheet("./Excel TestData/LoginDetails.xlsx");
		
	}

} 
