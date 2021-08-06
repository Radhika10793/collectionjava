//write a java program to iterate through all element in a array list
import java.util.*;
class iterator
{
public static void main(String args[])
{
ArrayList<String>list=new ArrayList<String>();
list.add("Radhika");
list.add("renuka");
list.add("Ram");
Iterator<String> itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}
