//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list. 
import java.util.LinkedList;
import java.util.Iterator;
public class Exercise10
{
public static void main(String args[]){
LinkedList<String>List=new LinkedList<String>();
List.add("abc");
List.add("bca");
List.add("kjh");
List.add("pro");
System.out.println("original LinkedList"+List);
Object First_ele=List.getFirst();
System.out.println("first element is:"+First_ele);
Object Last_ele=List.getLast();
System.out.println("first element is:"+Last_ele);
 }
 }
 