//4 write a java program to iterate a linked list in reverse order

import java.util.Iterator;
import java.util.LinkedList;
 class Exercise4 {
  public static void main(String[] args) {
    
     LinkedList<String> l_list = new LinkedList<String>();
	 l_list.add("Red");
          l_list.add("Green");
          l_list.add("Black");
          l_list.add("White");
          l_list.add("Pink");

Iterator <String> iterator = l_list.descendingIterator();

while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
}
}