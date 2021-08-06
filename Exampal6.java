//6.write a java program to remove the third element from a array 
import  java.util.*;
public class Exampal6
{
	public static void main(String args[])
	{
		List<String> l=new ArrayList<String>();
		l.add("Red");
		l.add("Blue");
		l.add("Green");
		l.add("white");
		System.out.println(l);
		l.remove(2);
		System.out.println("After removing third element"+l);
	}
}