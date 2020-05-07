package com.cursors.demo;

import java.util.LinkedList;
import java.util.ListIterator;

class Animal
{
   int id;
   String name;
public Animal(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Animal [id=" + id + ", name=" + name + "]";
}
   
   


}
public class ListIteratorCursor {

	public static void main(String[] args) {
		LinkedList<Animal> l1=new LinkedList<>();
	Animal a=new Animal(1, "Dog");
	Animal b=new Animal(1, "Cat");
	Animal c=new Animal(2, "Tiger");
	Animal d=new Animal(3, "Hourse");
	Animal e=new Animal(4, "Deer");
	
	l1.add(a);
	l1.add(b);
	l1.add(c);
	l1.add(d);
	l1.add(e);
	
	ListIterator<Animal> ltr=l1.listIterator();
	
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
	System.out.println("Reverse LinkedList......");
	while(ltr.hasPrevious())
	{
		System.out.println(ltr.previous());
	}

	}

}
