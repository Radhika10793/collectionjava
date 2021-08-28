//13write a java program to compare two array lists

import java.util.*;
  public class Exampal13{
	public static void main(String args[])
	{
		List<String>l=new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("blue");
		l.add("white");
		System.out.println("list of first array:"+l);
		List<String>l1=new ArrayList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("blue");
		l1.add("white");
		System.out.println("List of secound array:"+l1);
		if(l.equals (l1)==true)
		{
		System.out.println("Array list areequal");
		
		}
		else{
		System.out.println("Array list are not areequal");
		}
		}
	}