//11write a java program a extract a portion of a array list

import java.util.*;
public class Exampal11{
public static void main(String args[])
{
List<String>l=new ArrayList<String>();
l.add("Red");
l.add("blue");
l.add("Green");
l.add("white");
System.out.println("original list:"+l);
List<String>sub_List=l.subList(0,3);
System.out.print("list of first three element:"+sub_List);
}
}
