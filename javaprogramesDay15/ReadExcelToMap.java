package com.javaprogramesDay15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelToMap {
	public Map<String, List<String>> readDataFromExcel(String excelfileName) throws IOException {
		FileInputStream fis = new FileInputStream("./data/"+excelfileName+".xlsx");
		XSSFWorkbook wbook = 
				new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Number=" +rowCount);
		
		//Map<Integer, Map<String, String>> excelFileMap = new HashMap<Integer, Map<String,String>>();
		Map<String, List<String>> excelFileMap = new HashMap<String, List<String>>();
		//Map<String, String> data = new HashMap<String, String>();
		
		DataFormatter formatter = new DataFormatter();
		for (int i = 0; i <=rowCount; i++) {
			Row row = sheet.getRow(i);
			List<String> data = new ArrayList<String>();
			//data.put(formatter.formatCellValue(row.getCell(1)), formatter.formatCellValue(row.getCell(2)));
			
			data.add(formatter.formatCellValue(row.getCell(1)));
			data.add(formatter.formatCellValue(row.getCell(2)));
			excelFileMap.put(formatter.formatCellValue(row.getCell(0)), data);
			//data.clear();
		}
		
		return excelFileMap;
	}
}
