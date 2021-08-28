//14. Write a Java program of swap two elements in an array list.  
import java.util.*;
public class Exampal14{
public static void main(String args[])
{
ArrayList<String>l=new ArrayList<String>();
l.add("Ash");
l.add("Radhika");
l.add("Renuka");
l.add("Pooja");
System.out.println("Array list before swap");
for(String a:l){
System.out.println(a);
}
Collections.swap(l,0,2);
System.out.println("Array listafter swap");
for(String b:l){
System.out.print(b);
}
}
}
