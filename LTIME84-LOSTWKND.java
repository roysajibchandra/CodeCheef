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
		    int A1 = timtim.nextInt();
		    int A2 = timtim.nextInt();
		    int A3 = timtim.nextInt();
		    int A4 = timtim.nextInt();
		    int A5 = timtim.nextInt();
		    int P = timtim.nextInt();
		    
		    int Hours = (A5+A4+A3+A2+A1)*P;
		    if(Hours<=24*5)
		    {
		        System.out.println("No");
		    }
		    else
		    {
		        System.out.println("Yes");
		    }
		}
	}
}
