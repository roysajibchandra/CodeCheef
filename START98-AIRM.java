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
		    int[] Ai = new int[N];
		    int[] Bi = new int[N];
		    int[] C = new int[1440];
		    
		    for(int k=0; k<N; k++)
		    {
		        Ai[k] = timtim.nextInt();
		        C[Ai[k]]++;
		    }
		    for(int k=0; k<N; k++)
		    {
		        Bi[k] = timtim.nextInt();
		        C[Bi[k]]++;
		    }
		    int count=0;
		    for(int i=0; i<1440; i++)
		    {
		        count = Math.max(count, C[i]);
		    }
		    System.out.println(count);
		}
	}
}
