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
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int X = timtim.nextInt();
		    
		    System.out.println((A==B)||(Math.abs(A-B)%(2*X)==0)?"YES":"NO");
		}
	}
}
