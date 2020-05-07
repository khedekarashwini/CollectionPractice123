package com.set.demo;

import java.util.HashSet;
import java.util.Iterator;

class Collage
{
	int Rid;
	String name;
	public Collage(int rid, String name) {
		super();
		Rid = rid;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Rid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collage other = (Collage) obj;
		if (Rid != other.Rid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Collage [Rid=" + Rid + ", name=" + name + "]";
	}
	
	
}
public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Collage> hs=new HashSet<>();
		
		Collage c1=new Collage(101, "Abc");
		Collage c2=new Collage(101, "Abc");
		Collage c3=new Collage(102, "Pqr");
		
		hs.add(c1);
		hs.add(c2);
		hs.add(c3);
		
		Iterator<Collage> itr=hs.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
			
		}
		
		
		
		

	}

}
