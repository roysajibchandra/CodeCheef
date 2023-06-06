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
		    int[] arr = new int[N];
		    for(int i = 0; i<N; i++)
		    {
		        arr[i] = timtim.nextInt();
		    }
		    
		    Arrays.sort(arr);
		    
		    for(int i = N-1; i>=0; i-- )
		    {
		        if(arr[i] != arr[N-1])
		        {
		            System.out.println(arr[i] + arr[N-1]);
		            break;
		        }
		    }
		}
	}
}
