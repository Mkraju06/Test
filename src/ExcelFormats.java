/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormats {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExcelFormats objExcelFile = new ExcelFormats();

		
		String filePath = System.getProperty("user.dir");
		
		System.out.println(filePath);
		
		objExcelFile.readExcel(filePath, "Test.xlsx", "Sheet1");
		
	}

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {
		
		//Create an object of File class to open excel file
		//C:\\Users\\sasik\\Downloads\\Test.xlsx
		File file = new File(filePath+"\\"+fileName);
		
		//Create an object of FileInputStream class to read Excel
		
		FileInputStream inputstream = new FileInputStream(file);
		
		Workbook workbook=null;
		
		//Find the file extension by splitting the file name in substring and getting only extension name
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		
		//Checking the extension if file is xlsx
		if(fileExtensionName.equals(".xslx")) {
			
			workbook = new XSSFWorkbook(inputstream);
			
					
		}
		else if(fileExtensionName.equals(".xls")) {
			
			workbook = new HSSFWorkbook(inputstream);

			
		}
		
		Sheet sheet = workbook.getSheet(sheetName);
		//Lastrownum - firstrownum
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		for(int i=0; i< rowCount+1; i++)
		{
			Row row = sheet.getRow(i);
			
			for(int j=0; j<row.getLastCellNum(); j++) {
				
				System.out.print(row.getCell(j).getStringCellValue()+"-");
			}
			System.out.println();
		}
		
	}
	
}*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFormats {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ExcelFormats obj = new ExcelFormats();
		
		String filePath = System.getProperty("user.dir")+"\\src";
		String [] data = {"Mani", "KKD", "India"};
		
		System.out.println(filePath);
		
		obj.writeExcel(filePath, "Test.xlsx", "Sheet1", data);
		
	}
	
	
	public void writeExcel (String filePath, String fileName, String sheetName, String[] data) throws IOException {
		
		
		File file = new File(filePath+"\\"+fileName);
		
		FileInputStream fs = new FileInputStream(file);
		
		
		
		Workbook wbk =null;
		
		wbk = new XSSFWorkbook(fs);
		
		Sheet sheet = wbk.getSheet(sheetName);
		
		
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		Row row= sheet.getRow(0);
		
		Row newRow = sheet.createRow(rowCount+1);
		
		for(int j=0; j< row.getLastCellNum(); j++) {
			
			Cell cell = newRow.createCell(j);
			
			cell.setCellValue(data[j]);
			
		}
		
		fs.close();
		
		FileOutputStream output = new FileOutputStream(file);
		
		
		wbk.write(output);
		
		output.close();
		
		
	}

}