//11. Write a Java program to display the elements and their positions in a linked list.
import java.util.LinkedList;
import java.util.Iterator;
public class Excercise11{
public static void main(String args[])
{
LinkedList<String> List=new LinkedList<String>();
List.add("Red");
List.add("Green");
List.add("Black");
List.add("pink");
System.out.println("original linked list:"+List);
for(int p=0;p<List.size();p++)
{
System.out.println("Element at index"+p+": "+List.get(p));
}
}
}