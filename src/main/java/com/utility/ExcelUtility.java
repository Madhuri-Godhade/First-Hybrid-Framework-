package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelUtility {

	FileInputStream fis=null;
	Workbook wb=null;
	Sheet sh =null;
	
	public String getCelData(String filepath,String name,int row,int col)
	{
		DataFormatter df=new DataFormatter();
		try {
			fis=new FileInputStream(filepath);
			wb=WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();                        
		}
		
		sh=(Sheet) wb.getSheet(name);
		Cell c=sh.getRow(row).getCell(col);
		
		return df.formatCellValue(c);
	}
	
	@Test
	public void test()
	{
		String xlspath=System.getProperty("user.dir")+"/src/test/resources/Test.xls";
		String poipath=System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";
		System.out.println(getCelData(xlspath, "login", 0, 0));
		System.out.println(getCelData(poipath, "login", 0, 0));
	}
	
}
