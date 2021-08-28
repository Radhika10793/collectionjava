//17 write a java program to join two linked lists

import java.util.*;
public class Excercise17{
	public static void main(String args[])
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("abc");
		l.add("bnb");
		l.add("bnb");
		System.out.println(l);
		
		LinkedList<String> l2=new LinkedList<String>();
		l.add("abc");
		l.add("bnb");
		l.add("bnb");
		System.out.println(l);
		
		LinkedList<String> l3=new LinkedList<String>();
		l3.addAll(l);
		l3.addAll(l2);
		System.out.println(l3);
	}
}