package com.review11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMap {
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

		// Let's suppose that we know that there same number of cells in every row

		Map<String, String> maryMap = new LinkedHashMap<>();
		// Let's create a map for Mary, which is row 2
		for (int i = 0; i < cells; i++) {
			String headerCell = sheet.getRow(0).getCell(i).toString();
			String maryCell = sheet.getRow(2).getCell(i).toString();
			maryMap.put(headerCell, maryCell);
		}
		System.out.println(maryMap);

		// I will have three maps
		// I will store the three maps into a List
		List<Map<String, String>> mapList = new ArrayList<>();

		// Iterating data rows, not header
		for (int i = 1; i < rows; i++) {
			//For every data row I will create a map
			Map<String, String> map = new LinkedHashMap<>();
			
			// Iterating cells, to fill the map
			for (int j = 0; j < cells; j++) {
				map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i).getCell(j).toString());
			}
			
			//After I filled the map, I am adding it into the list
			mapList.add(map);
		}
		
		System.out.println(mapList);
		
		//HW for Jamoliddin AND Ali Tarlaci
		//iterate the list of maps
		
		//print the map
		
		//Then get the keys in a Set from the map 
		//and iterate the key and print in this format: 
		//key -> value
		
	}
}
