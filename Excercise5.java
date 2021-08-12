//5 write a java program to insert the specified element at the specified position in the linked list


import java.util.LinkedList;
public class Excercise5{
public static void main(String args[]){
LinkedList <String> l_list=new LinkedList <String> ();
l_list.add("Red");
l_list.add("Grren");
l_list.add("white ");
l_list.add("pink");

System.out.println("original linked list:");
System.out.println("let add the yellow color after the red colour:"+l_list);
l_list.add(1,"yellow");
System.out.println("the linked list:"+l_list);
}

}