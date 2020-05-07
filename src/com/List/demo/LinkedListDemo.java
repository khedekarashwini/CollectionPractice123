package com.List.demo;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Character> lin=new LinkedList<>();
		
		lin.add('A');
		lin.add('B');
		lin.add('B');
		lin.add('C');
		lin.add('D');
		System.out.println(lin);
		
		lin.addFirst('Q');
		System.out.println(lin.getFirst());
		
		System.out.println(lin);
		

	}

}
