package com.review11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {
	public static void main(String[] args) throws IOException {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);

		String filePath = projectPath + "/extra/Excel.xlsx";
		System.out.println(filePath);

		FileInputStream fileIS = new FileInputStream(filePath);

		// get the whole file
		Workbook book = new XSSFWorkbook(fileIS);

		// get the sheet from the file
		Sheet sheet = book.getSheet("Sheet1");

		// get the number of rows in the current sheet, the last one that has data.
		int rows = sheet.getPhysicalNumberOfRows();

		// get one row from the current sheet
		Row row0 = sheet.getRow(0);

		// get the number of cells in the current row
		int cells = row0.getLastCellNum();

		// Let's iterate the cells of the header/row0
		for (int i = 0; i < cells; i++) {
			String data = row0.getCell(i).toString();
			System.out.print(data + " ");
		}
		System.out.println();
		
		
		System.out.println("-----------------------------");
		//Let's iterate all the data rows. (except header)
		for (int row = 1; row < rows; row++) {
			//for every row, I will iterate the cells
			
			//Let's get the current row
			Row curRow = sheet.getRow(row);
			
			//How many cells there are in the current row
			int curCells = curRow.getLastCellNum();
			
			for (int cell = 0; cell < curCells; cell++) {
//				Cell cellData = curRow.getCell(cell);
//				String cellStringData = cellData.toString();
//				System.out.print(cellStringData + " ");
				System.out.print(curRow.getCell(cell).toString() + " ");	
			}
			System.out.println();
		}

	}
}
