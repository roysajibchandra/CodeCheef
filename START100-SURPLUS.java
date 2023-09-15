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
		    int B1 = timtim.nextInt();
		    int B2 = timtim.nextInt();
		    
		    int C = (A1-A2)+(B1-B2);
		    System.out.println(C<0? "YES":"NO");
		}
	}
}
