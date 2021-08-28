//17. Write a Java program to empty an array list.
import java.util.*;
  public class Exampal17 {
  public static void main(String[] args) {
          ArrayList<String> c1= new ArrayList<String>();
          c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println(c1);
          c1.removeAll(c1);
          System.out.println(c1);   
		  }
		  }
   }
}
