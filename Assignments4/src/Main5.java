import java.util.*;


class InvalidParameterException extends Exception
{

	public InvalidParameterException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
}

class Employee
{
	private int id;
	private String name;
	private double salary, commission;
	
	//constructor
	public Employee(int id, String name, double salary, double commission)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.commission = commission;
		
	}
	
	//setters
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setCommission(double commission)
	{
		this.commission = commission;
	}
	
	//getters
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public double getCommission()
	{
		return commission;
	}
	
	//other functions
	public static boolean compare(String field, Employee e1, String operator, Employee e2)
	throws InvalidParameterException
	{
		boolean result = false;
		
		if(!field.equals("id") && !field.equals("name") && !field.equals("salary") && !field.equals("commission"))
			throw new InvalidParameterException("Field is not valid");
		
		if(!operator.equals("<") && !operator.equals("<=") && !operator.equals(">") && !operator.equals(">=") && !operator.equals("==") && !operator.equals("!="))
			throw new InvalidParameterException("Operator is not valid");
		
		switch(field)
		{
		case "id":
			switch(operator)
			{
			case ">":
				if(e1.getId() > e2.getId())
					result = true;
				break;
			case ">=":
				if(e1.getId() >= e2.getId())
					result = true;
				break;
			case "<":
				if(e1.getId() < e2.getId())
					result = true;
				break;
			case "<=":
				if(e1.getId() <= e2.getId())
					result = true;
				break;
			case "==":
				if(e1.getId() == e2.getId())
					result = true;
				break;
			case "!=":
				if(e1.getId() != e2.getId())
					result = true;
				break;
			}
			break;
			
		case "name":
			switch(operator)
			{
			case ">":
				if(e1.getName().compareTo(e2.getName()) > 0)
					result = true;
				break;
			case ">=":
				if(e1.getName().compareTo(e2.getName()) >= 0)
					result = true;
				break;
			case "<":
				if(e1.getName().compareTo(e2.getName()) < 0)
					result = true;
				break;
			case "<=":
				if(e1.getName().compareTo(e2.getName()) <= 0)
					result = true;
				break;
			case "==":
				if(e1.getName().equals(e2.getName()))
					result = true;
				break;
			case "!=":
				if(!e1.getName().equals(e2.getName()))
					result = true;
				break;
			}
			break;
			
		case "salary":
			switch(operator)
			{
			case ">":
				if(e1.getSalary() > e2.getSalary())
					result = true;
				break;
			case ">=":
				if(e1.getSalary() >= e2.getSalary())
					result = true;
				break;
			case "<":
				if(e1.getSalary() < e2.getSalary())
					result = true;
				break;
			case "<=":
				if(e1.getSalary() <= e2.getSalary())
					result = true;
				break;
			case "==":
				if(e1.getSalary() == e2.getSalary())
					result = true;
				break;
			case "!=":
				if(e1.getSalary() != e2.getSalary())
					result = true;
				break;
			}
			break;
			
		case "commission":
			switch(operator)
			{
			case ">":
				if(e1.getCommission() > e2.getCommission())
					result = true;
				break;
			case ">=":
				if(e1.getCommission() >= e2.getCommission())
					result = true;
				break;
			case "<":
				if(e1.getCommission() < e2.getCommission())
					result = true;
				break;
			case "<=":
				if(e1.getCommission() <= e2.getCommission())
					result = true;
				break;
			case "==":
				if(e1.getCommission() == e2.getCommission())
					result = true;
				break;
			case "!=":
				if(e1.getCommission() != e2.getCommission())
					result = true;
				break;
			}
			break;
			
		}
		
		return result;
	}
}

public class Main5 {

	public static void main(String[] args) 
	{
		Employee a = new Employee(1, "Joe", 2000.0, .3);
		Employee b = new Employee(2, "Bill", 2000.0, .2);
		Employee c = new Employee(3, "Joe", 1900.0, .2);
		boolean out = true;
		try {
			out = Employee.compare("name", a, "==", c);
		}
		catch (InvalidParameterException ip)
		{
			System.out.println(ip.getMessage());
		}
		System.out.println(out);
	}

}
