/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Scanner timtim = new Scanner(System.in);
    
    static void solve(int N)
    {
        int[] Ni = new int[N];
        for(int k=0; k<Ni.length; k++)
		    {
		        Ni[k] = timtim.nextInt();
		    }
		    int count=0;
		    if(Ni[0]!=Ni[1])
		    {
		        count++;
		    }
		    if(Ni[N-1]!=Ni[N-2])
		    {
		        count++;
		    }
		    
		    for(int i=1; i<N-1; i++)
		    {
		        if(Ni[i]!=Ni[i-1] || Ni[i]!=Ni[i+1])
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int T = timtim.nextInt();
		while(T-->0)
		{
		    int N = timtim.nextInt();
		    solve(N);
		    
		    
		}
	}
}
