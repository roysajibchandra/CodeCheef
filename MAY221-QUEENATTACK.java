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
		    int Y = timtim.nextInt();
		    int sum = N-1+N-1;
		    
		    sum += Math.min(Math.abs(X-1), Math.abs(Y-1));
		    sum += Math.min(Math.abs(X-1), Math.abs(Y-N));
		    sum += Math.min(Math.abs(X-N), Math.abs(Y-1));
		    sum += Math.min(Math.abs(X-N), Math.abs(Y-N));
		    
		    System.out.println(sum);
		}
	}
}
