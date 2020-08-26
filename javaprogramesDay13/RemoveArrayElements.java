package com.javaprogramesDay13;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveArrayElements {
	void removeElemnts(ArrayList<String> list) {
		System.out.println("Array List values");

		for (String str : list) {
			System.out.print(str + ",");
		}
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			// System.out.println(list.get(i).toLowerCase().charAt(0));
			if (list.get(i).toLowerCase().charAt(0) == 's' && list.get(i).length()>5) {
				list.remove(i);
				i--;
			}
		}
		for (String str : list) {
			System.out.print(str + ",");
		}

	}
	void removeElemnts2(ArrayList<String> list) {
		System.out.println("Array List values");

		for (String str : list) {
			System.out.print(str + ",");
		}
		System.out.println();
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.toLowerCase().charAt(0)=='s' && str.length()>5) {
				itr.remove();
			}
		}

		for (String str : list) {
			System.out.print(str + ",");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("Shyam");
		list.add("Saishivakumar");
		list.add("Advithkrishna");
		list.add("Sahasra");
		list.add("Ramakrishna");
		RemoveArrayElements obj = new RemoveArrayElements();
		obj.removeElemnts(list);

	}
}
