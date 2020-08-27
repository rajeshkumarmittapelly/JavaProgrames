package com.javaprogramesDay14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class ArraytoMap {
	
	Map<String, String> convertArrayToMap(String[][] names){
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(names.length+", "+names[0].length);
		for (String[] strings : names) {
			map.put(strings[0], strings[1]);
			//System.out.println(strings[0]+ strings[1]);
		}
		
		return map;
		
	}
	Map<String, String> convertArrayToMap2(String[][] names){
		Map<String, String> map = Arrays.stream(names)
				.collect(HashMap<String, String>::new,
				(mp,ar)-> mp.put(ar[0],ar[1]), 
				HashMap<String, String>::putAll);
		return map;
		
	}
	Map<String, String> convertArrayToMap3(String[][] names){
		Map<String, String> map = Arrays.stream(names)
				.collect(Collectors.toMap(e->e[0],e->e[1]));
		return map;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] names ={{ "Manager","Babu"}, {"Tester", "Sam"},{ "Lead","Hari"}, {"Tester", "Naveen"}};
		ArraytoMap obj = new ArraytoMap();
		//Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : obj.convertArrayToMap2(names).entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
	}
}
