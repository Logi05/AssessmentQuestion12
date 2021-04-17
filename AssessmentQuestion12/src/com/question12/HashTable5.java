package com.question12;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashTable5 {
	public static void main(String[] args) {
		Map<Integer,String> table=new Hashtable<Integer,String>();
		table.put(1, "First");
		table.put(2, "Second");
		table.put(3, "Third");
		System.out.println(table);	
		
		table.forEach(
				(k,v)->System.out.println("Key: "+k+" & Value: "+v));		
	}
}
