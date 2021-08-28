//9. write a java program to copy one array list into another

import java. util.*;
public class Exampal9{
	public static void main(String args[])
	{
		List<String> list1=new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		list1.add("3");
		list1.add("4");
		
		System.out.println("list1"+list1);
		List<String> list2=new ArrayList<String>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		
		System.out.println("list2"+list2);
		
		Collections.copy(list1,list2);
		System.out.println("copy List to list2,\n After copy");
		System.out.println("list1"+list1);
		System.out.println("list2"+list2);
	}
}

		