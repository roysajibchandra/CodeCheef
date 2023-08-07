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
		    int K = timtim.nextInt();
		    int[] Ai = new int[N];
		    int avail=0, day=1;
		    for(int i=0; i<Ai.length; i++)
		    {
		        
		        Ai[i] = timtim.nextInt();
		        
		    }
		    boolean flag = true;
		    for(int i=0; i<N; i++)
		    {
		        avail += Ai[i];
		        if(avail>=K)
		        {
		            avail -= K;
		        }
		        else
		        {
		            day = i;
		            flag = false;
		            break;
		        }
		    }
		    if(flag)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO " + (day+1));
		    }
		        
		    
		}
	}
}
