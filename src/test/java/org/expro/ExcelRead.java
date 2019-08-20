package org.expro;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static String getData(int rowno, int coulumns) throws IOException{
		File f = new File("C:\\Users\\Govardhan\\Desktop\\task.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(stream);
		Sheet s= book.getSheet("task.xlsx");
		Row r = s.getRow(2);
		Cell c =r.getCell(1);
		System.out.println(c);
		return null;
		
		
	}

}
