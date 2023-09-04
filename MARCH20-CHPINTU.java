/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Scanner timtim = new Scanner(System.in);
    public static void solve()
    {
        		int T = timtim.nextInt();
		while(T-->0)
		{
		    int N = timtim.nextInt();
		    int M = timtim.nextInt();
		    int[] Fi = new int[N];
		    int[] Pi = new int[N];
		    for(int i=0; i<Fi.length; i++)
		    {
		        Fi[i] = timtim.nextInt();
		    }
		    for(int i=0; i<Pi.length; i++)
		    {
		        Pi[i] = timtim.nextInt();
		    }
		    
		    int price = Integer.MAX_VALUE;
		    
		    for(int i=1; i<=M; i++)
		    {
		        int sum=0, k=0;
		        for(int j=0; j<N; j++)
		        {
		            if(i==Fi[j])
		            {
		                sum+=Pi[j];
		                k=1;
		            }
		        }
		        if(price>sum && k==1)
		        {
		            price=sum;
		        }
		    }
		    System.out.println(price);
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		solve();

	}
}
