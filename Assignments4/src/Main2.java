
public class Main2 {

	public static void main(String[] args) 
	{
		if(args.length != 2)
		{
			System.out.println("Expected 2 inputs");
			System.exit(-1);
		}
		int first=0, second=1;
		double quotient = 0.0;
		try {
			first = Integer.parseInt(args[0]);
			second = Integer.parseInt(args[1]);
		}
		catch(NumberFormatException n)
		{
			System.out.println("Non integer input provided");
			System.exit(-2);
		}
		
		if(second == 0)
		{
			System.out.println("Division by zero");
			System.exit(-3);
		}
		
		quotient = (double)first/(double)second;
		System.out.println("Quotient: " + quotient);
	}

}
