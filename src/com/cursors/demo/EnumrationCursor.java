package com.cursors.demo;

import java.util.Enumeration;
import java.util.Vector;

class Teacher
{
    int id;
    String name;
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
    
    
    

}
public class EnumrationCursor {

	public static void main(String[] args) {
		
            Vector<Teacher> v=new Vector<>();
            
            Teacher t=new Teacher(101, "Ritu");
            Teacher t1=new Teacher(101, "Rekha"); 
            Teacher t2=new Teacher(102, "Ritu");
            Teacher t3=new Teacher(103, "Ruchita");
            Teacher t4=new Teacher(104, "Chitali");
            
            v.add(t);
            v.add(t1);
            v.add(t2);
            v.add(t3);
            v.add(t4);
            
            Enumeration<Teacher> e1=v.elements();
            
            while(e1.hasMoreElements())
            {
            	System.out.println(e1.nextElement());
            }
            
	}

}
