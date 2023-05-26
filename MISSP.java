/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0)
		{
		    int N = timtim.nextInt();
		    int arr[] = new int[N+1];
		    for(int i=0; i<N; i++)
		    {
		        arr[i] = timtim.nextInt();
		    }
		    
		    Arrays.sort(arr, 0, N);
		    
		    for(int i=0; i<=N; i+=2)
		    {
		        if(arr[i] != arr[i+1])
		        {
		            System.out.println(arr[i]);
		            break;
		        }
		    }
		}
	}
}
