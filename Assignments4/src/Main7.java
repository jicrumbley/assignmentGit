import java.util.*;

class UserMainCode7
{
	public static int checkPalindrome(String input)
	{
		int output = -1;
		String c;
		String c1 = new String();
		boolean v1 = false, v2 = false, pal = true;
		for(int i = 0; i < input.length(); i++)
		{
			c = input.substring(i, i+1);
			if(c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") ||
					c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") ||
					c.equalsIgnoreCase("u"))
			{
				if(!v1)
				{
					v1 = true;
					c1 = c;
				}
				else
				{
					if(!c1.equals(c))
					{
						v2 = true;
					}
				}
			}
		}
		int l = input.length();
		if(input.substring(0, 1).equals(input.substring(l-1)))
		{
			for(int i = 1; i <= l/2; i++)
			{
				if(!input.substring(i, i+1).equals(input.substring(l-i-1, l-i)))
				{
					pal = false;
				}
			}
		}
		
		
		if(pal && v1 && v2)
			output = 1;
		
		return output;
		
	}
}

public class Main7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to check");
		String input = in.nextLine();
		
		int ret = UserMainCode7.checkPalindrome(input);
		
		if(ret == 1)
			System.out.println("Palendrome and two different vowels");
		else
			System.out.println("Not a palendrome or 1 or less vowels");
	}

}
