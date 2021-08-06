//4. write a java program to retrieve an element (at a spacified index)from a given array list


import java.util.*;
public class Exampal4{
public static void main(String args[])
{
List<String>l=new ArrayList<String>();
l.add("Red");
l.add("Green");
l.add("orange");
l.add("white");
l.add("black");
System.out.println(l);
String element=l.get(0);
System.out.println("First element:"+element);
element=l.get(2);
System.out.println("Thrid element:"+element);
}
}