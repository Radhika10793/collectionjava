//9. Write a Java program to insert some elements at the specified position into a linked list. 
import java.util.LinkedList;
public class Exercise9{
public static void main(String args[])
{
LinkedList<String> List=new LinkedList<String>();
List.add("Red");
List.add("Green");
List.add("Black");
System.out.println("original linked list"+List);
LinkedList<String>newList=new LinkedList<String>();
newList.add("white");
newList.add("pink");
List.addAll(1,newList);
System.out.println("LinkedList"+List);
}
}
