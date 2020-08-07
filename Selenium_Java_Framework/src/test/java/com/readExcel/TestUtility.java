package com.readExcel;

import java.util.ArrayList;

import com.excelUtility.Xls_Reader;

public class TestUtility {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		reader = new Xls_Reader(".\\excelfiles\\TestData.xlsx");

		for (int row = 2; row <= reader.getRowCount("RegData"); row++) {

			String firstName = reader.getCellData("RegData", "firstName", row);

			String surname = reader.getCellData("RegData", "surname", row);

			String email = reader.getCellData("RegData", "email", row);

			String password = reader.getCellData("RegData", "password", row);

			Object[] ob = { firstName, surname, email, password };
			myData.add(ob);

		}
		return myData;

	}
}
