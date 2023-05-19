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
		    int runs = 0;
		    int balls = 0;
		    int count = 0;
		    int N = timtim.nextInt();
		    for(int i=1; i<=N; i++)
		    {
		        int A = timtim.nextInt();
		        runs += A;
		        balls ++;
		        double Strikerate = ((double)runs / balls) * 100;
		        if(Strikerate == 100)
		        {
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		}
	}
}
