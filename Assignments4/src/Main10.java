import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class UserMainCode10
{
	public static ArrayList<Integer> sortMergedArray(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		ArrayList<Integer> out = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		temp.addAll(a);
		temp.addAll(b);
		
		Collections.sort(temp);
		
		out.add(temp.get(1));
		out.add(temp.get(5));
		out.add(temp.get(7));
		
		return out;
	}
}

public class Main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 5 integers");
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++)
		{
			a.add(in.nextInt());
		}
		
		System.out.println("Enter another 5 integers");
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++)
		{
			b.add(in.nextInt());
		}
		
		ArrayList<Integer> out = UserMainCode10.sortMergedArray(a, b);
		
		System.out.println("Second integer: " + out.get(0));
		System.out.println("Sixth integer: " + out.get(1));
		System.out.println("Eighth integer: " + out.get(2));
		
	}

}
