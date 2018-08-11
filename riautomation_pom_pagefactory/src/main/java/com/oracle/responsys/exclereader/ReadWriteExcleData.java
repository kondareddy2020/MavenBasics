package com.oracle.responsys.exclereader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.oracle.responsys.testbase.RITestBase;

public class ReadWriteExcleData extends RITestBase {

	public FileOutputStream fileout=null;
	public String path;
	public FileInputStream filein;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;

	public void read_excle(){

	}
	public Object[][] readExcel(String filePath,String fileName,String sheetName) throws IOException{

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
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
				obj[i-1][j]=row.getCell(j).getStringCellValue();
			}	System.out.println();
		}
		return obj;
	}

}
