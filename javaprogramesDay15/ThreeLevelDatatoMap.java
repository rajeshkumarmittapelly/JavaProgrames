package com.javaprogramesDay15;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeLevelDatatoMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list1 = new ArrayList<Object>();
		list1.add("S.NO");
		list1.add("Resource Name");
		list1.add("Salary");
		List<Object> list2 = new ArrayList<Object>();
		list2.add("01");
		list2.add("Bala");
		list2.add(100000);
		List<Object> list3 = new ArrayList<Object>();
		list3.add("02");
		list3.add("Ganesh");
		list3.add(100000);
		List<Object> list4 = new ArrayList<Object>();
		list4.add("03");
		list4.add("Krish");
		list4.add(100000);
		Map<Integer, List<Object>> map = new HashMap<>();
		map.put(01, list1);
		map.put(02, list2);
		map.put(03, list3);
		map.put(04, list4);
		WriteMapToExcel obj = new WriteMapToExcel();
		ReadExcelToMap read = new ReadExcelToMap();
		try {
			obj.writeDatatoExcel("Input", map);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try { System.out.println(obj.readDataFromExcel("Input")); } 
		  catch (IOException e) { // TODO Auto-generated catch block
			  e.printStackTrace(); }
		  System.out.println("IDNumber"+"-->"+"Employee Name"+"-----"+ "Salary");*/
		
		  try { 
			  for (Entry<String, List<String>> entry : read.readDataFromExcel("Input").entrySet()) {
				  String key = entry.getKey();
				  System.out.print(key+"-------->");
				  for (String object : entry.getValue()) {
					System.out.print(object+"------");
				}
				  System.out.println();
		  
		  } } catch (IOException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); }
		 

	}
}
