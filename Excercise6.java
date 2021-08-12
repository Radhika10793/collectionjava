// 6. Write a Java program to insert elements into the linked list at the first and last position.  

import java.util.LinkedList;
public class Excercise6{
public static void main(String args[])
{
LinkedList<String> l_list=new LinkedList<String>();
l_list.add("Red");
l_list.add("Green");
l_list.add("Black");

System.out.println("original linked list:"+l_list);
l_list.addFirst("white");
l_list.addlast("pink");
System.out.println("Final linked list:" + l_list); 
}
}
