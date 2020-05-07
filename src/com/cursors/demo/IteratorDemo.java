package com.cursors.demo;

import java.util.ArrayList;
import java.util.Iterator;

class Bank
{
 int Bid;
 String name;
public Bank(int bid, String name) {
	super();
	Bid = bid;
	this.name = name;
}

@Override
public String toString() {
	return "Bank [Bid=" + Bid + ", name=" + name + "]";
}
 
 



}
public class IteratorDemo {

	public static void main(String[] args) {
		
ArrayList<Bank> hs=new ArrayList<>();
		
        Bank c1=new Bank(101, "HSBC");
        Bank c2=new Bank(101, "SBI");
		Bank c3=new Bank(102, "BOI");
		Bank c4=new Bank(103, "ICICI");
		Bank c5=new Bank(104, "BOM");
		
		
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		hs.add(c4);
		hs.add(c5);
		
		Iterator<Bank> itr=hs.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
	}

}
