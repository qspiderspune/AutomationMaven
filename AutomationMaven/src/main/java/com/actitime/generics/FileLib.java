package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * 
 * @author sandeep
 *
 */
public class FileLib {
	/**
	 * to read the data from property
	 * @param key
	 * @return value
	 * @throws Exception
	 */
public String getPropertyData(String key) throws Exception {
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
/**
 * to read the data from excel file
 * @param sheetname
 * @param rownum
 * @param cellnum
 * @return Exceldata
 * @throws Exception
 */
public String getExcelData(String sheetname,int rownum,int cellnum) throws Exception {
	FileInputStream fis=new FileInputStream("./data/input.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
	return data;
}
}
