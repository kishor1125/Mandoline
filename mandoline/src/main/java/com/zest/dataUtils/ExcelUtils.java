package com.zest.dataUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public XSSFWorkbook workBook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public FileInputStream fis;
	
	public ExcelUtils(){
		try {
			fis=new FileInputStream("/Users/kishorerapaka/Documents/Work/Data.numbers");
			workBook=new XSSFWorkbook(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void getData(){
		sheet =workBook.getSheet("mySheet");
		XSSFRow zeroRow=sheet.getRow(0);
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			row=sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
	}
	
	public void createExcel()throws Exception {
	      //Create Blank workbook
	      XSSFWorkbook workbook = new XSSFWorkbook(); 

	      //Create file system using specific name
	      FileOutputStream out = new FileOutputStream(new File("createworkbook.xlsx"));

	      //write operation workbook using file out object 
	      workbook.write(out);
	      out.close();
	      System.out.println("createworkbook.xlsx written successfully");
	   }
	
	public static void main(String ar[]) throws Exception{
		ExcelUtils e=new ExcelUtils();
		//e.createExcel();;
		e.getData();
	}
	
	
}
