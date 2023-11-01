import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;

public class DataExcel {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
 
		//invoking the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\sasik\\Downloads\\Test.xlsx");
		
		//Wrokbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		
		//Sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		//Row
		Row row = sheet.getRow(0);
		
		//Cell
		Cell cell = row.getCell(0);
		
		System.out.println(sheet.getRow(1).getCell(0));
		System.out.println(sheet.getRow(1).getCell(1));
		System.out.println(sheet.getRow(2).getCell(0));
		System.out.println(sheet.getRow(2).getCell(1));
	}



}
