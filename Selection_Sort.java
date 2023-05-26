import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void SelectionSort(int arr[])
	{
		for(int turn=0; turn<arr.length-1; turn++)
		{
			int Minpos = turn;

			for(int i=turn + 1; i<arr.length; i++)
			{
				if(arr[Minpos] > arr[i])
				{
					Minpos = i;
				}
			}
			
				
			int temp = arr[Minpos];
			arr[Minpos] = arr[turn];
			arr[turn] = temp;
				
			
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
		SelectionSort(arr);
		Printarr(arr);
		

	}
}
