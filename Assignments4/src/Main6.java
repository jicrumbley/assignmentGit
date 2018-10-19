import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class InvalidParameterException2 extends Exception
{

	public InvalidParameterException2(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}

class UserMainCode6
{
	public static String addDate(String date, int addAmt, char addPlace) throws InvalidParameterException2
	{
		if(date.length() != 10 || date.charAt(2) != '/' || date.charAt(5) != '/')
			throw new InvalidParameterException2("Input date must be in dd/mm/yyyy format");
		
		if(addAmt <= 0)
			throw new InvalidParameterException2("Add amount must be positive and greater than 0");
		
		if(addPlace != 'D' && addPlace != 'M' && addPlace != 'Y')
			throw new InvalidParameterException2("Add place must be D/M/Y");
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dIn = LocalDate.parse(date, format);
		
		if(addPlace == 'D')
			dIn = dIn.plusDays(addAmt);
		else if(addPlace == 'M')
			dIn = dIn.plusMonths(addAmt);
		else
			dIn = dIn.plusYears(addAmt);
		
		format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		dIn.format(format);
		
		String out = dIn.toString();
		
		return out;
	}
}

public class Main6 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter date, amount to add, place to add");
		String date = in.next();
		int addAmt = in.nextInt();
		char addPlace = in.next().charAt(0);
		String out = new String();
		
		try {
			out = UserMainCode6.addDate(date, addAmt, addPlace);
		}
		catch(InvalidParameterException2 i)
		{
			System.out.println(i.getMessage());
		}
		
		System.out.println(out);

	}

}
