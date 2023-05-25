import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner timtim = new Scanner(System.in);
		int N = timtim.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)
		{
			arr[i] = timtim.nextInt();
		}
		int Smallest = Integer.MAX_VALUE;
		int Largest = Integer.MIN_VALUE;

		for(int j=0; j<arr.length; j++)
		{
			if(Smallest > arr[j])
			{
				// System.out.println("Smallest number is: " + Smallest);
				Smallest = arr[j];
			}
			if(Largest < arr[j])
			{
				Largest = arr[j];
			}
		}
		System.out.println("Smallest number is: " + Smallest);
		System.out.println("Largest number is: " + Largest);
	}
}
