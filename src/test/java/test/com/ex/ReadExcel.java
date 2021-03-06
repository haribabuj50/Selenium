package test.com.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.hssf.model.Workbook;
import org.apache.poi.hssf.record.formula.functions.Row;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Create a object of ReadExcel class		 
	    ReadExcel rf = new ReadExcel();
	 
	    //Prepare the path of excel file	 
	//    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
	    String filePath = "C:\\Users\\hjj446\\Desktop\\Automation\\Excel";
	 
	    //Call read file method of the class to read data	 
	    //objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelGuru99Demo");
	    rf.readExcelMethod(filePath, "EmployeData1.xls", "jana1");
	 
	    }

	void readExcelMethod(String filePath, String fileName, String sheetName) throws IOException {
		
		 //Create a object of File class to open xlsx file		 
        File file =    new File(filePath+"\\"+fileName);
        
      //Create an object of FileInputStream class to read excel file        
        FileInputStream inputStream = new FileInputStream(file);
        
      //If it is xlsx file then create object of XSSFWorkbook class        
        HSSFWorkbook wb = new HSSFWorkbook(inputStream);
        
        //Read sheet inside the workbook by its name        
        HSSFSheet sheet = wb.getSheet(sheetName);
                       
        //Get the current count of rows in excel file        
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        
      //Get the first row from the sheet        
        HSSFRow row = sheet.getRow(0);
     
        //Create a new row and append it at last of sheet     
        HSSFRow newRow = sheet.createRow(rowCount+1);
        
      //Create a loop over all the rows of excel file to read it        
        for (int i = 0; i < rowCount+1; i++) {
     
            HSSFRow row1 = sheet.getRow(i);
     
            //Create a loop to print cell values in a row     
            for (int j = 0; j < row1.getLastCellNum(); j++) {
     
                //Print excel data in console     
                System.out.print(row1.getCell(j));
     
            }
     
            System.out.println();
     
        }
     
        //Close input stream     
        inputStream.close();
     
                
	}
}
	 
