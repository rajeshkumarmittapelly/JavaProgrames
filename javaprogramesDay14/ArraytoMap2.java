package com.javaprogramesDay14;

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

public class ArraytoMap2 {
	Map<String, String> convertArrayToMap(String[] str) {
		Map<String, String> map = new HashMap<String, String>();

		for (String strings : str) {
			map.put(strings, String.valueOf(strings.charAt(0)));
			// System.out.println(strings[0]+ strings[1]);
		}

		return map;

	}

	Map<String, String> convertArrayToMap2(String[] names) {
		Map<String, String> map = Arrays.stream(names).collect(HashMap<String, String>::new,
				(mp, ar) -> mp.put(ar, String.valueOf(ar.charAt(0))), HashMap<String, String>::putAll);
		return map;

	}

	Map<String, String> convertArrayToMap3(String[] names) {
		Map<String, String> map = Arrays.stream(names)
				.collect(Collectors.toMap(e -> e, e -> String.valueOf(e.charAt(0))));
		return map;

	}

	public static void main(String[] args) {

		String str = "Chennai is the capital of the state of Tamil Nadu";
		String str1[] = str.split("\\s");
		ArraytoMap2 obj = new ArraytoMap2();
		// Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : obj.convertArrayToMap(str1).entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		System.out.println("Using Second Method");
		for (Entry<String, String> entry : obj.convertArrayToMap2(str1).entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}
		System.out.println("Using Third Method");

		for (Entry<String, String> entry : obj.convertArrayToMap3(str1).entrySet()) {
			System.out.println(entry.getKey() + "-->" + entry.getValue());
		}

	}
}
