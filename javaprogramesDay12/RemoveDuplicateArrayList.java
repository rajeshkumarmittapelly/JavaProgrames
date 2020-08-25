package com.javaprogramesDay12;

import java.awt.List;
import java.util.ArrayList;

public class RemoveDuplicateArrayList {
	
	ArrayList<Object> removeDuplicates(ArrayList<Object> al){
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}

			}
		}
		return al;
	}
	<T> ArrayList<T> removeDuplicates2(ArrayList<T> al){
		ArrayList<T> newList = new ArrayList<T>();
		for (T t : al) {
			if(!newList.contains(t)) {
				newList.add(t);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> al = new ArrayList<Object>();

		al.add("java");
		al.add('a');
		al.add('b');
		al.add('a');
		al.add("java");
		al.add(10.3);
		al.add('c');
		al.add(14);
		al.add("java");
		al.add(12);
		al.add(10.3);
		System.out.println("\nArray Values ");

		for (Object obj : al) {
			System.out.print(obj + ",");
		}
		
		System.out.println("\nArray Values after removing duplicates");
		RemoveDuplicateArrayList obj1 = new RemoveDuplicateArrayList();
		al = obj1.removeDuplicates2(al);
		for (Object obj2 : al) {
			System.out.print(obj2 + ",");
		}

	}
}
