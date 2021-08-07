//12 write a java program to extract a portion of a array list

import java.util.*;
public class Exampal12{
public static void main(String args[])
{
List<String> l=new ArrayList<String>();
l.add("Red");

l.add("blue");
l.add("white");
l.add("Black");
l.add("Orange");
System.out.println("original list"+l);
List<String>sub_list=l.subList(0,3);
System.out.println("list of element"+sub_list);
}
}

