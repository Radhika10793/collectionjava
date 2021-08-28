//5 write a java program to update specific array element by given element

import java.util.*;
public class Exampal5{
public static void main(String args[])
{
List<String>l=new ArrayList<String>();
l.add("Red");
l.add("blue");
l.add("green");
l.add("black");

System.out.println(l);
l.set(2,"yellow");
System.out.println(l);
}
}