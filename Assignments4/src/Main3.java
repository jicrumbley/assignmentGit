import java.util.*;

class sentSep 
{
	public static List<String> sepSent(String sentence)
	{
		List<String> list = new ArrayList<String>();
		
		StringTokenizer t = new StringTokenizer(sentence);
		
		while(t.hasMoreTokens())
			list.add(t.nextToken());
		
		Collections.sort(list, alph);
		
		return list;
	}
	
	static Comparator<String> alph = new Comparator<String>()
	{

		@Override
		public int compare(String arg0, String arg1) {
			if(arg0.length() < arg1.length())
				return -1;
			else if(arg0.length() > arg1.length())
				return 1;
			else
				return arg0.compareTo(arg1);
		}
		
	};

}

public class Main3 {

	public static void main(String[] args) 
	{
		String input = "This is a test input string that I wrote";
		List<String> output;
		
		output = sentSep.sepSent(input);
		
		for(int i = 0; i < output.size(); i++)
		{
			System.out.println(output.get(i));
		}
		

	}

}
