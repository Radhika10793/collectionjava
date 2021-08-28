//12. Write a Java program to extract a portion of a array list. 

import java.util.*;
public class Exampal12{
public static void main(String args[]){
List<String>l=new ArrayList<String>();
l.add("Ash");
l.add("Radhika");
l.add("Renuka");
l.add("Pooja");
System.out.println(l);
List<String> list=l.subList(0,3);
System.out.println(list);
}
}

