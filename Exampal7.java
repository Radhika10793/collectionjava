//7.write a java program to search an element in a array list
import java.util.*;
public class Exmapal7{
	public static void main(String args[])
	{
		List<String>l=new ArrayList<String>();
		l.add("Red");
		l.add("bue");
		l.add("Green");
		l.add("black");
		
		System.out.println(l);
		if(l.contains("Red"));
		{
		System.out.println("found the element");
		}
	else{
		System.out.println("There is no element");
	}
	}
}

