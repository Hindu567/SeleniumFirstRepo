package ArtOfTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		
		 File src=new File("C:\\Users\\hindumathi.matike\\Desktop\\ExcelData.xlsx");
		 
	     FileInputStream inps = new FileInputStream(src);
	     
	     XSSFWorkbook  workbook = new XSSFWorkbook(inps);
	     
	     XSSFSheet sheet = workbook.getSheet("Sheet1");
	     
	    // XSSFRow row = sheet.getRow(1);
	     int row = sheet.getLastRowNum();
	     int col= sheet.getRow(1).getLastCellNum();
	    
	    for(int i=1; i<=10; i++)
	    	
	    {
	    	XSSFCell cl= sheet.getRow(i).getCell(0);
	    	
	    	 if (cl.getCellType() == CellType.STRING)
	            {
	    		 	String url = cl.getStringCellValue();
	    		 //	cl.getDateCellValue()
	    		 //	cl.getNumericCellValue()
	                driver.get(url);
	            }
	    	 try {
				Thread.sleep(1000);
				driver.close();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	
	    }
	    

	}

}
