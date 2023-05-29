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
		    double B = timtim.nextInt();
		    double LS = timtim.nextInt();
		    
		    double min = Math.sqrt(Math.abs(B*B - LS*LS));
		    double max = Math.sqrt(B*B + LS*LS);
		    System.out.println(min + " " + max);
		}
	}
}
