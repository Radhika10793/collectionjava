//7. Write a Java program to insert the specified element at the front of a linked list.  


import java.util.LinkedList;
public class Exercise7{
public static void main(String args[])
{
LinkedList<String>List=new LinkedList<String>();
List.add("Red");
List.add("green");
List.add("black");
System.out.println("original linked list:"+List);
List. offerFirst("pink");
System.out.println("final linked list"+List);
}
}
