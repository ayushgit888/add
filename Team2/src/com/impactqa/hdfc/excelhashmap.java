package com.impactqa.hdfc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelhashmap {
	String key;
	String value;

	public static void main(String[] args) throws Exception {
		// System.out.println("asdf");
		XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(new File("D:\\data1.xlsx")));
		// System.out.println(workbook.getAllNames());
		XSSFSheet s = workbook.getSheetAt(0);
		// System.out.println("aasdf");
		int lastrow = s.getLastRowNum();
		int colnu = s.getRow(0).getLastCellNum();
		ArrayList<LinkedHashMap<String, String>> a = new ArrayList<LinkedHashMap<String, String>>();
	
		Cell heading = null;
		Cell valueCell = null;
		for (int i = 1; i <= lastrow; i++) {
			LinkedHashMap<String, String> m = new LinkedHashMap<String, String>();
		
			for (int j = 0; j < colnu; j++) {
				String key = readCell(s.getRow(0).getCell(j));
				String value = readCell(s.getRow(i).getCell(j));
				m.put(key, value);
			}
			a.add(m);
			
		}
		

		Iterator it = a.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static String readCell(Cell cell) {
		String data = null;
		try {
			data = String.valueOf(cell.getNumericCellValue());
		} catch (Exception e) {
			try {
				data = cell.getStringCellValue();
			} catch (Exception e2) {
			}

		}
		return data;
	}

}
