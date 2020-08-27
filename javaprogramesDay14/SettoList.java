package com.javaprogramesDay14;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SettoList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		list.add("Chennai");
		list.add("Kanyakumari");
		list.add("Coimbatore");
		list.add("Karur");
		list.add("Erode");
		list.add("Dindigul");
		list.add("Salem");
		list.add("Tiruppur");
		map.put("Chennai", 1);
		map.put("Tiruppur", 1);
		map.put("Namakkal", 1);
		map.put("Tenkasi", 1);
		map.put("Coimbatore", 1);
		map.put("Ariyalur", 1);
		map.put("Erode", 1);
		for(Entry<String, Integer> entry : map.entrySet()) {
			String keyValue= entry.getKey();
			int inc =1;
			for (int i = 0; i < list.size(); i++) {
				if(list.get(i).equalsIgnoreCase(keyValue)) {
					inc++;
					System.out.println(keyValue + inc);
					map.replace(keyValue, inc);
				}
			}
			
		}
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
	}
}
