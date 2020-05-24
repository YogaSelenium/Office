package com.cync.base;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public String fetchDataExcel(String sheetName,int rowNumber,int celNumber ) throws Throwable
	{
		String cellText="";
		String filePath=".\\TestDataProvider\\Sheet1.xlsx";
	FileInputStream fileInput=new FileInputStream(filePath);
	
	
	XSSFWorkbook workBook=new XSSFWorkbook(fileInput);
	
	XSSFSheet sheet=workBook.getSheet(sheetName);
	
	
	XSSFRow row=sheet.getRow(rowNumber);
	
	XSSFCell cellNumber=row.getCell(celNumber);
	

	int lastRow=sheet.getLastRowNum();
	System.out.println("Total number of rows in the sheet is "+lastRow);
	
/*	int celNum=sheet.getRow(1).getLastCellNum();
	System.out.println("Total number of rows in the sheet is "+celNum);
	*/
/*	for(int i=1;i<=lastRow;i++)
	{
		XSSFCell cellNumber=sheet.getRow(i).getCell(i);*/
		
		if(cellNumber.getCellType()==cellNumber.CELL_TYPE_STRING)
		{
			cellText=cellNumber.getStringCellValue();
			System.out.println("its string value");
			System.out.println(cellText);
		}

		else if(cellNumber.getCellType()==cellNumber.CELL_TYPE_NUMERIC)
		{
			cellText=String.valueOf(cellNumber.getNumericCellValue());
			System.out.println("its Numeric value");
			System.out.println(cellText);

		}
		else if(cellNumber.getCellType()==cellNumber.CELL_TYPE_BLANK)
		{
			cellText= " ";
			System.out.println("its blank value");

		}
		System.out.println(cellText);
/*	
}*/
	fileInput.close();
	return cellText;
	}	
}

