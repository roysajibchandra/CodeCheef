import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void subarrys(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			int start = i;
			for(int j=i; j<arr.length; j++)
			{
				int end = j;
				for(int k=start; k<=end; k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		int arr[] = new int[T];
		for(int i=0; i<T; i++)
		{
			arr[i] = timtim.nextInt();
		}
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		subarrys(arr);

	}
}
