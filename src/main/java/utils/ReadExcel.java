package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends base.ProjectSpecificMethods{

	public String[][] readExcel(String fileName) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("./excel file/"+fileName+".xlsx"); 
		XSSFSheet wsheet = wbook.getSheetAt(0);
		int rows = wsheet.getLastRowNum();
		System.out.println("No of Rows: "+rows);
		short cols = wsheet.getRow(0).getLastCellNum();
		System.out.println("No of Columns: "+cols);
		String[][] data = new String[rows][cols];
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = wsheet.getRow(i);
			for (int j = 0; j < cols; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				data[i-1][j]=value;
				//System.out.println(value+" ");
			}
			//System.out.println();
		}
		return data;
	}
}
