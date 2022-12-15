package poiReadWriteExcelfile;

import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;

public class poiWriteExcelfile {
	
	@Test
	public void writeExcelfile() throws IOException
	{	
		File file = new File("C:\\Users\\reach\\eclipse-workspace\\SeleTestNG\\ExcelFiles\\New Microsoft Excel Worksheet.xlsx");
		FileOutputStream inputStream  = new FileOutputStream(file);
        
			HSSFWorkbook wb=new HSSFWorkbook();		
	        //Creating a Sheet object using the sheet Name
	        HSSFSheet sheet=wb.getSheet("STUDENT_DATA");
	        
	        //Create a row object to retrieve row at index 1
	        HSSFRow row2=sheet.getRow(1);
	        
	        //Create a cell object to retreive cell at index 5
	        HSSFCell cell=row2.getCell(5);
	        
	        //Get the address in a variable
	        String address= cell.getStringCellValue();
	        
	        //Printing the address
	        System.out.println("Address is :"+ address);
		
		
		


	}

}
