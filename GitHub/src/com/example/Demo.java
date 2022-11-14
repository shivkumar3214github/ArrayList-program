package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		ArrayList al =new ArrayList ();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
Iterator itr	=al.iterator();
 while(itr.hasNext()) {
	 System.out.println(itr.next());

	 
	 for(Object obj: al) {
		 System.out.println(obj);
	 }
 
 
 }
		

	}

}
