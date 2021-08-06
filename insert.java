//write a java proram to insert  an element  into  the array list  at the first position
import java.util.*;
public class insert{
public static void main(String args[])
{
List<String> l=new ArrayList<String>();
l.add("Radhika");
l.add("Renuka");
l.add("Ash");
l.add("pooja");
System.out.println(l);
l.add(0,"sheetal");
l.add(4,"pallavi");
System.out.println(l);
}
}

