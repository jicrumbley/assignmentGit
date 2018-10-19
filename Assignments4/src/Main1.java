
public class Main1 {

	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("No Input");
			System.exit(-1);
		}
		int numArgs = 0;
		try {
			numArgs = Integer.parseInt(args[0]);
		}
		catch(NumberFormatException n)
		{
			System.out.println("First argument should be an int");
			System.exit(-4);
			
		}
		if(numArgs <= 0)
		{
			System.out.println("First argument should be greater than 0");
			System.exit(-2);
		}
		if(numArgs+1 != args.length)
		{
			System.out.println("Insufficient inputs");
			System.exit(-3);
		}
		
		//filter through the numeric/nonnumeric inputs
		int numeric = 0, nonnumeric = 0;
		int intArr[] = new int[numArgs];
		int spot = 0;
		for(int i = 0; i < numArgs; i++)
		{
			try {
				intArr[spot] = Integer.parseInt(args[i+1]);
				numeric++;
				spot++;
			}
			catch (NumberFormatException n)
			{
				nonnumeric++;
				continue;
			}
		}
		double sum = 0, avg = 0;
		for(int i = 0; i < numeric; i++)
		{
			sum+= intArr[i];
		}
		avg = sum/numeric;
		
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		System.out.println("Numerical inputs: " + numeric);
		System.out.println("Non-numerical inputs: " + nonnumeric);
		
	}

}
