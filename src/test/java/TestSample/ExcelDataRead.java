package TestSample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream	file = new FileInputStream("C:\\Users\\hindumathi.matike\\Desktop\\ExcelData.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(file);
		 XSSFSheet sheet=wb.getSheet("Sheet");
		 WebDriver driver = new FirefoxDriver();
		 
		 Iterator<Row> rIterator = sheet.iterator();
		 
		 while(rIterator.hasNext())
		 {
			 Row row = rIterator.next();
			 
			 Iterator<Cell> Cell = row.cellIterator();
			 
			 while(Cell.hasNext())
			 {
				 Cell cell= Cell.next();
				 System.out.println(cell.getStringCellValue());
			 }
			 System.out.println("|");
			 
			 
		 }
	}

}
