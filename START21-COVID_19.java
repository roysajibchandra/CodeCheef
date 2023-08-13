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
		    int M = timtim.nextInt();
		    
		    int count=0;
		    
		    for(int i=1; i<=N; i=i+2)
		    {
		        for(int j=1; j<=M; j=j+2)
		        {
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
