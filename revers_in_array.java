import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void revers(int arr[])
	{
		int start = 0;
		int end = arr.length -1;

		while(start < end)
		{
			// swap
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
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
		
		revers(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
