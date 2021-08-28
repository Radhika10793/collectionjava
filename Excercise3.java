//3 write a java program to iterate  through all element in a linked list starting  
import java.util.LinkedList;
import java.util.Iterator;
   class Exercise3 {
  public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
   
          l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");

   Iterator p = l_list.listIterator(1);

   
   while (p.hasNext()) {
   System.out.println(p.next());
   }
   }
}