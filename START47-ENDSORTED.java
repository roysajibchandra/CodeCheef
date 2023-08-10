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
		    int[] S = new int[N];
		    for(int i=0; i<S.length; i++)
		    {
		        S[i] = timtim.nextInt();
		    }
		    int p1=0, pn=0;
		    for(int j=0; j<N; j++)
		    {
		        if(S[j]==1)
		        {
		            p1=j;
		        }
		        if(S[j]==N)
		        {
		            pn=j;
		        }
		    }
		    int X = p1 + N - 1 -pn;
		    if(p1>pn)
		    {
		        X = X-1;
		    }
		    System.out.println(X);
		}
	}
}
