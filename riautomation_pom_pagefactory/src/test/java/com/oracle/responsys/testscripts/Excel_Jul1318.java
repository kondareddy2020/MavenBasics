package com.oracle.responsys.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Jul1318 {

	public static Object[][] readExcel(String filePath,String fileName,String sheetName) throws IOException{
		
		File file =    new File(filePath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);

		Workbook krWorkbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if(fileExtensionName.equals(".xlsx")){
			krWorkbook = new XSSFWorkbook(inputStream);
		}	else if(fileExtensionName.equals(".xls")){
			krWorkbook = new HSSFWorkbook(inputStream);
		}
		Sheet krSheet = krWorkbook.getSheet(sheetName);
		int rowCount = krSheet.getLastRowNum()-krSheet.getFirstRowNum();
		
		Object[][] obj=new Object[rowCount][3];
		for (int i = 1; i < rowCount+1; i++) {
			Row row = krSheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
//				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				obj[i-1][j]=row.getCell(j).getStringCellValue();
			}	
//			System.out.println();
		}
		return obj;
	}
	public static String ReadPerticularCellData(int row,int col) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\com\\oracle\\responsys\\data";
		Object[][] readExcel = readExcel(filePath,"RILoginData.xlsx","RILogin");
		return readExcel[row][col].toString();
	}
	public static void main(String...strings) throws IOException{
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\com\\oracle\\responsys\\data";
		Object[][] readExcel = Excel_Jul1318.readExcel(filePath,"RILoginData.xlsx","RILogin");
		//Read all data from Excel Sheet
		for(int i=0;i<readExcel.length;i++)
		{
			for(int j=0;j<readExcel[0].length;j++) {
				System.out.println(readExcel[i][j]);
			}
		}
		System.out.println("**********************");
		//Read Particular cell data
		
		System.out.println(Excel_Jul1318.ReadPerticularCellData(1,1));
		System.out.println(Excel_Jul1318.ReadPerticularCellData(1,2));
		System.out.println(Excel_Jul1318.ReadPerticularCellData(2,1));
		System.out.println(Excel_Jul1318.ReadPerticularCellData(2,2));
		System.out.println(Excel_Jul1318.ReadPerticularCellData(3,1));
		System.out.println(Excel_Jul1318.ReadPerticularCellData(3,2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
