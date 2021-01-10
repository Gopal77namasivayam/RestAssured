package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	
	
	// constructor 
	
		static XSSFWorkbook workbook ;
		static XSSFSheet sheet;
		
	   public ExcelUtils(String excelpath , String sheetName) {
		   
		   try {
		   
		    workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetName);

	   }
		   catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();

			}





	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// calling this class in another class ExcelUtilsTest

	/* // main method is created to test reading of excel data 
	public static void main(String[] args) {

		getRowCount();
		getCellData();

	}*/

	// method to work with excel 

	public static void getRowCount() {

			/* other way of getting path of test data folder

			   String projctDirctry = System.getProperty("user.dir"); // //
			  System.out.println(projctDirctry);

			  String excelpath = projctDirctry+"/TestData/LocalUsersTestData.xlsx";

			// Relative path of test data folder location 

			String excelpath = "./TestData/LocalUsersTestData.xlsx";


			// Working with Excel sheet

			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet = workbook.getSheet("Sheet1"); */

			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println( "No. of rows with data is : "+rowCount);

	}

	// Fetch data from excel sheet 

	public static void getCellData(int rowNum , int colNum) {

		/*	// Relative path of test data folder location 

			String excelpath = "./TestData/LocalUsersTestData.xlsx";


			// Working with Excel sheet

			XSSFWorkbook workbook = new XSSFWorkbook(excelpath);
			XSSFSheet sheet = workbook.getSheet("Sheet1");

			String cellValue = 	sheet.getRow(1).getCell(0).getStringCellValue();
			System.out.println(cellValue);

			// Fetch cell value using DataFormatter

			DataFormatter formatter = new DataFormatter();

			Object value = formatter.formatCellValue(sheet.getRow(1).getCell(1));

			System.out.println(value); */
		

			// Fetch cell value using DataFormatter

			DataFormatter formater = new DataFormatter();

			Object value1 = formater.formatCellValue(sheet.getRow(rowNum).getCell(colNum));

			System.out.println(value1);
			

	}

	}
