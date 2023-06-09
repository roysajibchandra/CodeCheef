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
		    int N1 = timtim.nextInt(), N2 = timtim.nextInt();
		    int R1 = timtim.nextInt(), R2 = timtim.nextInt();
		    
		    if((Math.pow(N1, 2)/Math.pow(R1, 3))==(Math.pow(N2, 2)/Math.pow(R2, 3)))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
