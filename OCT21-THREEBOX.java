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
		    int C = timtim.nextInt();
		    int D = timtim.nextInt();
		    
		    
		    if(A+B+C<=D)
		    {
		        System.out.println(1);
		    }
		    else if(A+B<=D || A+C<=D || B+C<=D)
		    {
		        System.out.println(2);
		    }
		    else
		    {
		        System.out.println(3);
		    }
		}
	}
}
