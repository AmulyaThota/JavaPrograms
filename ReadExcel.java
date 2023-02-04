package PracticeSeleniumJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
	
		// Ihave placed my excel file on "C:\Users\gadda\OneDrive\Desktop\Timesheet.xlsx"
		
		FileInputStream fis = new FileInputStream("C:\\Users\\gadda\\OneDrive\\Desktop\\Timesheet.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//added test data in cell A1 as CRISIL-Employee-ID
        //cee A1 = row 0 and column 0
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		
		
		

	}

}
 