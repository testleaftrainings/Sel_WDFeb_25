package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataLibrary {

	public static String[][] excelIntegration(String workBookName) throws IOException {
		
				XSSFWorkbook wb = new XSSFWorkbook("./data/"+workBookName+".xlsx");
				XSSFSheet sheet = wb.getSheet("Sheet1");
				XSSFRow row = sheet.getRow(1);		
				int lastRowNum = sheet.getLastRowNum();
				short lastCellNum = row.getLastCellNum();
				//declared  2D array here 
				String data[][] = new String[lastRowNum][lastCellNum];
				System.out.println("total number of row is : " + lastRowNum);
				System.out.println("total number of cell is : " + lastCellNum);
				for (int i = 1; i <= lastRowNum; i++) {
					for (int j = 0; j <lastCellNum; j++) {
						String extractedDataFromExcel = sheet.getRow(i).getCell(j).getStringCellValue();
						//Initialized the value to the 2d array
						data[i-1][j]=extractedDataFromExcel;
						System.out.println(data[i-1][j]);						
					}					
				}
				wb.close();
				// returned the 2D array here
				return data;
	}
}
