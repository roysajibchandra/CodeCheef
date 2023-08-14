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
		    int X = timtim.nextInt();
		    String S = timtim.next();
		    int M = X;
		    int[] arr = new int[N+1];
		    
		    int count=0, count1=0;
		    
		    for(int i=0; i<N; i++)
		    {
		        if(S.charAt(i)=='R')
		        {
		            X++;
		            arr[i] = X;
		          //  count+=X;
		        }
		        else
		        {
		            X--;
		            arr[i] = X;
		          //  count-=count1;
		            
		        }
		    }
		    arr[N] = M;
		    Arrays.sort(arr);
		    for(int j=1; j<=N; j++)
		    {
		        if(arr[j]==arr[j-1])
		        {
		            count1++;
		        }
		    }
		    System.out.println(N+1-count1);
		    
		}
	}
}
