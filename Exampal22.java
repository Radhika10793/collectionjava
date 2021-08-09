//22 write a java  program  to print all the elements of a ArrayList  using the position of the  elements of ArrayList using the position of the elements
import java.util.*;
public class Exampal22{
	public static void main(String args[])
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		l.add("black");
		l.add("white");
		l.add("pink");
		System.out.println("\n oiginal array List"+l);
		System.out.println("\n print using index of an element:");
		int no_of_elements=l.size();
		for(int index=0;index < no_of_elements;index++)
			System.out.println(l.get(index));
	}
}