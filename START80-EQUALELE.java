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
		    int[] Ai = new int[N+1];
		    for(int i=0; i<N; i++)
		    {
		        int A = timtim.nextInt();
		        Ai[A]++;
		    }
		    int sum=0;
		    
		    for(int k=0; k<N+1; k++)
		    {
		        if(Ai[k]>sum)
		        {
		            sum=Ai[k];
		        }
		    }
		    System.out.println(N-sum);
		}
	}
}
