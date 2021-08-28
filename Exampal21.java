//21.  write a java program to replace  the second element  of a ArrayList with the specified element
import java.util.ArrayList;
public class Exampal21
{
	public static void main(String args[])
	{
		ArrayList <String> l=new ArrayList<String>();
		l.add("Red");
		l.add("Green");
		System.out.println("originl array list:"+l);
		String new_colour="white";
		l.set(1,new_colour);
		int num=l.size();
		System.out.println("replace secound eleent with white");
		for(int i=0;i<num;i++)
			System.out.println(l.get(i));
	}
}