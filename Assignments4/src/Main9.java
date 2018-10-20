import java.util.*;

class UserMainCode9
{
	public static int getAverageOfOdd(HashMap h)
	{
		int sum = 0;
		int numObj = 0;
		Set kSet = h.keySet();
		for(Object key : kSet)
		{
			if(Integer.parseInt(key.toString())%2 != 0)
			{
				sum += Integer.parseInt(h.get(key).toString());
				numObj++;
			}
		}
		
		int avg = sum/numObj;		
		
		return avg;
	}
}

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of entries");
		int num = in.nextInt();
		HashMap map = new HashMap();
		System.out.println("Enter the key then value");
		for(int i = 0; i < num; i++)
		{
			int key = in.nextInt();
			int val = in.nextInt();
			map.put(key, val);
		}
		
		int avg = UserMainCode9.getAverageOfOdd(map);
		
		System.out.println("Average of odd numbered keys: " + avg);
	}

}
