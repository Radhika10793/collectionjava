//8. Write a Java program to insert the specified element at the end of a linked list. 


import java.util.LinkedList;
public class Exercise8  {
public static void main(String args[])
{
LinkedList<String> List=new LinkedList<String>();
List.add("Rd");
List.add("Green");
List.add("Black");
System.out.println("original linked List"+List);
List.offerLast("pink");
System.out.println("Final Linked List:"+List);
}
}
