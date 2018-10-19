import java.util.*;

class UserMainCode8
{
	public static int getSumOfInteresction(int sizeA, int[] a, int sizeB, int[] b)
	{
		int sum = 0;
		int[] elements;
		int numElements = 0;
		boolean add = true;
		if(sizeA > sizeB)
			elements = new int[sizeA];
		else
			elements = new int[sizeB];
		
		
		for(int i = 0; i < sizeA; i++)
		{
			for(int j = 0; j < sizeB; j++)
			{
				add = true;
				if(a[i] == b[j])
				{
					for(int k = 0; k < numElements; k++)
					{
						if(a[i] == elements[k])
							add = false;
					}
					
					if(add)
					{
						elements[numElements] = a[i];
						numElements++;
					}
				}
			}
		}
		
		for(int i = 0; i < numElements; i++)
		{
			sum += elements[i];
		}
		
		if(numElements == 0)
		{
			System.out.println("No common elements");
			return -1;
		}
		else
			return sum;
	}
}

public class Main8 {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array one");
		int sizeA = in.nextInt();
		int a[] = new int[sizeA];
		System.out.println("Enter the integers of array one");
		for(int i = 0; i < sizeA; i++)
			a[i] = in.nextInt();
		
		System.out.println("Enter the size of array two");
		int sizeB = in.nextInt();
		int b[] = new int[sizeB];
		System.out.println("Enter the integers of array two");
		for(int i = 0; i < sizeB; i++)
			b[i] = in.nextInt();
		
		int sum  = UserMainCode8.getSumOfInteresction(sizeA, a, sizeB, b);
		if(sum != -1)
			System.out.println("Sum: " + sum);

	}

}
