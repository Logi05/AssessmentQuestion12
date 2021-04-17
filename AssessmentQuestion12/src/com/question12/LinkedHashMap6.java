package com.question12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashMap6 {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
		map.put(1, "Logi");
		map.put(3, "Gayu");
		map.put(4, "Priya");
		map.put(2, "Anu");

		Set s=map.entrySet();
		Iterator it=s.iterator();
		System.out.println("Key=Value");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
