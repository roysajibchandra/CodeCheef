import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void BubbleSort(int arr[])
	{
		for(int turn=0; turn<arr.length-1; turn++)
		{
			for(int i=0; i<arr.length-1-turn; i++)
			{
				if(arr[i]>arr[i+1])
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
			}
			
		}
	}
	public static void Printarr(int arr[])
	{
		for(int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
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
		BubbleSort(arr);
		Printarr(arr);
		

	}
}
