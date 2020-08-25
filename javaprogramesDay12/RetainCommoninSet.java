package com.javaprogramesDay12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class RetainCommoninSet {
	
	void retainCommoninList1() {
		HashSet<Object> set = new HashSet<Object>();
		set.add("java");
		set.add('a');
		set.add('b');
		set.add('a');
		set.add("java");
		set.add(10.3);
		set.add('c');
		set.add(14);
		set.add("java");
		set.add(12);
		set.add(10.3);
		HashSet<Object> set2 = new HashSet<Object>();
		set2.add("java2");
		set2.add('d');
		set2.add('q');
		set2.add('a');
		set2.add("java");
		set2.add(10.34);
		set2.add('c');
		set2.add(14);
		set2.add("java");
		set2.add(18);
		set2.add(10.37);
		System.out.println("Elements in Set1: "+set);
		System.out.println("Elements in Set2: "+set2);
		set.retainAll(set2);
		System.out.println("Elements in Set1 after comparing: "+set);
		
	}
	void retainCommoninList2() {
		Set<Object> set = new HashSet<Object>();
		set.add("java");
		set.add('a');
		set.add('b');
		set.add('a');
		set.add("java");
		set.add(10.3);
		set.add('c');
		set.add(14);
		set.add("java");
		set.add(12);
		set.add(10.3);
		Set<Object> set2 = new HashSet<Object>();
		set2.add("java2");
		set2.add('d');
		set2.add('q');
		set2.add('a');
		set2.add("java");
		set2.add(10.34);
		set2.add('c');
		set2.add(14);
		set2.add("java");
		set2.add(18);
		set2.add(10.37);
		System.out.println("Elements in Set1: "+set);
		System.out.println("Elements in Set2: "+set2);
		
		
		  Set<Object> set3 = new HashSet<Object>(); for (Object object : set) {
		  if(set2.contains(object)) { set3.add(object); } }
		  System.out.println("Elements in Set1 after comparing: "+set3);
		 
		/*
		 * for (Iterator iterator = set.iterator(); iterator.hasNext();) { Object
		 * object1 = (Object) iterator.next(); for (Iterator iterator2 =
		 * set2.iterator(); iterator2.hasNext();) { Object object2 = (Object)
		 * iterator2.next(); if(!object1.equals(object2)) { iterator.remove(); }
		 * 
		 * }
		 * 
		 * } System.out.println("Elements in Set1 after comparing: "+set);
		 */
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RetainCommoninSet obj = new RetainCommoninSet();
		obj.retainCommoninList1();
		obj.retainCommoninList2();


		
		
		
		
	}
}
