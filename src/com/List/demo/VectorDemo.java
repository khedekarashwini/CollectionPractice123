package com.List.demo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> v=new Vector<>();
		
		v.add(100);
		
		v.add(90);
		
		v.add(23);
		
		v.add(500);
		
		
		System.out.println(v);
		System.out.println(v.get(2));
		

	}

}
