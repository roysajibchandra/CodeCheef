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
		    for(int i=0; i<arr.length; i++)
		    {
		        arr[i] = timtim.nextInt();
		    }
		    int min = Integer.MAX_VALUE;
		    int max = Integer.MIN_VALUE;
		    Arrays.sort(arr);
		    int z=0;
		    for(int i=0; i<arr.length; i++)
		    {
		        min = 0;
		        max = 0;
		        for(int j=0; j<arr.length; j++)
		        {
		            if(arr[i]>=arr[j])
		            {
		                min++;
		            }
		            else
		            {
		                max++;
		            }
		        }
		        if(max<min)
		        {
		            z++;
		        }
		    }
		    System.out.println(z);
		}
	}
}
