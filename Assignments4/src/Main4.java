import java.util.*;

class intAdder
{
	public static List<Integer> intAdd(List<Integer> l1, List<Integer> l2)
	{
		int s1 = l1.size();
		int s2 = l2.size();
		List<Integer> result;
		
		if(s1 > s2)
		{
			result = new ArrayList<Integer>(s1);
			
			for(int i = 0; i < s2; i++)
			{
				result.add(l1.get(i) + l2.get(i));
			}
			for(int i = s2; i < s1; i++)
				result.add(l1.get(i));
		}
		else if(s2 > s1)
		{
			result = new ArrayList<Integer>(s2);
			for(int i = 0; i < s1; i++)
			{
				result.add(l1.get(i) + l2.get(i));
			}
			for(int i = s1; i < s2; i++)
				result.add(l2.get(i));
		}
		else
		{
			result = new ArrayList<Integer>(s1);
			for(int i = 0; i < s1; i++)
			{
				result.add(i, l1.get(i) + l2.get(i));
			}
			
		}
		
		
		return result;
	}
}

public class Main4 {

	public static void main(String[] args) 
	{
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		b.add(12);
		b.add(23);
		b.add(34);
		
		List<Integer> combo = intAdder.intAdd(a, b);
		
		for(int i = 0; i < combo.size(); i++)
			System.out.println(combo.get(i));
		System.out.println();
		
		combo = intAdder.intAdd(b, a);
		
		for(int i = 0; i < combo.size(); i++)
			System.out.println(combo.get(i));
		System.out.println();
		
		b.add(45);
		b.add(56);
		
		combo = intAdder.intAdd(b, a);
		
		for(int i = 0; i < combo.size(); i++)
			System.out.println(combo.get(i));
	}

}
