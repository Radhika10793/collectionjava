//3. Write a Java program to insert an element into the array list at the first position.  

import java.util.*;
public class Exampal3{
public static void main(String args[])
{
List<String> l=new  ArrayList<String>();
l.add("black");
l.add("white");
l.add("blue");
System.out.println(l);

l.add(0,"RED");
l.add(3,"pink");
System.out.println(l);
}
}
