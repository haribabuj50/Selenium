package test.com.ex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteExcel {

	public static void main(String[] args) throws Exception {
				
				File src = new File("C:\\Users\\hjj446\\Desktop\\Automation\\Excel\\TestData.xlsx");
				
				FileInputStream fis = new FileInputStream(src);
				
				XSSFWorkbook wb = new XSSFWorkbook(fis);
				
				XSSFSheet sheet1 = wb.getSheetAt(0);
				
				String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
				
				System.out.println("Row 1 index 0 and Col 1is index 0 data \n"+data1);	
				
				int rowcon = sheet1.getLastRowNum();
				System.out.println(rowcon);
				FileOutputStream fos = new FileOutputStream(src);		
				sheet1.getRow(0).createCell(2).setCellValue("pass");
				sheet1.getRow(1).createCell(2).setCellValue("Fail");
				
				wb.write(fos);
				wb.close();

			}

		

	}


