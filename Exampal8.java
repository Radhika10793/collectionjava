//8.write a java program to sort a given array list
import java.util.*;
public class Exampal8{
public static void main(String args[])
{
List<String>l=new ArrayList<String>();
l.add("Red");
l.add("Green");
l.add("pink");
l.add("black");
System.out.println(l);
Collections.sort(l);
System.out.println("list before sorting:"+l);
Collections.sort(l);
System.out.print("list after sorting:"+l);
}
}